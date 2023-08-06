package com.spinoza.learningdecompose.task.presentation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.extensions.compose.jetpack.subscribeAsState

@Composable
fun TaskUi(component: Task, modifier: Modifier = Modifier) {
    val model by component.models.subscribeAsState()
    Text(model.task, modifier = modifier)
}