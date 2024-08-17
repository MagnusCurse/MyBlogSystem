package com.example.demo.scheduled.entity;

import lombok.Data;

import java.util.Date;

/**
 * This class only used to store the blog info for scheduled publishing
 * does not contain the complete blog detail
 */
@Data
public class ScheduledBlog {
    private Integer id;             // Unique identifier for the blog (primary key)
    private Integer userId;         // ID of the user who authored the blog (foreign key to the user table)
    private String content;         // The main content of the blog post
    private String title;           // The title of the blog post
    private Date updateTime;        // Timestamp of when the blog post was last updated
    private Date createTime;        // Timestamp of when the blog post was created
}
