package com.spinoza.learningdecompose.presentation.feature.menu.profile

import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import com.spinoza.learningdecompose.domain.model.Person
import com.spinoza.learningdecompose.presentation.feature.menu.profile.Profile.*

class ProfileComponent : Profile {

    private val _models = MutableValue(Model(Person("John", "Dow")))

    override val models: Value<Model> = _models
}