package com.spinoza.learningdecompose.main.presentation.home.tasks

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.extensions.compose.jetpack.subscribeAsState

@Composable
fun TasksUi(component: Tasks, modifier: Modifier = Modifier) {
    val model by component.models.subscribeAsState()
    LazyColumn(modifier = modifier) {
        items(model.tasks, key = { it }) { task ->
            Text(task, modifier = Modifier
                .clickable { component.onTaskClicked(task) }
                .fillMaxWidth()
            )
        }
    }
}