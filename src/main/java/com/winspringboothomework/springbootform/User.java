package com.winspringboothomework.springbootform;
 
import java.sql.Date;
 
public class User {
    private String name;
    private String email;
    private String note;
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    

    @Override
    public String toString() {
        return "User [birthday=" + birthday + ", email=" + email + ", name=" + name + ", note=" + note + "]";
    }
   
 }