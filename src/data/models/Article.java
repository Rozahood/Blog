package data.models;

import java.time.LocalDateTime;

public class Article {
    private int ID;
    private String title;
    private String body;
    private LocalDateTime timeCreated = LocalDateTime.now();
    private int author_ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDateTime getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(LocalDateTime timeCreated) {
        this.timeCreated = timeCreated;
    }

    public int getAuthor_ID() {
        return author_ID;
    }

    public void setAuthor_ID(int author_ID) {
        this.author_ID = author_ID;
    }
}
