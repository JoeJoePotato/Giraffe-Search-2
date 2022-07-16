package org.jointheleague.level7.giraffe2.service;

import org.jointheleague.level7.giraffe2.domain.Pojo;
import org.jointheleague.level7.giraffe2.repository.LocRepository;
import org.jointheleague.level7.giraffe2.repository.dto.LocResponse;

import org.springframework.stereotype.Service;

@Service
public class LocService {

    private final LocRepository locRepository;

    public LocService(LocRepository locRepository) {
        this.locRepository = locRepository;
    }

    public Pojo getResults(String query){
        LocResponse response = locRepository.getResults(query);
        System.out.println(response.getResults());
        return new Pojo (response);
    }

}