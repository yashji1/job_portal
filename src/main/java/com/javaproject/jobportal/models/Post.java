package com.javaproject.jobportal.models;

import java.util.Arrays;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "job_finder")
// we have to defined out colection to map our model with that collections 
public class Post {
    private String profile;
    private String desc;
    private String exp;
    private String techs[];

    public Post() {

    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getProfile() {
        return profile;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDes() {
        return desc;
    }

    public void exp(String exp) {
        this.exp = exp;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String[] getTEch() {
        return techs;
    }

    public void setTech(String[] techs) {
        this.techs = techs;
    }
    @Override
    public String toString() {
        return "Post{" +
               "profile='" + profile + '\'' +
               ", desc='" + desc + '\'' +
               ", exp='" + exp + '\'' +
               ", techs=" + Arrays.toString(techs) +
               '}';
    }

}
