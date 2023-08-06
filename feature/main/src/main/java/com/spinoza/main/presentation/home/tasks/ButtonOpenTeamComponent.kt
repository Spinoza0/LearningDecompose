package com.spinoza.main.presentation.home.tasks

class ButtonOpenTeamComponent(private val onClick: () -> Unit) : ButtonOpenTeam {

    override fun onButtonClick() {
        onClick()
    }
}