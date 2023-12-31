package com.spinoza.learningdecompose.task.presentation

import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import com.spinoza.learningdecompose.task.presentation.Task.Model

class TaskComponent(task: String) : Task {

    private val _models = MutableValue(Model(task))
    override val models: Value<Model> = _models
}