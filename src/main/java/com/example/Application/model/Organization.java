package com.example.Application.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;

@Component
@Entity
public class Organization {
    @Id
    private int orgid;
    private String orgName;
    private String orgAddress;
    private int contact;

    public int getOrgid() {
        return orgid;
    }

    public void setOrgid(int orgid) {
        this.orgid = orgid;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgAddress() {
        return orgAddress;
    }

    public void setOrgAddress(String orgAddress) {
        this.orgAddress = orgAddress;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "orgid=" + orgid +
                ", orgName='" + orgName + '\'' +
                ", orgAddress='" + orgAddress + '\'' +
                ", contact=" + contact +
                '}';
    }
}
