package com.spinoza.learningdecompose.presentation.feature.main.home

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.bringToFront
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.value.Value
import com.arkivanov.essenty.parcelable.Parcelable
import com.spinoza.learningdecompose.presentation.feature.main.home.tasks.PageTasksComponent
import com.spinoza.learningdecompose.presentation.feature.main.home.team.PageTeamComponent
import kotlinx.parcelize.Parcelize

class HomeRootComponent(
    componentContext: ComponentContext,
    private val onTaskClick: (String) -> Unit,
) : HomeRoot, ComponentContext by componentContext {

    private val navigation = StackNavigation<Config>()

    override val stack: Value<ChildStack<*, HomeRoot.Child>> = childStack(
        source = navigation,
        initialConfiguration = Config.Tasks,
        childFactory = ::childFactory,
    )

    private fun childFactory(config: Config, componentContext: ComponentContext): HomeRoot.Child =
        when (config) {
            is Config.Tasks -> HomeRoot.Child.Tasks(
                PageTasksComponent(componentContext, ::onTeamClicked, ::onTaskClicked)
            )

            is Config.Team -> HomeRoot.Child.Team(
                PageTeamComponent(componentContext, ::showTasks)
            )
        }


    override fun onTeamClicked() {
        navigation.bringToFront(Config.Team)
    }

    override fun onTaskClicked(task: String) {
        onTaskClick(task)
    }

    private fun showTasks() {
        navigation.bringToFront(Config.Tasks)
    }

    @Parcelize
    private sealed class Config : Parcelable {

        object Tasks : Config()

        object Team : Config()
    }
}