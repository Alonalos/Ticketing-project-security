package com.cybertek.enums;

public enum Status {
    OPEN("open"),IN_PROGRESS("In Progress"),UAT_TEST("UAT Testing"),COMPLETE("Complete");

    private final String value;

    private Status(String value){
        this.value=value;
    }
    public String getValue(){
        return value;
    }
}
