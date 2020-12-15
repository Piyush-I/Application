package com.example.Application.model;

public class RollDetails {
    private int rollId;
    private int permId;
    private String rollName;
    private String permName;

    public RollDetails(int rollId, int permId, String rollName, String permName) {
        this.rollId = rollId;
        this.permId = permId;
        this.rollName = rollName;
        this.permName = permName;
    }

    public int getRollId() {
        return rollId;
    }

    public void setRollId(int rollId) {
        this.rollId = rollId;
    }

    public int getPermId() {
        return permId;
    }

    public void setPermId(int permId) {
        this.permId = permId;
    }

    public String getRollName() {
        return rollName;
    }

    public void setRollName(String rollName) {
        this.rollName = rollName;
    }

    public String getPermName() {
        return permName;
    }

    public void setPermName(String permName) {
        this.permName = permName;
    }
}
