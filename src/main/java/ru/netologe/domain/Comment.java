package ru.netologe.domain;

import java.util.List;

public class Comment {

    private String id;
    private int count;
    private int canPost;
    private int groupsCanPost;
    private boolean canClose;
    private boolean canOpen;
    private String authorId;
    private String text;
    private List<String> likesAuthorsIds;
    private int date;
    private int time;
}