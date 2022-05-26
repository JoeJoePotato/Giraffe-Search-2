package org.jointheleague.level7.giraffe2.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Locale;

@Repository
public class LocRepository {

    private final WebClient webClient;

    private static final String baseUrl = "https://www.dnd5eapi.co/api/";

    public LocRepository() {
        webClient = WebClient
                .builder()
                .baseUrl(baseUrl)
                .build();
    }

    public String getResults(String query) {
<<<<<<< Updated upstream
        String modified = query.trim().replace(' ', '-');
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path(modified)
=======
        String tempMod = query.toLowerCase(Locale.ROOT).trim().replace(" ", "-");
        System.out.println(baseUrl + "" + tempMod);
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .query("spells/" + tempMod)
>>>>>>> Stashed changes
                        .build()
                ).retrieve()
                .bodyToMono(String.class)
                .block();
    }

}