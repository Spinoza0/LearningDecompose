package com.spinoza.learningdecompose.main.presentation.profile

import com.arkivanov.decompose.value.Value

interface Profile {

    val models: Value<Model>

    data class Model(val person: com.spinoza.learningdecompose.main.domain.Person)
}