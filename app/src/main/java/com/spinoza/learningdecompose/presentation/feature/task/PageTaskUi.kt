package com.spinoza.learningdecompose.presentation.feature.task

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.extensions.compose.jetpack.subscribeAsState

@Composable
fun PageTaskUi(component: PageTask, modifier: Modifier = Modifier) {
    val model by component.task.models.subscribeAsState()
    Text(model.task, modifier = modifier)
}