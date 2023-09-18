package com.spinoza.learningdecompose.main.presentation.home.tasks

import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import com.spinoza.learningdecompose.main.presentation.home.tasks.Tasks.Model

class TasksComponent(private val onTaskClick: (String) -> Unit) : Tasks {

    private val _models = MutableValue(Model(
        List(5) { "Task $it" }
    ))

    override fun onTaskClicked(task: String) {
        onTaskClick(task)
    }

    override val models: Value<Model> = _models
}