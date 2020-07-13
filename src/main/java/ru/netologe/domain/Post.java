package ru.netologe.domain;

import java.util.List;

public class Post {

    private String id;
    private String authorId;
    private String title;
    private int date;
    private int time;
    private String text;
    private List<String> likesAuthorsIds;
    private List<String> commentsIds;
    private List<String> repostsAuthorsIds;
    private int vews;
}