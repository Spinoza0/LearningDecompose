package com.spinoza.learningdecompose.main.presentation.home.team

import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import com.spinoza.learningdecompose.main.presentation.home.team.Team.Model

class TeamComponent : Team {

    private val _models = MutableValue(
        Model(
            listOf(
                com.spinoza.learningdecompose.main.domain.Person("John", "Dow"),
                com.spinoza.learningdecompose.main.domain.Person("Helen", "Miller")
            )
        )
    )

    override val models: Value<Model> = _models
}