package com.michaelschoenbeck.healthapp.models;
import javax.persistence.*;
import java.util.Date;


@Entity
public class HeartBeatRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Date startDate;
    private Integer beatsPerMinute;


    public HeartBeatRecord() {
    }

    public HeartBeatRecord(Date startDate, Integer beatsPerMinute) {
        this.startDate = startDate;
        this.beatsPerMinute = beatsPerMinute;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }


    public Integer getBeatsPerMinute() {
        return beatsPerMinute;
    }

    public void setBeatsPerMinute(Integer beatsPerMinute) {
        this.beatsPerMinute = beatsPerMinute;
    }

    @Override
    public String toString() {
        return "{Start Time : " + startDate + "}";
    }

}

