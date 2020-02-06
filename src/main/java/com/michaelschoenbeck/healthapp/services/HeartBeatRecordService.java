package com.michaelschoenbeck.healthapp.services;

import com.michaelschoenbeck.healthapp.controllers.HeartBeatRecordController;
import com.michaelschoenbeck.healthapp.models.HeartBeatRecord;
import com.michaelschoenbeck.healthapp.repositories.HeartBeatRecordRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeartBeatRecordService {

    private HeartBeatRecordRepo heartBeatRecordRepo;

    @Autowired
    public HeartBeatRecordService(HeartBeatRecordRepo heartBeatRecordRepo) {
        this.heartBeatRecordRepo = heartBeatRecordRepo;
    }

    public void createHeartBeatRecord (List<HeartBeatRecord> heartBeatRecordList)   {
        for(int i = 0; i < heartBeatRecordList.size(); i++) {
            heartBeatRecordRepo.save(heartBeatRecordList.get(i));
        }
    }

}
