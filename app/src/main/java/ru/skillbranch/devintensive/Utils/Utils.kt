package ru.skillbranch.devintensive.Utils

object Utils {
    fun parseFullName(FullName: String?) : Pair<String?, String?> {

        val parts : List<String>? = FullName?.split(" ")

        val firstName =parts?.getOrNull(0)
        val lastName =parts?.getOrNull(1)
        return Pair(firstName, lastName)
    }
}