package uz.gita.labyrinthBall.mobdev.presentation.viewmodel.impl

import androidx.lifecycle.ViewModel
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.lifecycle.HiltViewModel
import uz.gita.labyrinthBall.mobdev.domain.usecase.HomeUseCase
import uz.gita.labyrinthBall.mobdev.presentation.viewmodel.HomeViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModelImpl
@Inject constructor(
    private val homeUseCase: HomeUseCase
) : HomeViewModel, ViewModel() {
}