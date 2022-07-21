package org.jointheleague.level7.giraffe2.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.jointheleague.level7.giraffe2.domain.Pojo;
import org.jointheleague.level7.giraffe2.repository.LocRepository;
import org.jointheleague.level7.giraffe2.repository.dto.LocResponse;
import org.jointheleague.level7.giraffe2.repository.dto.DNDResponse;

import org.springframework.stereotype.Service;

@Service
public class LocService {

    private final LocRepository locRepository;

    public LocService(LocRepository locRepository) {
        this.locRepository = locRepository;
    }

    public Pojo getResults(String query){
        DNDResponse response = null;
        try {
            response = locRepository.getResults(query);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return new Pojo (response);
    }

}