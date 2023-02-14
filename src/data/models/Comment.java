package data.models;

import java.time.LocalDateTime;

public class Comment {
    private  int ID;
    private int article_ID;
    private int user_ID;
    private String comment;
    private LocalDateTime timeCreated = LocalDateTime.now();

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getArticle_ID() {
        return article_ID;
    }

    public void setArticle_ID(int article_ID) {
        this.article_ID = article_ID;
    }

    public int getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(int user_ID) {
        this.user_ID = user_ID;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
