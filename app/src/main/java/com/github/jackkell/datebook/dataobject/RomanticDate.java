package com.github.jackkell.datebook.dataobject;

public class RomanticDate {
    public String name;
    public String body;
    public String type;
    public String duration;
    public String cost;
    public String transportation;

    private RomanticDate() {}

    public RomanticDate(String name, String body, String type, String duration, String cost, String transportation) {
        this.name = name;
        this.body = body;
        this.type = type;
        this.duration = duration;
        this.cost = cost;
        this.transportation = transportation;
    }
}
