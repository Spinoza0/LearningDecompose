package com.spinoza.learningdecompose.presentation.feature.main.mainpage

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.spinoza.learningdecompose.presentation.feature.main.mainpage.bottommenu.BottomMenuUi

@Composable
fun PageMainUi(component: PageMain) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        MainRootUi(component.mainRoot)
        BottomMenuUi(component.bottomMenu)
    }
}