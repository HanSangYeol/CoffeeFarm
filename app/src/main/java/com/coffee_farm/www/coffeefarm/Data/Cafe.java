package com.coffee_farm.www.coffeefarm.Data;

import java.util.Date;

/**
 * Created by the on 2017-11-30.
 */

public class Cafe {
    private int id;
    private String representationImg; // 가게 대표이미지
    private String title; // 글 제목
    private String name; // 가게이름
    private String content; // 내용
    private String content_Img; // 이미지
    private String writer; // 작성자
    private Date created_at; // 작성일
    private int views; // 조회수

    public Cafe() {
    }

    public Cafe(int id, String representationImg, String title, String name, String content, String content_Img, String writer, Date created_at, int views) {
        this.id = id;
        this.representationImg = representationImg;
        this.title = title;
        this.name = name;
        this.content = content;
        this.content_Img = content_Img;
        this.writer = writer;
        this.created_at = created_at;
        this.views = views;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRepresentationImg() {
        return representationImg;
    }

    public void setRepresentationImg(String representationImg) {
        this.representationImg = representationImg;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent_Img() {
        return content_Img;
    }

    public void setContent_Img(String content_Img) {
        this.content_Img = content_Img;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
}
