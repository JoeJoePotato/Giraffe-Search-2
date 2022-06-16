package org.jointheleague.level7.giraffe2.service;

import org.jointheleague.level7.giraffe2.repository.LocRepository;
import org.springframework.stereotype.Service;
import org.jointheleague.level7.giraffe2.repository.dto.Result;

@Service
public class LocService {

    private final LocRepository locRepository;

    public LocService(LocRepository locRepository) {
        this.locRepository = locRepository;
    }

    public String getResults(String query){
        return locRepository.getResults(query);
    }

}