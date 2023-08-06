package com.spinoza.featuremain.presentation.mainpage

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.spinoza.featuremain.presentation.mainpage.bottommenu.BottomMenuUi

@Composable
fun PageMainUi(component: PageMain) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        PageMainRootUi(component.pageMainRoot)
        BottomMenuUi(component.bottomMenu)
    }
}