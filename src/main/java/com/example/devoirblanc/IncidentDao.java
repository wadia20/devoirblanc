package com.example.devoirblanc;

import java.util.Set;

public interface IncidentDao {
    public void insertIncident(Incident incident);
    public void inserSet(Set<Incident> incidents);
}
