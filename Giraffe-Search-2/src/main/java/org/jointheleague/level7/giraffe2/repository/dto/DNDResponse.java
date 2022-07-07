
package org.jointheleague.api.giraffe.Giraffe.Search.repository.dto;

import java.util.HashMap;
import java.util.List;
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
<<<<<<< Updated upstream:Giraffe-Search-2/src/main/java/org/jointheleague/level7/giraffe2/repository/dto/Result.java
        "name",
        "desc",
        "higher_level",
        "range",
        "components",
        "material",
        "ritual",
        "duration",
        "concentration",
        "casting_time",
        "level",
        "attack_type",
        "damage",
        "school",
        "classes"
=======
    "_id",
    "index",
    "name",
    "desc",
    "higher_level",
    "range",
    "components",
    "material",
    "ritual",
    "duration",
    "concentration",
    "casting_time",
    "level",
    "damage",
    "dc",
    "area_of_effect",
    "school",
    "classes",
    "subclasses",
    "url"
>>>>>>> Stashed changes:Giraffe-Search-2/src/main/java/org/jointheleague/level7/giraffe2/repository/dto/DNDResponse.java
})
@Generated("jsonschema2pojo")
public class DNDResponse {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("index")
    private String index;
    @JsonProperty("name")
    private String name;
    @JsonProperty("desc")
    private List<String> desc = null;
    @JsonProperty("higher_level")
    private List<String> higherLevel = null;
    @JsonProperty("range")
    private String range;
    @JsonProperty("components")
    private List<String> components = null;
    @JsonProperty("material")
    private String material;
    @JsonProperty("ritual")
    private Boolean ritual;
    @JsonProperty("duration")
    private String duration;
    @JsonProperty("concentration")
    private Boolean concentration;
    @JsonProperty("casting_time")
    private String castingTime;
    @JsonProperty("level")
    private Integer level;
    @JsonProperty("damage")
    private Damage damage;
    @JsonProperty("dc")
    private Dc dc;
    @JsonProperty("area_of_effect")
    private AreaOfEffect areaOfEffect;
    @JsonProperty("school")
    private School school;
    @JsonProperty("classes")
    private List<Class> classes = null;
<<<<<<< Updated upstream:Giraffe-Search-2/src/main/java/org/jointheleague/level7/giraffe2/repository/dto/Result.java
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  //custom variables
    private String title;
    private String subtitle;
    private String bodyText;
=======
    @JsonProperty("subclasses")
    private List<Subclass> subclasses = null;
    @JsonProperty("url")
    private String url;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }
>>>>>>> Stashed changes:Giraffe-Search-2/src/main/java/org/jointheleague/level7/giraffe2/repository/dto/DNDResponse.java

    @JsonProperty("index")
    public String getIndex() {
        return index;
    }

    @JsonProperty("index")
    public void setIndex(String index) {
        this.index = index;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("desc")
    public List<String> getDesc() {
        return desc;
    }

    @JsonProperty("desc")
    public void setDesc(List<String> desc) {
        this.desc = desc;
    }

    @JsonProperty("higher_level")
    public List<String> getHigherLevel() {
        return higherLevel;
    }

    @JsonProperty("higher_level")
    public void setHigherLevel(List<String> higherLevel) {
        this.higherLevel = higherLevel;
    }

    @JsonProperty("range")
    public String getRange() {
        return range;
    }

    @JsonProperty("range")
    public void setRange(String range) {
        this.range = range;
    }

    @JsonProperty("components")
    public List<String> getComponents() {
        return components;
    }

    @JsonProperty("components")
    public void setComponents(List<String> components) {
        this.components = components;
    }

    @JsonProperty("material")
    public String getMaterial() {
        return material;
    }

    @JsonProperty("material")
    public void setMaterial(String material) {
        this.material = material;
    }

    @JsonProperty("ritual")
    public Boolean getRitual() {
        return ritual;
    }

    @JsonProperty("ritual")
    public void setRitual(Boolean ritual) {
        this.ritual = ritual;
    }

    @JsonProperty("duration")
    public String getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(String duration) {
        this.duration = duration;
    }

    @JsonProperty("concentration")
    public Boolean getConcentration() {
        return concentration;
    }

    @JsonProperty("concentration")
    public void setConcentration(Boolean concentration) {
        this.concentration = concentration;
    }

    @JsonProperty("casting_time")
    public String getCastingTime() {
        return castingTime;
    }

    @JsonProperty("casting_time")
    public void setCastingTime(String castingTime) {
        this.castingTime = castingTime;
    }

    @JsonProperty("level")
    public Integer getLevel() {
        return level;
    }

    @JsonProperty("level")
    public void setLevel(Integer level) {
        this.level = level;
    }

    @JsonProperty("damage")
    public Damage getDamage() {
        return damage;
    }

    @JsonProperty("damage")
    public void setDamage(Damage damage) {
        this.damage = damage;
    }

    @JsonProperty("dc")
    public Dc getDc() {
        return dc;
    }

    @JsonProperty("dc")
    public void setDc(Dc dc) {
        this.dc = dc;
    }

    @JsonProperty("area_of_effect")
    public AreaOfEffect getAreaOfEffect() {
        return areaOfEffect;
    }

    @JsonProperty("area_of_effect")
    public void setAreaOfEffect(AreaOfEffect areaOfEffect) {
        this.areaOfEffect = areaOfEffect;
    }

    @JsonProperty("school")
    public School getSchool() {
        return school;
    }

    @JsonProperty("school")
    public void setSchool(School school) {
        this.school = school;
    }

    @JsonProperty("classes")
    public List<Class> getClasses() {
        return classes;
<<<<<<< Updated upstream:Giraffe-Search-2/src/main/java/org/jointheleague/level7/giraffe2/repository/dto/Result.java
    }

    @JsonProperty("classes")
    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
=======
>>>>>>> Stashed changes:Giraffe-Search-2/src/main/java/org/jointheleague/level7/giraffe2/repository/dto/DNDResponse.java
    }

    @JsonProperty("classes")
    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

<<<<<<< Updated upstream:Giraffe-Search-2/src/main/java/org/jointheleague/level7/giraffe2/repository/dto/Result.java
    //custom methods
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return getName();
    }

    public String setSubtitle() {
       String sub="";
       int i=getLevel();

       sub+=i;
       if(i==1) {
         sub+="st";
       }else if(i==2){
           sub+="nd";
       }else if(i==3){
           sub+="rd";
       }else{
           sub+="th";
       }
       sub+=" Level";
       sub+=getSchool().getName();

       sub+="\n Components: ";
       for(int j=0; j<getComponents().size(); j++){
           sub+=getComponents().get(j)+" ";
       }
       if(getComponents().contains("M")){
           sub+=getMaterial()+" ";
       }

        if(getRange() != null){
            sub+="\n Range: "+getRange();
        }

        if(getRitual()==true){
           sub+="\n (Can be cast as a Ritual)";
       }

        return sub;
=======
    @JsonProperty("subclasses")
    public List<Subclass> getSubclasses() {
        return subclasses;
    }

    @JsonProperty("subclasses")
    public void setSubclasses(List<Subclass> subclasses) {
        this.subclasses = subclasses;
>>>>>>> Stashed changes:Giraffe-Search-2/src/main/java/org/jointheleague/level7/giraffe2/repository/dto/DNDResponse.java
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

<<<<<<< Updated upstream:Giraffe-Search-2/src/main/java/org/jointheleague/level7/giraffe2/repository/dto/Result.java
    public Result compileFinalResult() {
        Result result = new Result();
        result.setTitle(name);
        result.setSubtitle();
        result.getBodyText();
        return result;
=======
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
>>>>>>> Stashed changes:Giraffe-Search-2/src/main/java/org/jointheleague/level7/giraffe2/repository/dto/DNDResponse.java
    }

}
