
abstract class Attachment(val type: String)

data class AudioAttachment(
    val id: Int?,
    val ownerId: Int?,
    val artist: String?,
    val title: String?,
    val duration: Int?,
    val url: String?,
    val lyricsId: Int?,
    val albumId: Int?,
    val genreId: Int?,
    val date: Int?,
    val noSearch: Boolean?,
    val isHg: Boolean?,
    ): Attachment("Audio")

data class DocumentAttachment(
    val id: Int?,
    val ownerId: Int?,
    val title: String?,
    val size: Int?,
    val ext: String?,
    val url: String?,
    val date: Int?,
   ): Attachment("Documents")

data class PollAttachment(
    val id: Int?,
    val ownerId: Int?,
    val created: Int?,
    val question: String?,
    val votes: Int?,
    val anonymous: Boolean?,
    val multiple: Boolean?,
    val endDate: Int?,
    val closed: Boolean?,
    val isBoard: Boolean?,
    val canEdit: Boolean?,
    val canVote: Boolean?,
    val canReport: Boolean?,
    val canShare: Boolean?,
    val authorId: Int?,
    ): Attachment("Poll")


data class VideoAttachment(
    val id: Int?,
    val title: String?,
    val description: String?,
    val duration: Int?,
    val date: Int?,
    val addingDate: Int?,
    val views: Int?,
    val localViews: Int?,
    val comments: Int?,
    val player: String?,
    val platform: String?,
    val canAdd: Boolean?,
    val isPrivate: Boolean?,
    val accessKey: String?,
    val processing: Boolean?,
    val isFavorite: Boolean?,
    val canComment: Boolean?,
    val canEdit: Boolean?,
    val canLike: Boolean?,
    val canRepost: Boolean?,
    ) : Attachment("Video")

data class PhotoAttachment(
    val id: Int?,
    val albumId: Int?,
    val ownerId: Int?,
    val userId: Int?,
    val text: String?,
    val date: Int?,
    val width: Int?,
    val height: Int?,
    ): Attachment("Photo")



