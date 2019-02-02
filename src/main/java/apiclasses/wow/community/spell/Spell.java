package apiclasses.wow.community.spell;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;


@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Spell {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer spellId;
    private String name;
    private String icon;
    @Column(columnDefinition = "VARCHAR(512)")
    private String description;
    private String s_range;
    private String castTime;

    public Spell(){}

    public Spell(int id, String name, String icon, String description, String s_range, String castTime){
        this.id = id;
        this.spellId = id;
        this.name = name;
        this.icon = icon;
        this.description = description;
        this.s_range = s_range;
        this.castTime = castTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRange() {
        return s_range;
    }

    public void setRange(String s_range) {
        this.s_range = s_range;
    }

    public String getCastTime() {
        return castTime;
    }

    public void setCastTime(String castTime) {
        this.castTime = castTime;
    }

    public Integer getSpellId() {
        return spellId;
    }

    public void setSpellId(Integer spellId) {
        this.spellId = spellId;
    }

    @Override
    public String toString() {
        return "Spell{" +
                "id=" + id +
                ", name=" + name +
                ", icon=" + icon +
                ", description=" + description +
                ", range=" + s_range +
                ", castTime=" + castTime + "}";
    }
}
