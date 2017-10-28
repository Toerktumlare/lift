package se.andolf.api;

/**
 * @author Thomas on 2016-06-18.
 */
public class Equipment {

    private String id;
    private String name;

    public Equipment(String name) {
        this.name = name;
    }

    public Equipment(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
