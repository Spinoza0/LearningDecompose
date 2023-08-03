package com.spinoza.learningdecompose.presentation.feature.main.profile

import com.arkivanov.decompose.ComponentContext

class PageProfileComponent(componentContext: ComponentContext) : PageProfile,
    ComponentContext by componentContext {

    override val profile: Profile = ProfileComponent()
}