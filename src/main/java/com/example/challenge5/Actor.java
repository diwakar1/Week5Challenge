package com.example.challenge5;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String description;



     private String firstCaption;



    private String secondCaption;


    private String headshot;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHeadshot() {
        return headshot;
    }

    public void setHeadshot(String headshot) {
        this.headshot = headshot;
    }

    public String getFirstCaption() {
        return firstCaption;
    }

    public void setFirstCaption(String firstCaption) {
        this.firstCaption = firstCaption;
    }

    public String getSecondCaption() {
        return secondCaption;
    }

    public void setSecondCaption(String secondCaption) {
        this.secondCaption = secondCaption;
    }
}

