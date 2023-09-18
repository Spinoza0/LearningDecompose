package com.spinoza.learningdecompose.main.presentation.mainpage

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.spinoza.learningdecompose.main.presentation.mainpage.bottommenu.BottomMenuUi

@Composable
fun PageMainUi(component: PageMain, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        PageMainRootUi(component.pageMainRoot, Modifier.padding(16.dp))
        BottomMenuUi(component.bottomMenu)
    }
}