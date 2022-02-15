package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibrenateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {
    
    private SpeakerRepository repository = new HibrenateSpeakerRepositoryImpl();
    
    public List<Speaker> findAll(){
        return repository.findAll();
    }

}
