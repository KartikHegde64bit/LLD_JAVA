package Services;

import dto.Alert;
import enums.SEVERITY;

import java.util.*;

/**
 * For the sake of the problem, this class will produce and receive the alerts
 */

public class AlertReceptionService {
    private List<String> teams;
    private List<SEVERITY> severities = new ArrayList<SEVERITY>();
    private Map<String, Integer> lastTeamAlertTimeMap;
    private AlertRoutingService alertRoutingService;
    private final List<String> messages = List.of("Alert: the system resource consumption is 90%",
            "Alert: failed to batch the data", "Alert: Memory leakage issue");

    public AlertReceptionService(List<String> teams, AlertRoutingService alertRoutingService){
        this.teams = teams;
        this.severities = List.of(SEVERITY.LOW, SEVERITY.HIGH, SEVERITY.MEDIUM);
        this.lastTeamAlertTimeMap = new HashMap<String, Integer>();
        this.alertRoutingService = alertRoutingService;
    }

    /*
    Method to produce the alerts
     */

    public List<Alert> produceAlerts(Integer numberOfAlerts){
        List<Alert> alertList = new ArrayList<Alert>();
        Random random = new Random();

        Integer createdTime = 0;
        for(int i=0; i < numberOfAlerts; i++){
            Integer teamIndex = random.nextInt(teams.size());
            Integer sevIndex = random.nextInt(severities.size());
            Integer msgIndex = random.nextInt(messages.size());

            String team = teams.get(teamIndex);
            SEVERITY severity = severities.get(sevIndex);

            String message = messages.get(msgIndex);
            Alert newAlert = new Alert(team, severity, createdTime++, message);
            alertList.add(newAlert);
        }
        return alertList;
    }


    public void recieveAlerts(List<Alert> alerts){
        for(Alert alert: alerts){
            // this will avoid the duplicate alerts within 10 second or whatever the time limit
            if (!lastTeamAlertTimeMap.containsKey(alert.getTeam()) ||
                    alert.getCreatedTime() - lastTeamAlertTimeMap.get(alert.getTeam()) > 10) {
                lastTeamAlertTimeMap.put(alert.getTeam(), alert.getCreatedTime());
                alertRoutingService.routeAlert(alert);
            }
        }
    }

}
