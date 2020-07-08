package Infrastructure.Models;

import java.time.LocalDateTime;
import java.util.Date;

public class Appointment {
    private int appointmentId;
    private int customerId;
    private int userId;
    private String title;
    private String description;
    private String location;
    private String contact;
    private String type;
    private String url;
    private LocalDateTime start;
    private LocalDateTime end;
    private LocalDateTime createDate;
    private String createdBy;
    private LocalDateTime lastUpdate;
    private String lastUpdatedBy;

    public Appointment(int appointmentId, int customerId, int userId, String title, String description, String location,
                       String contact, String type, String url, LocalDateTime start, LocalDateTime end, LocalDateTime createDate, String createdBy,
                       LocalDateTime lastUpdate, String lastUpdatedBy) {
        this.appointmentId = appointmentId;
        this.customerId = customerId;
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.location = location;
        this.contact = contact;
        this.type = type;
        this.url = url;
        this.start = start;
        this.end = end;
        this.createDate = createDate;
        this.createdBy = createdBy;
        this.lastUpdate = lastUpdate;
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public int getAppointmentId() { return this.appointmentId; }
    public int getCustomerId() { return this.customerId; }
    public int getUserId() { return this.userId; }
    public String getTitle() { return this.title; }
    public String getDescription() { return this.description; }
    public String getLocation() { return this.location; }
    public String getContact() { return this.contact; }
    public String getType() { return this.type; }
    public String getUrl() { return this.url; }
    public LocalDateTime getStart() { return this.start; }
    public LocalDateTime getEnd() { return this.end; }
    public LocalDateTime getCreateDate() { return this.createDate; }
    public String getCreatedBy() { return this.createdBy; }
    public LocalDateTime getLastUpdate() { return this.lastUpdate; }
    public String getLastUpdatedBy() { return this.lastUpdatedBy; }

    public void setAppointmentId(int appointmentId){
        this.appointmentId = appointmentId;
    }

    public void setCustomerId(int customerId){
        this.customerId = customerId;
    }

    public void setUserId(int userId){
        this.userId = userId;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public void setContact(String contact){
        this.contact = contact;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setUrl(String url){
        this.url = url;
    }

    public void setStart(LocalDateTime start){
        this.start = start;
    }

    public void setEnd(LocalDateTime end){
        this.end = end;
    }

    public void setCreateDate(LocalDateTime createDate){
        this.createDate = createDate;
    }

    public void setCreatedBy(String createdBy){
        this.createdBy = createdBy;
    }

    public void setLastUpdate(LocalDateTime lastUpdate){
        this.lastUpdate = lastUpdate;
    }

    public void setLastUpdatedBy(String lastUpdatedBy){
        this.lastUpdatedBy = lastUpdatedBy;
    }
}
