package uz.gita.labyrinthBall.mobdev.presentation.viewmodel.impl

import androidx.lifecycle.ViewModel
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.lifecycle.HiltViewModel
import uz.gita.labyrinthBall.mobdev.domain.usecase.GameUseCase
import uz.gita.labyrinthBall.mobdev.presentation.viewmodel.GameViewModel
import javax.inject.Inject

@HiltViewModel
class GameViewModelImpl
@Inject constructor(
    private val gameUseCase: GameUseCase
) : GameViewModel, ViewModel() {

}