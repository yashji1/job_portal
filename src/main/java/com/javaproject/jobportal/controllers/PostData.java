package com.javaproject.jobportal.controllers;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javaproject.jobportal.models.Post;

//MongoRepository will take cate of all the crud operations 

// This repository we makeit in dependencies in pom.xml.
public interface PostData extends MongoRepository<Post,String>{
    
}