package team.odds.blogs.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import team.odds.blogs.models.Post
import team.odds.blogs.services.PostService

@RestController
class BlogController {
    @GetMapping("/blogs")
    fun getBlogs(postService: PostService): List<Post>? {
        return postService.getPosts()
    }
}