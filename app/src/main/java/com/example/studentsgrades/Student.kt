package com.example.studentsgrades

data class Student(
    val indexNumber: String,
    val firstName: String,
    val lastName: String,
    val averageGrade: Double,
    val yearOfStudy: Int

)

object StudentData {
    val students = listOf(
        Student("10001", "Jan", "Kowalski", 4.5, 1),
        Student("10002", "Anna", "Nowak", 3.8, 2),
        Student("10003", "Piotr", "Wiśniewski", 4.2, 3),
        Student("10004", "Maria", "Zielińska", 4.9, 4),
    )
}