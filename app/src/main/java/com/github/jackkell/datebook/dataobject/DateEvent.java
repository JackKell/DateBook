package com.github.jackkell.datebook.dataobject;


public class DateEvent {
    public String name;
    public String body;

    private DateEvent() {}

    private DateEvent(String name, String body) {
        this.name = name;
        this.body = body;
    }
}
