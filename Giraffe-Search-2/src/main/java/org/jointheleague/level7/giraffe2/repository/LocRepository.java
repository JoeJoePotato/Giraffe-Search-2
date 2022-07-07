package org.jointheleague.level7.giraffe2.repository;

import org.jointheleague.level7.giraffe2.repository.dto.LocResponse;
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

<<<<<<< Updated upstream
<<<<<<< Updated upstream
    public String getResults(String query) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .queryParam("fo", "json")
                        .queryParam("at", "results")
                        .queryParam("q", query)
=======
    public Result getResults(String query) {
        String tempMod = query.toLowerCase(Locale.ROOT).trim().replace(" ", "-");
        System.out.println(baseUrl + "" + tempMod);
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .query("spells/" + tempMod)
>>>>>>> Stashed changes
                        .build()
                ).retrieve()
                .bodyToMono(Result.class)
=======
    public LocResponse getResults(String query) {
        String tempMod = query.toLowerCase(Locale.ROOT).trim().replace(" ", "-");
        String extra = tempMod;
        System.out.println(baseUrl + extra);
        return webClient.get()
//                .uri(uriBuilder -> uriBuilder
//                        .path(extra)
//                        .build()
//                )
                .retrieve()
                .bodyToMono(LocResponse.class)
>>>>>>> Stashed changes
                .block();
    }

}