import org.junit.Assert.*
import org.junit.Test

    class WallServiceTest {

        val post = Post(
            id = 0,
            ownerId = 1,
            fromId = 1,
            createdBy = 1,
            date = 1234,
            text = "Text",
            replyOwnerId = 4,
            replyPostId = 5,
            friendsOnly = 56,
            postType = "post",
            signerId = 1,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            postponedId = 0
        )

        val comment = Comment(
                ownerId = 1,
                postId = 2,
                message = "Comment to the post",
                replyToComment = 0,
                stickerId = 0,
                guid = "")

        @Test
        fun addTest() {
            val service = WallService
            service.add(post.copy(text = "Text 2"))
            val testPost = post.copy(text = "New Text")
            val result = service.add(testPost)
            assertEquals(testPost.copy(id = 2), result)
        }

        @Test
        fun updateTest() {
            val service = WallService
            service.add(post)
            service.add(post.copy(text = "Text 2"))
            service.add(post.copy(text = "Text 3 "))
            val update = post.copy(id = 2, text = "Text 3")
            val result = service.update(update)
            assertTrue(result)
        }

        @Test
        fun updateNotValidTest() {
            val service = WallService
            service.add(post)
            service.add(post.copy(text = "Text 2"))
            service.add(post.copy(text = "Text 3 "))
            val update = post.copy(id = 100, text = "New Text")
            val result = service.update(update)
            assertFalse(result)
        }

        @Test(expected = PostNotFoundException::class)
        fun shouldThrowTest() {
            val service = WallService
            service.add(post)
            service.add(post.copy(text = "Text 2"))
            service.createComment(comment)
        }
    }
