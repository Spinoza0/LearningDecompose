package com.spinoza.learningdecompose.main.presentation.home.tasks

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun PageTasksUi(component: PageTasks, modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        ButtonOpenTeamUi(component.buttonOpenTeam, modifier)
        TasksUi(component.tasks, modifier)
    }
}