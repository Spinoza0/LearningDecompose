package com.spinoza.learningdecompose.presentation.feature.main.home.team

import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import com.spinoza.learningdecompose.domain.model.Person
import com.spinoza.learningdecompose.presentation.feature.main.home.team.Team.*

class TeamComponent : Team {

    private val _models = MutableValue(
        Model(
            listOf(
                Person("John", "Dow"),
                Person("Helen", "Miller")
            )
        )
    )

    override val models: Value<Model> = _models
}