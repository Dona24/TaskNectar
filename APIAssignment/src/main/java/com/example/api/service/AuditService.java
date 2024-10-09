package com.example.api.service;

import com.example.api.model.AuditLog;
import com.example.api.repository.AuditLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AuditService {
    @Autowired
    private AuditLogRepository auditLogRepository;

    public void logApiCall(String endpoint, String requestPayload, String responsePayload, String user) {
        AuditLog log = new AuditLog();
        log.setEndpoint(endpoint);
        log.setRequestPayload(requestPayload);
        log.setResponsePayload(responsePayload);
        log.setUser(user);
        log.setRequestTime(LocalDateTime.now());
        auditLogRepository.save(log);
    }
}
