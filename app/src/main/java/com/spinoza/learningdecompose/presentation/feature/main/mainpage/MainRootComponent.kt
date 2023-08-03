package com.spinoza.learningdecompose.presentation.feature.main.mainpage

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.router.stack.push
import com.arkivanov.decompose.value.Value
import com.arkivanov.essenty.parcelable.Parcelable
import com.arkivanov.essenty.parcelable.Parcelize
import com.spinoza.learningdecompose.presentation.feature.main.home.HomeRootComponent
import com.spinoza.learningdecompose.presentation.feature.main.profile.PageProfileComponent

class MainRootComponent(componentContext: ComponentContext) : MainRoot,
    ComponentContext by componentContext {

    private val navigation = StackNavigation<Config>()

    override val stack: Value<ChildStack<*, MainRoot.Child>> = childStack(
        source = navigation,
        initialConfiguration = Config.Home,
        handleBackButton = true,
        childFactory = ::childFactory
    )

    private fun childFactory(config: Config, componentContext: ComponentContext): MainRoot.Child =
        when (config) {
            is Config.Home -> MainRoot.Child.Home(HomeRootComponent(componentContext))
            is Config.Profile -> MainRoot.Child.Profile(PageProfileComponent(componentContext))
        }

    override fun onProfileClicked() {
        navigation.push(Config.Profile)
    }

    @Parcelize
    private sealed class Config : Parcelable {

        object Home : Config()

        object Profile : Config()
    }
}