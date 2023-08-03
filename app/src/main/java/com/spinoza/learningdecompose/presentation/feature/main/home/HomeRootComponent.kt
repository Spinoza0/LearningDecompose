package com.spinoza.learningdecompose.presentation.feature.main.home

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.router.stack.push
import com.arkivanov.decompose.value.Value
import com.arkivanov.essenty.parcelable.Parcelable
import com.spinoza.learningdecompose.presentation.feature.main.home.tasks.PageTasksComponent
import com.spinoza.learningdecompose.presentation.feature.main.home.team.PageTeamComponent
import kotlinx.parcelize.Parcelize

class HomeRootComponent(
    componentContext: ComponentContext,
) : HomeRoot, ComponentContext by componentContext {

    private val navigation = StackNavigation<Config>()

    override val stack: Value<ChildStack<*, HomeRoot.Child>> = childStack(
        source = navigation,
        initialConfiguration = Config.Tasks,
        handleBackButton = true,
        childFactory = ::childFactory,
    )

    private fun childFactory(config: Config, componentContext: ComponentContext): HomeRoot.Child =
        when (config) {
            is Config.Tasks -> HomeRoot.Child.Tasks(
                PageTasksComponent(componentContext, ::onTeamClicked)
            )

            is Config.Team -> HomeRoot.Child.Team(
                PageTeamComponent(componentContext)
            )
        }


    override fun onTeamClicked() {
        navigation.push(Config.Team)
    }

    @Parcelize
    private sealed class Config : Parcelable {

        object Tasks : Config()

        object Team : Config()
    }
}