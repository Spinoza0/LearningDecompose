package com.spinoza.learningdecompose.presentation.feature.menu.home

import com.arkivanov.decompose.value.Value
import com.spinoza.learningdecompose.presentation.feature.menu.NestedMenuPage

interface PageHome : NestedMenuPage {

    val models: Value<Model>

    fun openTasksPage()

    fun openTeamPage()

    data class Model(val currentPage: NestedPage)
}