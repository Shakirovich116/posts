object WallService {

    private val posts = emptyArray<Post>()
    private var lastId = 0
    private var ownerId = 0
    private var date = 0

    fun add(post: Post): Array<Post> {
        lastId ++
        val updatePost = post.copy(id= lastId)
        return posts
    }

    fun update( post: Post): Any {
       for( (index) in posts.withIndex()){
           if (index == post.id)
               posts[index] = post.copy(ownerId, date)
           return post

       }
        return false
    }

}