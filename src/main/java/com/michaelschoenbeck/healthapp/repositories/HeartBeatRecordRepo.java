package com.michaelschoenbeck.healthapp.repositories;

import com.michaelschoenbeck.healthapp.models.HeartBeatRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeartBeatRecordRepo extends CrudRepository<HeartBeatRecord, Long> {



}
