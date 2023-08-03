package com.spinoza.learningdecompose.presentation.feature.menu

import com.arkivanov.decompose.value.Value

interface Menu {

    val models: Value<Model>

    fun openHomeScreen()

    fun openProfileScreen()

    data class Model(val currentPage: NestedMenuPage)
}