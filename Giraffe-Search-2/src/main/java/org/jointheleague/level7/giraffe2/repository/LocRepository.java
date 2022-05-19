package org.jointheleague.level7.giraffe2.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

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

    public String getResults(String query) {
        String modified = query.trim().replace(' ', '-');
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path(modified)
                        .build()
                ).retrieve()
                .bodyToMono(String.class)
                .block();
    }

}