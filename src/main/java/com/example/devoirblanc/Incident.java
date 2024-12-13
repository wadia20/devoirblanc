package com.example.devoirblanc;

import java.util.Date;
import java.util.List;

public class Incident {
    private int ref;
    private Date time;
    private String status;
    private List<Incident> incidents;
    public int getRef() {
        return ref;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
