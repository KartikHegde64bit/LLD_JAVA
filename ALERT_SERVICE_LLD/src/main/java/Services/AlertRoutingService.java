package Services;

import dto.Alert;
import dto.Developer;
import dto.Team;

public class AlertRoutingService {

    private AlertRoutingService alertRoutingService;
    private OncallService oncallService;
    private TeamManagementService teamManagementService;
    private NotificationService notificationService;

    public AlertRoutingService(OncallService oncallService, TeamManagementService teamManagementService, NotificationService notificationService){
        this.oncallService = oncallService;
        this.teamManagementService = teamManagementService;
        this.notificationService = notificationService;
    }

    public void routeAlert(Alert alert){
        // validate the team name
        String teamName = alert.getTeam();
        Team team = teamManagementService.getTeamMap().get(teamName);
        if(team == null){
            System.out.println("No such team exists");
            return;
        }
        Developer developer = oncallService.getOnCallDeveloper(teamName);
        if(developer == null){
            // to-do
            System.out.println("The oncall-developer doesn't exist for " + teamName + ". Routing to another developer");
            return;
        }

        notificationService.sendSlackAndSmsNotification(developer, alert);

    }
}
