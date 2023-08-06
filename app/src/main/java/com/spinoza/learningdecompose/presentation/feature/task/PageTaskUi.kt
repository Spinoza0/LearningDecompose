package com.spinoza.learningdecompose.presentation.feature.task

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun PageTaskUi(component: PageTask, modifier: Modifier = Modifier) {
    TaskUi(component.task, modifier)
}