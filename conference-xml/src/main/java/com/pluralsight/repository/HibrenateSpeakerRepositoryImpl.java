package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Speaker;

public class HibrenateSpeakerRepositoryImpl implements SpeakerRepository {
    
    public List<Speaker> findAll(){

        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Hugo");
        speaker.setLastName("Maury");

        speakers.add(speaker);

        return speakers;
    }

}
