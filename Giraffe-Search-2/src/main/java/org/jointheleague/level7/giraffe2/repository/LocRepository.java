package org.jointheleague.level7.giraffe2.repository;

import org.springframework.stereotype.Repository;

@Repository
public class LocRepository {

    public String getResults(String query){
        return "Searching for spells related to " + query;
    }

}