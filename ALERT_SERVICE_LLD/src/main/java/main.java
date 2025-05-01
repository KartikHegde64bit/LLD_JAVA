import Notification.SMSNotificationImpl;
import Notification.SlackNotificationImpl;
import Services.*;
import dto.Alert;
import dto.Developer;

import java.util.List;

public class main {
    public static void main(String[] args){
        // create all services
        TeamManagementService teamManagementService = new TeamManagementService();
        List<String> teams = List.of("YouTube" , "GPay", "GSearch", "GDrive");

        // create teams
        teamManagementService.createTeams(teams);

        // create developers
        Developer developer1 = new Developer("Kartik");
        Developer developer2 = new Developer("Vivek");

        // add developers
        teamManagementService.addDeveloper(developer1, "YouTube");
        teamManagementService.addDeveloper(developer2, "YouTube");

        // create oncall service
        OncallService oncallService = new OncallService();

        // set oncall developer
        oncallService.setOnCallDeveloper("YouTube", developer1);


        // create notification service
        NotificationService notficationService = new NotificationService(new SMSNotificationImpl(), new SlackNotificationImpl());
        AlertRoutingService alertRoutingService = new AlertRoutingService(oncallService, teamManagementService, notficationService);
        AlertReceptionService alertReceptionService = new AlertReceptionService(teams, alertRoutingService);

        List<Alert> alerts = alertReceptionService.produceAlerts(50);
        alertReceptionService.recieveAlerts(alerts);
    }
}
