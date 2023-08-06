package com.spinoza.learningdecompose.main.domain

data class Person(
    val firstName: String,
    val lastName: String,
) {
    val fullName: String = "$firstName $lastName"
}