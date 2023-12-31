package com.spinoza.learningdecompose.task.presentation

import com.arkivanov.decompose.ComponentContext

class PageTaskComponent(
    componentContext: ComponentContext,
    task: String,
) : PageTask, ComponentContext by componentContext {

    override val task: Task = TaskComponent(task)
}