package team.odds.blogs.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import team.odds.blogs.models.Post

@RestController
class BlogController {
    @GetMapping("/blogs")
    fun getBlogs(): Post {
        val post = Post(1, 1, "Hello", "This is my body")
        return post
    }
}