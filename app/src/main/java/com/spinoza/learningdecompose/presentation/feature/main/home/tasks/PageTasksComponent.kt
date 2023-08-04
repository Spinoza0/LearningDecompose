package com.spinoza.learningdecompose.presentation.feature.main.home.tasks

import com.arkivanov.decompose.ComponentContext

class PageTasksComponent(
    componentContext: ComponentContext,
    private val onTeamClick: () -> Unit,
    onTaskClick: (String) -> Unit,
) : PageTasks, ComponentContext by componentContext {

    override val tasks: Tasks = TasksComponent(onTaskClick)

    override fun onTeamClicked() {
        onTeamClick()
    }
}