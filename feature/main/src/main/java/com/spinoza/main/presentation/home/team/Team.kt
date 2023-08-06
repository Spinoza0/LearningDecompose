package com.spinoza.main.presentation.home.team

import com.arkivanov.decompose.value.Value
import com.spinoza.main.domain.Person

interface Team {

    val models: Value<Model>

    data class Model(val team: List<Person>)
}