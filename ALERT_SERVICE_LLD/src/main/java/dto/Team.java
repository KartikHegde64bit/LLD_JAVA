package dto;

import java.util.List;
import java.util.UUID;

public class Team {
    private String service;
    private String name;
    private String id;
    private List<Developer> developerList;


    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public List<Developer> getDeveloperList() {
        return developerList;
    }
    public void addDeveloper(Developer developer){
        this.developerList.add(developer);
    }
    public void setDeveloperList(List<Developer> developerList) {
        this.developerList = developerList;
    }

    public Team(String name, List<Developer> developers){
        this.name = name;
        this.developerList = developers;
        this.id = UUID.randomUUID().toString();
    }


}
