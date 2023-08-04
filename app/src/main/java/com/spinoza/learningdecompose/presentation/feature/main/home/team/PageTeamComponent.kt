package com.spinoza.learningdecompose.presentation.feature.main.home.team

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.essenty.backhandler.BackCallback

class PageTeamComponent(
    componentContext: ComponentContext,
    onBackPress: () -> Unit,
) : PageTeam,
    ComponentContext by componentContext {

    override val team: Team = TeamComponent()

    init {
        BackCallback { onBackPress() }.also { backHandler.register(it) }
    }
}