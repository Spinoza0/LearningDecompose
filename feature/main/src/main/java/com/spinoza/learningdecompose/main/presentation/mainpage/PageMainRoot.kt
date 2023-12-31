package com.spinoza.learningdecompose.main.presentation.mainpage

import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value
import com.spinoza.learningdecompose.main.presentation.profile.PageProfile

interface PageMainRoot {

    val stack: Value<ChildStack<*, Child>>

    fun onHomeClicked()

    fun onProfileClicked()

    fun onTaskClicked(task: String)

    sealed class Child {

        class Home(val component: com.spinoza.learningdecompose.main.presentation.home.HomeRoot) : Child()

        class Profile(val component: PageProfile) : Child()
    }
}