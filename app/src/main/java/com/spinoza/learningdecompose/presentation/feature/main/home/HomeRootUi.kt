package com.spinoza.learningdecompose.presentation.feature.main.home

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.extensions.compose.jetpack.stack.Children
import com.spinoza.learningdecompose.presentation.feature.main.home.tasks.PageTasksUi
import com.spinoza.learningdecompose.presentation.feature.main.home.team.PageTeamUi

@Composable
fun HomeRootUi(component: HomeRoot, modifier: Modifier = Modifier) {
    Children(component.stack) {
        when (val instance = it.instance) {
            is HomeRoot.Child.Tasks -> PageTasksUi(instance.component, modifier)
            is HomeRoot.Child.Team -> PageTeamUi(instance.component, modifier)
        }
    }
}