package com.spinoza.main.presentation.mainpage

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.spinoza.main.presentation.mainpage.bottommenu.BottomMenuUi

@Composable
fun PageMainUi(component: PageMain, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        PageMainRootUi(component.pageMainRoot)
        BottomMenuUi(component.bottomMenu)
    }
}