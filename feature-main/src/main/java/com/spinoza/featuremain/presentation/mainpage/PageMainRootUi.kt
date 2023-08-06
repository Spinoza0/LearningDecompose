package com.spinoza.featuremain.presentation.mainpage

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.extensions.compose.jetpack.stack.Children
import com.spinoza.featuremain.presentation.home.HomeRootUi
import com.spinoza.featuremain.presentation.profile.PageProfileUi

@Composable
fun PageMainRootUi(component: PageMainRoot, modifier: Modifier = Modifier) {
    Children(component.stack) {
        when (val instance = it.instance) {
            is PageMainRoot.Child.Home -> HomeRootUi(instance.component, modifier)
            is PageMainRoot.Child.Profile -> PageProfileUi(instance.component, modifier)
        }
    }
}