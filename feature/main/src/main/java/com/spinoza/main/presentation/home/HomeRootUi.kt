package com.spinoza.main.presentation.home

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.extensions.compose.jetpack.stack.Children
import com.spinoza.main.presentation.home.tasks.PageTasksUi
import com.spinoza.main.presentation.home.team.PageTeamUi

@Composable
fun HomeRootUi(component: HomeRoot, modifier: Modifier = Modifier) {
    Children(component.stack) {
        when (val instance = it.instance) {
            is HomeRoot.Child.Tasks -> PageTasksUi(instance.component, modifier)
            is HomeRoot.Child.Team -> PageTeamUi(instance.component, modifier)
        }
    }
}