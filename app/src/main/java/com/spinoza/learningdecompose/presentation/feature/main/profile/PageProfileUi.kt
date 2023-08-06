package com.spinoza.learningdecompose.presentation.feature.main.profile

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun PageProfileUi(component: PageProfile, modifier: Modifier = Modifier) {
    ProfileUi(component.profile, modifier)
}