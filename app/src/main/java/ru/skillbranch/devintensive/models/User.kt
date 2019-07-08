package ru.skillbranch.devintensive.models

import ru.skillbranch.devintensive.Utils.Utils
import java.util.*

class User (
    val id: String,
    var firstName: String?,
    var lastName: String?,
    var avatar: String?,
    var rating: Int = 0,
    var respect: Int = 0,
    val lastVisit: Date? = null,
    val isOnline: Boolean = false
) {
    constructor(id: String, firstName: String?, lastName: String?) : this(
        id = id,
        firstName = firstName,
        lastName = lastName,
        avatar = null
    )

    constructor(id: String) : this(id, "John","Doe")

    init {
        println("It's alive! ${if(lastName==="Doe") "His name id $firstName $lastName" else "and his name is $firstName $lastName" }")
    }

    fun printME() : Unit{
        println("""
          id: $id
          firstname: $firstName
          lastName: $lastName
          avatar: $avatar
          rating: $rating
          respect: $respect
          LastVisit: $lastVisit
          isOnline: $isOnline
        """.trimIndent())
    }
    companion object Factory {
        private var lastid : Int = -1
        fun makeUser (fullName:String?) : User{
            lastid++

            val (firstName, lastName) = Utils.parseFullName(fullName)

            return User(id= "$lastid", firstName = firstName, lastName = lastName)
        }
    }
}