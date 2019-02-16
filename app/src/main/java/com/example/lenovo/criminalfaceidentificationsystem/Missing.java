package com.example.lenovo.criminalfaceidentificationsystem;

public class Missing {

    public String photo,name,dob,gender,last_seen,reason,desc,heignt,contact;


    public Missing() {
    }

    public Missing(String photo, String name, String dob, String gender, String last_seen, String reason, String desc, String heignt,String contact) {
        this.photo = photo;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.last_seen = last_seen;
        this.reason = reason;
        this.desc = desc;
        this.heignt = heignt;
        this.contact= contact;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLast_seen() {
        return last_seen;
    }

    public void setLast_seen(String last_seen) {
        this.last_seen = last_seen;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getHeignt() {
        return heignt;
    }

    public void setHeignt(String heignt) {
        this.heignt = heignt;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
