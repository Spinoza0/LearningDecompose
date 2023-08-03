package com.spinoza.learningdecompose.presentation.feature.task

import com.arkivanov.decompose.value.Value

interface Task {

    val models: Value<Model>

    fun setTask(newTask: String)

    data class Model(
        val task: String,
    )
}