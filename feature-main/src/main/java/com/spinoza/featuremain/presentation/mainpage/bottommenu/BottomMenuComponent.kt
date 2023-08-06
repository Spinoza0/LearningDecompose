package com.spinoza.featuremain.presentation.mainpage.bottommenu

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import com.arkivanov.essenty.backhandler.BackCallback
import com.arkivanov.essenty.statekeeper.consume
import com.spinoza.featuremain.presentation.mainpage.bottommenu.BottomMenu.Model

class BottomMenuComponent(
    componentContext: ComponentContext,
    private val onHomeClick: () -> Unit,
    private val onProfileClick: () -> Unit,
) : BottomMenu, ComponentContext by componentContext {

    private val _models = MutableValue(
        stateKeeper.consume<Model>(STATE) ?: Model(true)
    )
    override val models: Value<Model> = _models

    private val backCallback = BackCallback { onHomeClicked() }.also {
        backHandler.register(it)
        it.isEnabled = !_models.value.isHomeScreen
    }

    init {
        stateKeeper.register(STATE) { _models.value }
    }

    override fun onHomeClicked() {
        if (!models.value.isHomeScreen) {
            _models.value = _models.value.copy(isHomeScreen = true)
            backCallback.isEnabled = false
            onHomeClick()
        }
    }

    override fun onProfileClicked() {
        if (models.value.isHomeScreen) {
            _models.value = _models.value.copy(isHomeScreen = false)
            backCallback.isEnabled = true
            onProfileClick()
        }
    }

    private companion object {
        const val STATE = "state"
    }
}