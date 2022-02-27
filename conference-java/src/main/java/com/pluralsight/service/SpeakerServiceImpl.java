package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class SpeakerServiceImpl implements SpeakerService {
    
    private SpeakerRepository repository;

    public SpeakerServiceImpl(){
        System.out.println("SpeakerServiceImpl no args constructor");
    }
    
    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        System.out.println("SpeakerServiceImpl repository constructor");
        repository = speakerRepository;
    }

    public List<Speaker> findAll(){
        return repository.findAll();
    }

    @Autowired
    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl setter");
        this.repository = repository;
    }

    

}
