package apiclasses.wow.community.boss;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Boss {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String urlSlug;
    private String description;
    private Integer zoneId;
    private boolean availableInNormalMode;
    private boolean availableInHeroicMode;
    private double health;
    private double heroicHealth;
    private Integer level;
    private Integer heroicLevel;
    private Integer journalId;
    private Npcs[] npcs;
    private Integer encounterFaction;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlSlug() {
        return urlSlug;
    }

    public void setUrlSlug(String urlSlug) {
        this.urlSlug = urlSlug;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getZoneId() {
        return zoneId;
    }

    public void setZoneId(Integer zoneId) {
        this.zoneId = zoneId;
    }

    public boolean isAvailableInNormalMode() {
        return availableInNormalMode;
    }

    public void setAvailableInNormalMode(boolean availableInNormalMode) {
        this.availableInNormalMode = availableInNormalMode;
    }

    public boolean isAvailableInHeroicMode() {
        return availableInHeroicMode;
    }

    public void setAvailableInHeroicMode(boolean availableInHeroicMode) {
        this.availableInHeroicMode = availableInHeroicMode;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getHeroicHealth() {
        return heroicHealth;
    }

    public void setHeroicHealth(double heroicHealth) {
        this.heroicHealth = heroicHealth;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getHeroicLevel() {
        return heroicLevel;
    }

    public void setHeroicLevel(Integer heroicLevel) {
        this.heroicLevel = heroicLevel;
    }

    public Integer getJournalId() {
        return journalId;
    }

    public void setJournalId(Integer journalId) {
        this.journalId = journalId;
    }

    public Npcs[] getNpcs() {
        return npcs;
    }

    public void setNpcs(Npcs[] npcs) {
        this.npcs = npcs;
    }

    public Integer getEncounterFaction() {
        return encounterFaction;
    }

    public void setEncounterFaction(Integer encounterFaction) {
        this.encounterFaction = encounterFaction;
    }


}
