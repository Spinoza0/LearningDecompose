package com.spinoza.learningdecompose.presentation.feature.main.mainpage

import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value
import com.spinoza.learningdecompose.presentation.feature.main.home.HomeRoot
import com.spinoza.learningdecompose.presentation.feature.main.profile.PageProfile

interface MainRoot {

    val stack: Value<ChildStack<*, Child>>

    fun onHomeClicked()

    fun onProfileClicked()

    sealed class Child {

        class Home(val component: HomeRoot) : Child()

        class Profile(val component: PageProfile) : Child()
    }
}