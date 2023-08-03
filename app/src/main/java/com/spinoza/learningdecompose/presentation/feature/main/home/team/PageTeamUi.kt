package com.spinoza.learningdecompose.presentation.feature.main.home.team

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.extensions.compose.jetpack.subscribeAsState

@Composable
fun PageTeamUi(component: PageTeam, modifier: Modifier = Modifier) {
    val model by component.team.models.subscribeAsState()

    LazyColumn(modifier = modifier) {
        items(model.team, key = { it.hashCode() }) {
            Text(it.fullName)
        }
    }
}