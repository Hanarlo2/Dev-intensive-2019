package ru.skillbranch.devintensive

import android.media.Image
import org.junit.Test

import org.junit.Assert.*
import ru.skillbranch.devintensive.models.*
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun test_Factory(){
 //      val user = User.makeUser("John Cena")
//        val user2 = User.makeUser("John WIck")
        val user3 = User.makeUser("John Wick")
    }

    @Test
    fun test_abstract_factory(){
        val user = User.makeUser("John Cena")
        val txtMessage = BaseMessage.makeMessage(user, Chat("0"), payload = "any text message", type = "text")
        val imgMessage = BaseMessage.makeMessage(user, Chat("0"), payload = "any text message", type = "image")
        println(txtMessage.formatMessage())
        println(imgMessage.formatMessage())
        }
    }
