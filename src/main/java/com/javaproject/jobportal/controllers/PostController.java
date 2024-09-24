package com.javaproject.jobportal.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.javaproject.jobportal.models.Post;
// here we import Post from models.

import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class PostController {

// Here we will call our interface of PostData 
@Autowired // for map it with that interface 
PostData data;
    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("https://www.google.com");
    }

    // Here we have this function to get all the posts by using @GetMapping("path")
    @GetMapping("/allposts")
    public List<Post> getAllDetails(){

        // For fetching data we will make a interface Post data to get all the details.
        return data.findAll();
    }
    // For Post Method we need to call @PostMapping("path")
    @PostMapping("/sendPost")
    public Post addPost(@RequestBody Post p){

        return data.save(p);
    }
    
}
