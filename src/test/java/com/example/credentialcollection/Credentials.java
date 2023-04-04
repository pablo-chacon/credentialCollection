package com.example.credentialcollection;


public class Credentials {

    private long id;
    private String content;

    public Credentials() {
        id = getId();
        content = getContent();
        this.id = setId(id);
        this.content =setContent(content);
    }

    public long getId() {
        return id;
    }

    public long setId(long id) {
        this.id = id;
        return id;
    }

    public String getContent() {
        return content;
    }

    public String setContent(String content) {
        this.content = content;
        return content;
    }

    @Override
    public String toString() {
        return "{email : " + id +
                "password : " + content + '\'' +
                '}';
    }
}
