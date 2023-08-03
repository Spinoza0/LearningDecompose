package com.spinoza.learningdecompose.presentation.feature.main.profile

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.extensions.compose.jetpack.subscribeAsState

@Composable
fun PageProfileUi(component: PageProfile, modifier: Modifier = Modifier) {
    val model by component.profile.models.subscribeAsState()
    Text(model.person.fullName, modifier = modifier)
}