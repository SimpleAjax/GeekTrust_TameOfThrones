package models;

public abstract class Kingdom {
    private final String emblem;

    public Kingdom(String emblem) {
        this.emblem = emblem;
    }

    public String getEmblem() {
        return emblem;
    }
}
