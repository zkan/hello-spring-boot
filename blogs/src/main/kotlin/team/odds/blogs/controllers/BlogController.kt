package team.odds.blogs.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BlogController {
    @GetMapping("/blogs")
    fun getBlogs(): String {
        return "Hey, World!"
    }
}