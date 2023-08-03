package com.spinoza.learningdecompose.presentation.feature.main.home.team

import com.arkivanov.decompose.ComponentContext

class PageTeamComponent(componentContext: ComponentContext) : PageTeam,
    ComponentContext by componentContext {

    override val team: Team = TeamComponent()
}