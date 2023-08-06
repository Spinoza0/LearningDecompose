package com.spinoza.learningdecompose.main.presentation.home.tasks

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun PageTasksUi(component: PageTasks, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(8.dp)
    ) {
        ButtonOpenTeamUi(component.buttonOpenTeam, modifier)
        TasksUi(component.tasks, modifier)
    }
}