package com.spinoza.learningdecompose.presentation.feature.main.mainpage

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.extensions.compose.jetpack.stack.Children
import com.spinoza.learningdecompose.presentation.feature.main.home.HomeRootUi
import com.spinoza.learningdecompose.presentation.feature.main.profile.PageProfileUi

@Composable
fun MainRootUi(component: MainRoot, modifier: Modifier = Modifier) {
    Children(component.stack) {
        when (val instance = it.instance) {
            is MainRoot.Child.Home -> HomeRootUi(instance.component, modifier)
            is MainRoot.Child.Profile -> PageProfileUi(instance.component, modifier)
        }
    }
}