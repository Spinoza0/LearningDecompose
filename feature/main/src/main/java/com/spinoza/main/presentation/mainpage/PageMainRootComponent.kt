package com.spinoza.main.presentation.mainpage

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.bringToFront
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.value.Value
import com.arkivanov.essenty.parcelable.Parcelable
import com.arkivanov.essenty.parcelable.Parcelize
import com.spinoza.main.presentation.home.HomeRootComponent
import com.spinoza.main.presentation.profile.PageProfileComponent

class PageMainRootComponent(
    componentContext: ComponentContext,
    private val onTaskClick: (String) -> Unit,
) : PageMainRoot,
    ComponentContext by componentContext {

    private val navigation = StackNavigation<Config>()

    override val stack: Value<ChildStack<*, PageMainRoot.Child>> = childStack(
        source = navigation,
        initialConfiguration = Config.Home,
        childFactory = ::childFactory
    )

    private fun childFactory(
        config: Config,
        componentContext: ComponentContext,
    ): PageMainRoot.Child =
        when (config) {
            is Config.Home ->
                PageMainRoot.Child.Home(HomeRootComponent(componentContext, ::onTaskClicked))

            is Config.Profile -> PageMainRoot.Child.Profile(PageProfileComponent(componentContext))
        }

    override fun onHomeClicked() {
        navigation.bringToFront(Config.Home)
    }

    override fun onProfileClicked() {
        navigation.bringToFront(Config.Profile)
    }

    override fun onTaskClicked(task: String) {
        onTaskClick(task)
    }

    @Parcelize
    private sealed class Config : Parcelable {

        object Home : Config()

        object Profile : Config()
    }
}