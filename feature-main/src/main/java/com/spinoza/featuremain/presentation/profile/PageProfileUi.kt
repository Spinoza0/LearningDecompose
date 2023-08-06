package com.spinoza.featuremain.presentation.profile

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun PageProfileUi(component: PageProfile, modifier: Modifier = Modifier) {
    ProfileUi(component.profile, modifier)
}