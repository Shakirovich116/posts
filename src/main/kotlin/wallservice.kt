object WallService {

    val posts = emptyArray<Post>()
    private var lastId = 0


    fun add(post: Post): Array<Post> {
        lastId ++
        val updatePost = post.copy(id= lastId)
        return posts
    }
    fun update(post: Post): Boolean {
        val vId = post.id
        for ((index, vpost) in posts.withIndex()) {
            if (vpost.id == vId) {
                posts[index] = post.copy(ownerId = posts[index].ownerId, date = posts[index].date)
                return true
            }
        }
        return false
    }


}