package com.spinoza.learningdecompose.presentation.feature.main.mainpage.bottommenu

import com.arkivanov.decompose.value.Value

interface BottomMenu {

    val models: Value<Model>

    fun onHomeClicked()

    fun onProfileClicked()

    data class Model(val currentItem: BottomMenuItem)

    sealed class BottomMenuItem {

        object Home : BottomMenuItem()

        object Profile : BottomMenuItem()
    }
}