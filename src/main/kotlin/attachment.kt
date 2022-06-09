
interface Attachment {
    val type: String
}
class Attachments {
    var attachments = emptyArray<Attachment>()

    fun add(attachment: Attachment): Attachment {
        attachments += attachment
        return attachments.last()
    }
}

class Audio(
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
    val isHg: Boolean?
)
class AudioAttachment(
    override val type: String = "Audio",
    val audio: Audio
    ): Attachment

class Document(
    val id: Int?,
    val ownerId: Int?,
    val title: String?,
    val size: Int?,
    val ext: String?,
    val url: String?,
    val date: Int?
    )
 class DocumentAttachment(
     override val type: String = "Document",
     val document: Document
 ) : Attachment
class Poll(
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
    val authorId: Int?
    )
class PollAttachment(
    override val type: String = "Poll",
    val poll: Poll
) : Attachment

class Video(
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
    val canRepost: Boolean?)
class VideoAttachment(
    override val type: String = "Video",
    val video: Video
) : Attachment

class Photo(
    val id: Int?,
    val albumId: Int?,
    val ownerId: Int?,
    val userId: Int?,
    val text: String?,
    val date: Int?,
    val width: Int?,
    val height: Int?
    )

class PhotoAttachment(
    override val type: String = "Photo",
    val photo: Photo
) : Attachment




