package com.maggie.countthis.model;

import java.time.Instant;
import java.util.List;

public class Subject{

private String title;

private String description;

private Instant beginning;

private List<Instant> occurances;


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Instant getBeginning() {
        return this.beginning;
    }

    public void setBeginning(Instant beginning) {
        this.beginning = beginning;
    }


    public List<Instant> getOccurances() {
        return this.occurances;
    }

    public void setOccurances(List<Instant> occurances) {
        this.occurances = occurances;
    }


}