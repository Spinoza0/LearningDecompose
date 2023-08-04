package com.spinoza.learningdecompose.presentation.feature.main.mainpage.bottommenu

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import com.arkivanov.essenty.backhandler.BackCallback
import com.spinoza.learningdecompose.presentation.feature.main.mainpage.bottommenu.BottomMenu.BottomMenuItem
import com.spinoza.learningdecompose.presentation.feature.main.mainpage.bottommenu.BottomMenu.Model

class BottomMenuComponent(
    componentContext: ComponentContext,
    private val onHomeClick: () -> Unit,
    private val onProfileClick: () -> Unit,
) : BottomMenu, ComponentContext by componentContext {

    private val _models = MutableValue(Model(BottomMenuItem.Home))
    override val models: Value<Model> = _models

    private val backCallback = BackCallback { onHomeClicked() }.also {
        backHandler.register(it)
        it.isEnabled = false
    }

    override fun onHomeClicked() {
        if (!isOnHomeScreen()) {
            _models.value = _models.value.copy(currentItem = BottomMenuItem.Home)
            backCallback.isEnabled = false
            onHomeClick()
        }
    }

    override fun onProfileClicked() {
        if (isOnHomeScreen()) {
            _models.value = _models.value.copy(currentItem = BottomMenuItem.Profile)
            backCallback.isEnabled = true
            onProfileClick()
        }
    }

    private fun isOnHomeScreen(): Boolean = _models.value.currentItem is BottomMenuItem.Home
}