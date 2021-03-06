package team.odds.blogs.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import team.odds.blogs.models.Post

@RestController
class BlogController {
    @GetMapping("/blogs")
    fun getBlogs(): List<Post> {
        val post1 = Post(1, 1, "Hello", "This is my body")
        val post2 = Post(2, 1, "Another Hello", "This is my another body")
        return listOf(post1, post2)
    }
}