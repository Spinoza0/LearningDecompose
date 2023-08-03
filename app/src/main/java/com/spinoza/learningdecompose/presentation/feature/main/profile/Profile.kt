package com.spinoza.learningdecompose.presentation.feature.main.profile

import com.arkivanov.decompose.value.Value
import com.spinoza.learningdecompose.domain.model.Person

interface Profile {

    val models: Value<Model>

    data class Model(val person: Person)
}