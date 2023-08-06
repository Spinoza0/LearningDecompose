package com.spinoza.learningdecompose.presentation.root

import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value
import com.spinoza.featuremain.presentation.mainpage.PageMain
import com.spinoza.featuretask.presentation.PageTask

interface Root {

    val stack: Value<ChildStack<*, Child>>

    fun onTaskClicked(task: String)

    sealed class Child {

        class Main(val component: PageMain) : Child()

        class Task(val component: PageTask) : Child()
    }
}