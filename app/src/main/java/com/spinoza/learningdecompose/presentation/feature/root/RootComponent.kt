package com.spinoza.learningdecompose.presentation.feature.root

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.router.stack.push
import com.arkivanov.decompose.value.Value
import com.arkivanov.essenty.parcelable.Parcelable
import com.arkivanov.essenty.parcelable.Parcelize
import com.spinoza.learningdecompose.presentation.feature.main.mainpage.PageMainComponent
import com.spinoza.learningdecompose.presentation.feature.task.PageTaskComponent

class RootComponent(
    componentContext: ComponentContext,
) : Root, ComponentContext by componentContext {

    private val navigation = StackNavigation<Config>()

    override val stack: Value<ChildStack<*, Root.Child>> = childStack(
        source = navigation,
        initialConfiguration = Config.Menu,
        handleBackButton = true,
        childFactory = ::childFactory,
    )

    private fun childFactory(config: Config, componentContext: ComponentContext): Root.Child =
        when (config) {
            is Config.Menu ->
                Root.Child.Main(PageMainComponent(componentContext, {}, { }))

            is Config.Task -> Root.Child.Task(PageTaskComponent(componentContext, config.task))
        }

    override fun onTaskClicked(task: String) {
        navigation.push(Config.Task(task))
    }

    @Parcelize
    private sealed class Config : Parcelable {

        object Menu : Config()

        class Task(val task: String) : Config()
    }
}