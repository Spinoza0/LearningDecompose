package com.spinoza.learningdecompose.presentation.feature.main.home.tasks

class ButtonOpenTeamComponent(private val onClick: () -> Unit) : ButtonOpenTeam {

    override fun onButtonClick() {
        onClick()
    }
}