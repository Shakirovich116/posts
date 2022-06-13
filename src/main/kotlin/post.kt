
data class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Long,
    val createdBy: Long,
    val date: Int,
    val text: String,
    val replyOwnerId: Long,
    val replyPostId: Long,
    val friendsOnly: Int,
    val postType: String,
    val signerId: Long,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val postponedId:Int,
  )
class Comment(
    val ownerId: Int,
    val postId: Int,
    val fromGroup: Int = 0,
    val message: String,
    val replyToComment: Int,
    val stickerId: Int,
    val guid: String
)

class PostNotFoundException(message: String) : RuntimeException(message)
