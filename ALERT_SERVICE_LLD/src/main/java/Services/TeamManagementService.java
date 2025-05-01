package Services;

import dto.Developer;
import dto.Team;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeamManagementService {

    private Map<String, Team> teamMap;
    private static TeamManagementService teamManagementService;

    public Map<String, Team> getTeamMap() {
        return teamMap;
    }
    public TeamManagementService(){
        this.teamMap = new HashMap<String, Team>();
    }
//    public static TeamManagementService getInstance(){
//        if(teamManagementService == null){
//            teamManagementService = new TeamManagementService();
//        }
//        return teamManagementService;
//    }

    public void createTeam(String name, List<Developer> developers){
        Team newTeam = new Team(name, developers);
        teamMap.put(newTeam.getName(), newTeam);
    }

    public void createTeams(List<String> teams){
        for(String team: teams){
            Team newTeam = new Team(team, new ArrayList<>());
            teamMap.put(newTeam.getName(), newTeam);
        }
    }

    public void addDeveloper(Developer developer, String teamName){
        Team team = teamMap.get(teamName);
        if(team == null){
            System.out.println("Team Not Found");
            return;
        }

        team.addDeveloper(developer);
        System.out.println(developer.getName() + " has been added to " + team.getName());
    }

}
