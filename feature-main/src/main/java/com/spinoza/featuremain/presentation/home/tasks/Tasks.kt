package com.spinoza.featuremain.presentation.home.tasks

import com.arkivanov.decompose.value.Value

interface Tasks {

    val models: Value<Model>

    fun onTaskClicked(task: String)

    data class Model(val tasks: List<String>)
}