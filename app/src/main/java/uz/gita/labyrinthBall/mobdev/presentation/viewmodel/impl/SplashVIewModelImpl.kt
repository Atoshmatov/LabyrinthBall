package uz.gita.labyrinthBall.mobdev.presentation.viewmodel.impl

import androidx.lifecycle.ViewModel
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.lifecycle.HiltViewModel
import uz.gita.labyrinthBall.mobdev.domain.usecase.SplashUseCase
import uz.gita.labyrinthBall.mobdev.presentation.viewmodel.SplashVIewModel
import javax.inject.Inject

@HiltViewModel
class SplashVIewModelImpl
@Inject constructor(
    private val splashUseCase: SplashUseCase
) : SplashVIewModel, ViewModel() {
}