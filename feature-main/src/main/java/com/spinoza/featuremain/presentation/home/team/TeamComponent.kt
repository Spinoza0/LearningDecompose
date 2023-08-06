package com.spinoza.featuremain.presentation.home.team

import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import com.spinoza.featuremain.domain.Person
import com.spinoza.featuremain.presentation.home.team.Team.Model

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