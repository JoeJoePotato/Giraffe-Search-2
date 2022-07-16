package org.jointheleague.level7.giraffe2.repository;

import org.jointheleague.level7.giraffe2.repository.dto.DNDResponse;
import org.jointheleague.level7.giraffe2.repository.dto.LocResponse;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Locale;

@Repository
public class LocRepository {

    private final WebClient webClient;

    private static final String baseUrl = "https://www.dnd5eapi.co/api/spells/";

    public LocRepository() {
        webClient = WebClient
                .builder()
                .baseUrl(baseUrl)
                .build();
    }

 public LocResponse getResults(String query) {
        String tempMod = query.toLowerCase(Locale.ROOT).trim().replace(" ", "-");
        String extra = tempMod;
        System.out.println(baseUrl + extra);
        LocResponse r= webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path(extra)
                        .build()
                )
                .retrieve()
                .bodyToMono(LocResponse.class)
                .block();
        System.out.println(r.toString());
        return r;
    }

}