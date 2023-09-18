package com.spinoza.learningdecompose.main.presentation.mainpage

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.arkivanov.decompose.extensions.compose.jetpack.stack.Children
import com.spinoza.learningdecompose.main.presentation.home.HomeRootUi
import com.spinoza.learningdecompose.main.presentation.profile.PageProfileUi

@Composable
fun PageMainRootUi(component: PageMainRoot, modifier: Modifier = Modifier) {
    Children(component.stack, modifier = modifier.padding(16.dp)) {
        when (val instance = it.instance) {
            is PageMainRoot.Child.Home -> HomeRootUi(instance.component)
            is PageMainRoot.Child.Profile -> PageProfileUi(instance.component)
        }
    }
}