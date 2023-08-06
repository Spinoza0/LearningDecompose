package com.spinoza.featuremain.presentation.home.team

import com.arkivanov.decompose.value.Value
import com.spinoza.featuremain.domain.Person

interface Team {

    val models: Value<Model>

    data class Model(val team: List<Person>)
}