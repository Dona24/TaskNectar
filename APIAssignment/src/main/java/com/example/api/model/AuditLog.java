package com.example.api.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class AuditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String endpoint;
    private String requestPayload;
    private String responsePayload;
    private String user;
    private LocalDateTime requestTime;

    // Constructors
    public AuditLog() {
    }

    public AuditLog(String endpoint, String requestPayload, String responsePayload, String user, LocalDateTime requestTime) {
        this.endpoint = endpoint;
        this.requestPayload = requestPayload;
        this.responsePayload = responsePayload;
        this.user = user;
        this.requestTime = requestTime;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getRequestPayload() {
        return requestPayload;
    }

    public void setRequestPayload(String requestPayload) {
        this.requestPayload = requestPayload;
    }

    public String getResponsePayload() {
        return responsePayload;
    }

    public void setResponsePayload(String responsePayload) {
        this.responsePayload = responsePayload;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public LocalDateTime getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(LocalDateTime requestTime) {
        this.requestTime = requestTime;
    }

    @Override
    public String toString() {
        return "AuditLog{" +
                "id=" + id +
                ", endpoint='" + endpoint + '\'' +
                ", requestPayload='" + requestPayload + '\'' +
                ", responsePayload='" + responsePayload + '\'' +
                ", user='" + user + '\'' +
                ", requestTime=" + requestTime +
                '}';
    }
}
