package com.spinoza.learningdecompose.presentation.feature.main.mainpage.bottommenu

import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import com.spinoza.learningdecompose.presentation.feature.main.mainpage.bottommenu.BottomMenu.BottomMenuItem
import com.spinoza.learningdecompose.presentation.feature.main.mainpage.bottommenu.BottomMenu.Model

class BottomMenuComponent(
    private val onHomeClick: () -> Unit,
    private val onProfileClick: () -> Unit,
) : BottomMenu {

    private val _models = MutableValue(Model(BottomMenuItem.Home))
    override val models: Value<Model> = _models

    override fun onHomeClicked() {
        if (_models.value.currentItem !is BottomMenuItem.Home) {
            _models.value = _models.value.copy(currentItem = BottomMenuItem.Home)
            onHomeClick()
        }
    }

    override fun onProfileClicked() {
        if (_models.value.currentItem !is BottomMenuItem.Profile) {
            _models.value = _models.value.copy(currentItem = BottomMenuItem.Profile)
            onProfileClick()
        }
    }
}