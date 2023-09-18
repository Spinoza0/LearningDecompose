package com.spinoza.learningdecompose.main.presentation.home

import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value
import com.spinoza.learningdecompose.main.presentation.home.tasks.PageTasks
import com.spinoza.learningdecompose.main.presentation.home.team.PageTeam

interface HomeRoot {

    val stack: Value<ChildStack<*, Child>>

    fun onTeamClicked()

    fun onTaskClicked(task: String)

    sealed class Child {

        class Tasks(val component: PageTasks) : Child()

        class Team(val component: PageTeam) : Child()
    }
}