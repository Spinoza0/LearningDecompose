package com.spinoza.learningdecompose.presentation.feature.main.mainpage.bottommenu

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.arkivanov.decompose.extensions.compose.jetpack.subscribeAsState
import com.spinoza.learningdecompose.R

@Composable
fun BottomMenuUi(component: BottomMenu, modifier: Modifier = Modifier) {
    val model by component.models.subscribeAsState()
    NavigationBar(modifier = modifier, ) {
        NavigationBarItem(
            selected = model.currentItem is BottomMenu.BottomMenuItem.Home,
            onClick = component::onHomeClicked,
            icon = { Icon(imageVector = Icons.Default.Home, contentDescription = null) },
            label = { Text(stringResource(R.string.home)) }
        )
        NavigationBarItem(
            selected = model.currentItem is BottomMenu.BottomMenuItem.Profile,
            onClick = component::onProfileClicked,
            icon = { Icon(imageVector = Icons.Default.Person, contentDescription = null) },
            label = { Text(stringResource(R.string.profile)) }
        )
    }
}