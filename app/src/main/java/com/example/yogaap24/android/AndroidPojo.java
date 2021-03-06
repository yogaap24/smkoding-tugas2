package com.example.yogaap24.android;


public class AndroidPojo {

    private int picture;
    private String codename;
    private String version;
    private String initialRelease;
    private String screenshot;
    private String description;

    public AndroidPojo(int picture, String codename, String version, String initialRelease, String screenshot, String description) {
        this.picture = picture;
        this.codename = codename;
        this.version = version;
        this.initialRelease = initialRelease;
        this.screenshot = screenshot;
        this.description = description;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getInitialRelease() {
        return initialRelease;
    }

    public void setInitialRelease(String initialRelease) {
        this.initialRelease = initialRelease;
    }

    public String getScreenshot() {
        return screenshot;
    }

    public void setScreenshot(String screenshot) {
        this.screenshot = screenshot;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
