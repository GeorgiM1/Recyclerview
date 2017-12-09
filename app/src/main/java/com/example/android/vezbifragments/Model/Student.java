package com.example.android.vezbifragments.Model;

/**
 * Created by pc on 12/9/2017.
 */

public class Student {
    public String sName;
    public boolean sOnline;
    public String url;

    public Student(String sName, boolean sOnline, String url) {
        this.sName = sName;
        this.sOnline = sOnline;
        this.url = url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String getsName() {
        return sName;
    }

    public boolean issOnline() {
        return sOnline;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setsOnline(boolean sOnline) {
        this.sOnline = sOnline;
    }
}
