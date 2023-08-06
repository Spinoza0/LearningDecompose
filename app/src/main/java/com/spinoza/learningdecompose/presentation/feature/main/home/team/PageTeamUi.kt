package com.spinoza.learningdecompose.presentation.feature.main.home.team

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun PageTeamUi(component: PageTeam, modifier: Modifier = Modifier) {
    TeamUi(component.team, modifier)
}