package com.spinoza.learningdecompose.presentation.feature.main.home.tasks

import com.arkivanov.decompose.ComponentContext

class PageTasksComponent(
    componentContext: ComponentContext,
    onTeamClick: () -> Unit,
    onTaskClick: (String) -> Unit,
) : PageTasks, ComponentContext by componentContext {

    override val tasks: Tasks = TasksComponent(onTaskClick)
    override val buttonOpenTeam: ButtonOpenTeam = ButtonOpenTeamComponent(onTeamClick)
}