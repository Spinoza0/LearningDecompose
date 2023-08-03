package com.spinoza.learningdecompose.presentation.feature.main.home.team

import com.arkivanov.decompose.value.Value
import com.spinoza.learningdecompose.domain.model.Person

interface Team {

    val models: Value<Model>

    data class Model(val team: List<Person>)
}