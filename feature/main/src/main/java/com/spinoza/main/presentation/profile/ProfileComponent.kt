package com.spinoza.main.presentation.profile

import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import com.spinoza.main.domain.Person
import com.spinoza.main.presentation.profile.Profile.Model

class ProfileComponent : Profile {

    private val _models = MutableValue(Model(Person("John", "Dow")))

    override val models: Value<Model> = _models
}