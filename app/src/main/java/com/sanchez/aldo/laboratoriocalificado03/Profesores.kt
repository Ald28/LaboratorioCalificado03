package com.sanchez.aldo.laboratoriocalificado03

data class Teacher(
    val name: String,
    val last_name: String,
    val phone_number: String,
    val email: String,
    val image_url: String
)

data class TeacherResponse(
    val teachers: List<Teacher>
)