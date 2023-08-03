package com.spinoza.learningdecompose.presentation.feature.root

import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value
import com.spinoza.learningdecompose.presentation.feature.main.mainpage.PageMain
import com.spinoza.learningdecompose.presentation.feature.task.PageTask

interface Root {

    val stack: Value<ChildStack<*, Child>>

    fun onTaskClicked(task: String)

    sealed class Child {

        class Main(val component: PageMain) : Child()

        class Task(val component: PageTask) : Child()
    }
}