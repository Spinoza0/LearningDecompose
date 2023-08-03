package com.spinoza.learningdecompose.presentation.feature.task

import com.arkivanov.decompose.ComponentContext

class PageTaskComponent(
    componentContext: ComponentContext,
    task: String,
) : PageTask, ComponentContext by componentContext {

    override val task: Task = TaskComponent(task)
}