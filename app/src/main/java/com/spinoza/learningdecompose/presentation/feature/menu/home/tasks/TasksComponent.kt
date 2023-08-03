package com.spinoza.learningdecompose.presentation.feature.menu.home.tasks

import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import com.spinoza.learningdecompose.presentation.feature.menu.home.tasks.Tasks.Model

class TasksComponent : Tasks {

    private val _models = MutableValue(Model(
        List(5) { "Task $it" }
    ))

    override val models: Value<Model> = _models
}