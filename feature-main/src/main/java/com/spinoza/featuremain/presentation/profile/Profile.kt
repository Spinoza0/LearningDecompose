package com.spinoza.featuremain.presentation.profile

import com.arkivanov.decompose.value.Value
import com.spinoza.featuremain.domain.Person

interface Profile {

    val models: Value<Model>

    data class Model(val person: Person)
}