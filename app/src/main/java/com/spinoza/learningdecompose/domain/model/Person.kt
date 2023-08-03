package com.spinoza.learningdecompose.domain.model

data class Person(
    val firstName: String,
    val lastName: String,
) {
    val fullName: String = "$firstName $lastName"
}