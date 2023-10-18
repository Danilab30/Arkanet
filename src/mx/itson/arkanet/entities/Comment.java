/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.arkanet.entities;

import java.util.Date;
import java.util.List;

/**
 *
 * @author dani_
 */
public class Comment {

    private int likes;
    private int dislikes;
    private List<Comment> comment;
    private Date date;
    private User user;
    private String description;
    
    
    /**
     * @return the likes
     */
    public int getLikes() {
        return likes;
    }

    /**
     * @param likes the likes to set
     */
    public void setLikes(int likes) {
        this.likes = likes;
    }

    /**
     * @return the dislikes
     */
    public int getDislikes() {
        return dislikes;
    }

    /**
     * @param dislikes the dislikes to set
     */
    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    /**
     * @return the comment
     */
    public List<Comment> getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
    
}
