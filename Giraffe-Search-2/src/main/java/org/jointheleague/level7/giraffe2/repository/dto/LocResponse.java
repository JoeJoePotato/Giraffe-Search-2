
package org.jointheleague.level7.giraffe2.repository.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class LocResponse {

    private List<DNDResponse> results = null;

    @JsonProperty("results")
    public List<DNDResponse> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<DNDResponse> results) {
        this.results = results;
    }

}
