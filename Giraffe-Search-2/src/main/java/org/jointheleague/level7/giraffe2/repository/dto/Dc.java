
package org.jointheleague.api.giraffe.Giraffe.Search.repository.dto;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dc_type",
    "dc_success"
})
@Generated("jsonschema2pojo")
public class Dc {

    @JsonProperty("dc_type")
    private DcType dcType;
    @JsonProperty("dc_success")
    private String dcSuccess;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dc_type")
    public DcType getDcType() {
        return dcType;
    }

    @JsonProperty("dc_type")
    public void setDcType(DcType dcType) {
        this.dcType = dcType;
    }

    @JsonProperty("dc_success")
    public String getDcSuccess() {
        return dcSuccess;
    }

    @JsonProperty("dc_success")
    public void setDcSuccess(String dcSuccess) {
        this.dcSuccess = dcSuccess;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
