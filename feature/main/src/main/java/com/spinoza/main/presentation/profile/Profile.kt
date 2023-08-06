package com.spinoza.main.presentation.profile

import com.arkivanov.decompose.value.Value
import com.spinoza.main.domain.Person

interface Profile {

    val models: Value<Model>

    data class Model(val person: Person)
}