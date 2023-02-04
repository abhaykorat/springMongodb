package com.example.springMongodb.Models;

import org.springframework.data.annotation.Id;

public class Comment {
    @Id
    private String id;
    private String photoId;
    private String message;
    private String createdBy;

    public Comment(String id, String photoId, String message, String createdBy) {
        this.id = id;
        this.photoId = photoId;
        this.message = message;
        this.createdBy = createdBy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}
