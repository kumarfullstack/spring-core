package com.beans.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(scopeName = "prototype")
@Component
public class Employee {

    private String eid;

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid='" + eid + '\'' +
                '}';
    }
}
