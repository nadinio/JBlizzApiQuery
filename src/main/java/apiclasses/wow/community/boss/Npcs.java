package apiclasses.wow.community.boss;

public class Npcs {

    private Integer id;
    private String name;
    private String urlSlug;
    private Integer creatureDisplayId;


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

    public Integer getCreatureDisplayId() {
        return creatureDisplayId;
    }

    public void setCreatureDisplayId(Integer creatureDisplayId) {
        this.creatureDisplayId = creatureDisplayId;
    }


}
