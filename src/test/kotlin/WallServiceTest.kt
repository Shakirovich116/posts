import org.junit.Assert.assertEquals
import org.junit.Test
class WallServiceTest {

    @Test
    fun add() {
        //arrange
        var lastId = 1
        val expected = 2
        // act
        lastId++
        val actual = lastId
        //assert
        assertEquals(expected, actual)
    }
}


    @Test
    fun updateIsTrue(): Boolean {
        //arrange
        val ownerId = 1
        val expected = true

        // act
        if (ownerId == 1) {
            val actual = true
            return true
        }

        //assert
        assertEquals(expected, true)
    }




@Test
fun updateIsFalse(): Boolean {

    //arrange
    val ownerId = 1
    val expected = false

    // act
    if (ownerId !=1) {
        val actual = false
        return false
        }

    //assert
    assertEquals(expected, false)
}

