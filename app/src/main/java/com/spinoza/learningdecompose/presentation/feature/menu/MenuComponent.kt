package com.spinoza.learningdecompose.presentation.feature.menu

import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import com.spinoza.learningdecompose.presentation.feature.menu.Menu.Model
import com.spinoza.learningdecompose.presentation.feature.menu.home.PageHomeComponent
import com.spinoza.learningdecompose.presentation.feature.menu.profile.PageProfileComponent

class MenuComponent : Menu {

    private val homeComponent = PageHomeComponent()
    private val profileComponent = PageProfileComponent()

    private val _models = MutableValue(Model(homeComponent))
    override val models: Value<Model> = _models

    override fun openHomeScreen() {
        if (_models.value.currentPage !is PageHomeComponent) {
            _models.value = _models.value.copy(currentPage = homeComponent)
        }
    }

    override fun openProfileScreen() {
        if (_models.value.currentPage !is PageProfileComponent) {
            _models.value = _models.value.copy(currentPage = profileComponent)
        }
    }
}