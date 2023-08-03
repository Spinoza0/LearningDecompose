package com.spinoza.learningdecompose.presentation.feature.task

import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import com.spinoza.learningdecompose.presentation.feature.task.Task.Model

class TaskComponent(task: String) : Task {

    private val _models = MutableValue(Model(task))
    override val models: Value<Model> = _models

    override fun setTask(newTask: String) {
        _models.value = Model(newTask)
    }
}