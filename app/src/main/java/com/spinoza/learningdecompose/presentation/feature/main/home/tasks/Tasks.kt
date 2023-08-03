package com.spinoza.learningdecompose.presentation.feature.main.home.tasks

import com.arkivanov.decompose.value.Value

interface Tasks {

    val models: Value<Model>

    data class Model(val tasks: List<String>)
}