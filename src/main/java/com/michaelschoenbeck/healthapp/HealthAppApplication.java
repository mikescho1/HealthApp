package com.michaelschoenbeck.healthapp;

import com.michaelschoenbeck.healthapp.controllers.HeartBeatRecordController;
import com.michaelschoenbeck.healthapp.repositories.HeartBeatRecordRepo;
import com.michaelschoenbeck.healthapp.services.HeartBeatRecordSAXHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;

@SpringBootApplication
public class HealthAppApplication {



	private static HeartBeatRecordSAXHandler HeartBeatRecordSAXHandler;
	private static HeartBeatRecordRepo HeartBeatRecordRepo;

	public static void main(String[] args) throws ParserConfigurationException, SAXException {
		SpringApplication.run(HealthAppApplication.class, args);



	}

}
