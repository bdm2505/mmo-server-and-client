package ru.lytvest.aeon

class Course {
    val left = mutableMapOf<String, Double>()
    val right = mutableMapOf<String, Double>()
    override fun toString(): String {
        return buildString {
            append("Left: | ")
            for((name, c) in left)
                append(name).append(" : ").append(c).append(" | ")
            append("\n")
            append("Right: | ")
            for((name, c) in right)
                append(name).append(" : ").append(c).append(" | ")
            append("\n")
        }
    }
}