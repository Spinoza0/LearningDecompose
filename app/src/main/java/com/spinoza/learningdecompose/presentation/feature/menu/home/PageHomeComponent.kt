package com.spinoza.learningdecompose.presentation.feature.menu.home

import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import com.spinoza.learningdecompose.presentation.feature.menu.home.PageHome.Model
import com.spinoza.learningdecompose.presentation.feature.menu.home.tasks.PageTasksComponent
import com.spinoza.learningdecompose.presentation.feature.menu.home.team.PageTeamComponent

class PageHomeComponent : PageHome {

    private val pageTasksComponent = PageTasksComponent()
    private val pageTeamComponent = PageTeamComponent()
    private val _models = MutableValue(Model(pageTasksComponent))
    override val models: Value<Model> = _models

    override fun openTasksPage() {
        if (_models.value.currentPage !is PageTasksComponent) {
            _models.value = _models.value.copy(currentPage = pageTasksComponent)
        }
    }

    override fun openTeamPage() {
        if (_models.value.currentPage !is PageTeamComponent) {
            _models.value = _models.value.copy(currentPage = pageTeamComponent)
        }
    }
}