package com.spinoza.main.presentation.home.tasks

import com.arkivanov.decompose.ComponentContext

class PageTasksComponent(
    componentContext: ComponentContext,
    onTeamClick: () -> Unit,
    onTaskClick: (String) -> Unit,
) : PageTasks, ComponentContext by componentContext {

    override val tasks: Tasks = TasksComponent(onTaskClick)
    override val buttonOpenTeam: ButtonOpenTeam = ButtonOpenTeamComponent(onTeamClick)
}