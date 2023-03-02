package com.example.springbootapplication;

import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class CourseController {
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course( 1, "AWS", "Kunal" ),
                new Course( 2, "Deep Learning", "Prusty" );
        )
    }
}
