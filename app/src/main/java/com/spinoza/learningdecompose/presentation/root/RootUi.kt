package com.spinoza.learningdecompose.presentation.root

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.extensions.compose.jetpack.stack.Children
import com.spinoza.learningdecompose.main.presentation.mainpage.PageMainUi
import com.spinoza.learningdecompose.task.presentation.PageTaskUi

@Composable
fun RootUi(component: Root) {
    Children(component.stack) {
        Box(modifier = Modifier.fillMaxSize()) {
            when (val instance = it.instance) {
                is Root.Child.Main -> PageMainUi(instance.component)
                is Root.Child.Task -> PageTaskUi(instance.component)
            }
        }
    }
}