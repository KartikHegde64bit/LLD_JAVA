package dto;

import enums.SEVERITY;

import java.util.UUID;

public class Alert {
    private String id;
    private String team;
    private SEVERITY severity;
    private Integer createdTime;
    private String message;

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public Integer getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Integer createdTime) {
        this.createdTime = createdTime;
    }

    public SEVERITY getSeverity() {
        return severity;
    }

    public void setSeverity(SEVERITY severity) {
        this.severity = severity;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getId() {
        return id;
    }

    public Alert(String team, SEVERITY severity, Integer createdTime, String message){
        this.id = UUID.randomUUID().toString();
        this.team = team;
        this.severity = severity;
        this.createdTime = createdTime;
        this.message = message;
    }
}
