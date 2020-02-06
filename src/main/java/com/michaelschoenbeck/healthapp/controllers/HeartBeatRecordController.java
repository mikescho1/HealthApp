package com.michaelschoenbeck.healthapp.controllers;

import com.michaelschoenbeck.healthapp.models.HeartBeatRecord;
import com.michaelschoenbeck.healthapp.repositories.HeartBeatRecordRepo;
import com.michaelschoenbeck.healthapp.services.HeartBeatRecordSAXHandler;
import com.michaelschoenbeck.healthapp.services.HeartBeatRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.util.List;

public class HeartBeatRecordController {


    HeartBeatRecordSAXHandler heartBeatRecordSAXHandler;
    HeartBeatRecordRepo heartBeatRecordRepo;
    HeartBeatRecordService heartBeatRecordService;

    @Autowired
    public HeartBeatRecordController(HeartBeatRecordSAXHandler heartBeatRecordSAXHandler, HeartBeatRecordRepo heartBeatRecordRepo, HeartBeatRecordService heartBeatRecordService) {
        this.heartBeatRecordSAXHandler = heartBeatRecordSAXHandler;
        this.heartBeatRecordRepo = heartBeatRecordRepo;
        this.heartBeatRecordService = heartBeatRecordService;
    }

    public HeartBeatRecordController() {
    }

    @PostMapping
    public void readFile()  throws ParserConfigurationException, SAXException {
        try
        {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            heartBeatRecordSAXHandler = new HeartBeatRecordSAXHandler();
            saxParser.parse("/Users/michael/Dev/healthapp/docs/export.xml", heartBeatRecordSAXHandler);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        List<HeartBeatRecord> heartBeatRecordList = heartBeatRecordSAXHandler.getHeartBeatRecords();
        heartBeatRecordService.createHeartBeatRecord(heartBeatRecordList);
    }
}
