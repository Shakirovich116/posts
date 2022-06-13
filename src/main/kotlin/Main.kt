fun main(){

    val origin = Post(1,
        23,
        2332,
        4343,
        545,
        "Привет",
        87,
        879,
        90,
        "Пока",
        45,
        true,
        false,
        false,
        false,
        true,
        true,
        25
    )


    WallService.add(origin)

    val comment = Comment(
        ownerId = 1,
        postId = 0,
        message = "Comment to the post",
        replyToComment = 0,
        stickerId = 0,
        guid = ""
    )

    WallService.createComment(comment)

}
