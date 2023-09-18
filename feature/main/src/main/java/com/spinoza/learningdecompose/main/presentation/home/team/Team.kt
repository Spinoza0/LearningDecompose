package com.spinoza.learningdecompose.main.presentation.home.team

import com.arkivanov.decompose.value.Value

interface Team {

    val models: Value<Model>

    data class Model(val team: List<com.spinoza.learningdecompose.main.domain.Person>)
}