object WallService {

    private val posts = emptyArray<Post>()
    private var lastId = 0

    fun add(post: Post): Int {
        lastId ++
        val updatePost = post.copy(id= lastId)
        return updatePost.id
    }

    fun update( post: Post): Any {
       for( (ownerId, item) in posts.withIndex()){
           if (item.id == post.id)
               posts[ownerId] = post
           return post.ownerId
           return true
       }
        return false
    }

}