package com.spinoza.learningdecompose.presentation.feature.main.home

import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value
import com.spinoza.learningdecompose.presentation.feature.main.home.tasks.PageTasks
import com.spinoza.learningdecompose.presentation.feature.main.home.team.PageTeam

interface HomeRoot {

    val stack: Value<ChildStack<*, Child>>

    fun onTeamClicked()

    fun onTaskClicked(task: String)

    sealed class Child {

        class Tasks(val component: PageTasks) : Child()

        class Team(val component: PageTeam) : Child()
    }
}