
package org.jointheleague.level7.giraffe2.repository.dto;

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
import org.jointheleague.level7.giraffe2.repository.dto.Dc;
import org.jointheleague.level7.giraffe2.repository.dto.Damage;
import org.jointheleague.api.giraffe.Giraffe.Search.repository.dto.Classes;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
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
    private List<org.jointheleague.api.giraffe.Giraffe.Search.repository.dto.Classes> classes = null;


    //@JsonIgnore
    //private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    //custom variables
    private String title;
    private String subtitle;
    private String bodyText;

    @JsonProperty("subclasses")
    private List<Subclass> subclasses = null;
    @JsonProperty("url")
    private String url;

    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

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

    @JsonProperty("subclasses")
    public List<Subclass> getSubclasses() {
        return subclasses;
    }

    @JsonProperty("subclasses")
    public void setSubclasses(List<Subclass> subclasses) {
        this.subclasses = subclasses;
    }

    @JsonProperty("classes")
    public List<Classes> getClasses() {
        return classes;
    }

    @JsonProperty("classes")
    public void setClasses(List<Classes> classes) {
        this.classes = classes;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl (String url){
        this.url = url;
    }

   /* @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties () {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty (String name, Object value){
        this.additionalProperties.put(name, value);
    }
    */
}