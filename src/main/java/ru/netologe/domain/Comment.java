package ru.netologe.domain;

import java.util.List;

public class Comment {

    private String id;
    private String authorId;
    private String text;
    private List<String> likesAuthorsIds;
    private int date;
    private int time;
}