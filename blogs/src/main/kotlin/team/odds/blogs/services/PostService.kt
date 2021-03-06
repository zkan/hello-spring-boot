package team.odds.blogs.services

import org.springframework.core.ParameterizedTypeReference
import org.springframework.http.HttpMethod
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import team.odds.blogs.models.Post

inline fun <reified T: Any> typeRef(): ParameterizedTypeReference<T> = object: ParameterizedTypeReference<T>(){}

@Service
class PostService {
    fun getPosts(): List<Post>? {
        val url = "https://jsonplaceholder.typicode.com/posts"
        val restTemplate = RestTemplate()
        val entity = restTemplate.exchange(url, HttpMethod.GET, null, typeRef<List<Post>>())
        return entity.body
    }
}