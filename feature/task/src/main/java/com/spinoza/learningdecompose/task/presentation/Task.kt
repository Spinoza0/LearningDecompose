package com.spinoza.learningdecompose.task.presentation

import com.arkivanov.decompose.value.Value

interface Task {

    val models: Value<Model>

    data class Model(
        val task: String,
    )
}