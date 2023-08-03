package com.spinoza.learningdecompose.presentation.feature.main.home.tasks

import com.arkivanov.decompose.ComponentContext

class PageTasksComponent(
    componentContext: ComponentContext,
    private val onTeamClick: () -> Unit,
) : PageTasks, ComponentContext by componentContext {

    override val tasks: Tasks = TasksComponent()

    override fun onTeamClicked() {
        onTeamClick()
    }
}