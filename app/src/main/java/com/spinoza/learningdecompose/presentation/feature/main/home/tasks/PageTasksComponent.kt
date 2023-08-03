package com.spinoza.learningdecompose.presentation.feature.main.home.tasks

import com.arkivanov.decompose.ComponentContext

class PageTasksComponent(
    componentContext: ComponentContext,
) : PageTasks, ComponentContext by componentContext {

    override val tasks: Tasks = TasksComponent()
}