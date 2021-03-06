package org.jointheleague.level7.giraffe2.repository;

import org.jointheleague.level7.giraffe2.repository.dto.LocResponse;
import org.jointheleague.level7.giraffe2.repository.dto.Result;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Locale;

@Repository
public class LocRepository {

    private final WebClient webClient;

    private static final String baseUrl = "https://www.dnd5eapi.co/api";

    public LocRepository() {
        webClient = WebClient
                .builder()
                .baseUrl(baseUrl)
                .build();
    }

    public Result getResults(String query) {
        String tempMod = query.toLowerCase(Locale.ROOT).trim().replace(" ", "-");
        String extra = "/spells/" + tempMod;
        System.out.println(extra);
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path(extra)
                        .build()
                ).retrieve()
                .bodyToMono(Result.class)
                .block()
                .compileFinalResult();
    }

}