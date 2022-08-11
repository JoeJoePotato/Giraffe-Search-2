package org.jointheleague.level7.giraffe2.repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.ParseException;
import org.jointheleague.level7.giraffe2.repository.dto.DNDResponse;
import org.jointheleague.level7.giraffe2.repository.dto.LocResponse;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Locale;

@Repository
public class LocRepository {
    final ObjectMapper mapper = new ObjectMapper();
    private final WebClient webClient;

    private static final String baseUrl = "https://www.dnd5eapi.co/api/spells/";

    public LocRepository() {
        webClient = WebClient
                .builder()
                .baseUrl(baseUrl)
                .build();
    }

 public DNDResponse getResults(String query) throws JsonProcessingException {
        String tempMod = query.toLowerCase(Locale.ROOT).trim().replace(" ", "-");
        String extra = tempMod;
        System.out.println(baseUrl + extra);

     String s= webClient.get()
             .uri(uriBuilder -> uriBuilder
                     .path(extra)
                     .build()
             )
             .retrieve()
             .bodyToMono(String.class)
             .block();

        System.out.println(s);


/*DNDResponse r =new DNDResponse();
     JSONParser parser = new JSONParser(s);

     try {
         r = (DNDResponse) parser.parse();
     } catch(ParseException e) {
         e.printStackTrace();
     }
*/

       DNDResponse r=mapper.readValue(s, DNDResponse.class);
        /*= webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path(extra)
                        .build()
                )
                .retrieve()
                .bodyToMono(DNDResponse.class)
                .block();
        System.out.println(r.toString());*/
        return r;
    }

}