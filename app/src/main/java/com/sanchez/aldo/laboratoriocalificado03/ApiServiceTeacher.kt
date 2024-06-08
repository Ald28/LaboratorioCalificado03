package com.sanchez.aldo.laboratoriocalificado03

import retrofit2.http.GET

interface ApiServiceTeacher {
    @GET("list/teacher-b")
    suspend fun getTeachers(): TeacherResponse
}