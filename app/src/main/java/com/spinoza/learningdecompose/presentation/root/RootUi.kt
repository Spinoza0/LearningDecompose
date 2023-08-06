package com.spinoza.learningdecompose.presentation.root

import androidx.compose.runtime.Composable
import com.arkivanov.decompose.extensions.compose.jetpack.stack.Children
import com.spinoza.featuremain.presentation.mainpage.PageMainUi
import com.spinoza.featuretask.presentation.PageTaskUi

@Composable
fun RootUi(component: Root) {
    Children(component.stack) {
        when (val instance = it.instance) {
            is Root.Child.Main -> PageMainUi(instance.component)
            is Root.Child.Task -> PageTaskUi(instance.component)
        }
    }
}