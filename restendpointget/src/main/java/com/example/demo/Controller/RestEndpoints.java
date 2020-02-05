package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;


@RestController
public class RestEndpoints {

    @RequestMapping("/course")
    public Course getEndpoint(@RequestParam(value="name", defaultValue = "Spring Boot", required = false) String name,
                              @RequestParam(value="chapterCount", defaultValue = "2", required = false) int chapterCount ){
        return new Course(name,chapterCount);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/register/course")
    public String saveCourse(@RequestBody Course course){
        return "Your course named "+ course.getName() + " with " + course.getChapterCount() + " chapters saved successfuly.";
    }
}
