package uz.gita.labyrinthBall.mobdev.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import uz.gita.labyrinthBall.mobdev.domain.usecase.GameUseCase
import uz.gita.labyrinthBall.mobdev.domain.usecase.HomeUseCase
import uz.gita.labyrinthBall.mobdev.domain.usecase.SplashUseCase
import uz.gita.labyrinthBall.mobdev.domain.usecase.impl.GameUseCaseImpl
import uz.gita.labyrinthBall.mobdev.domain.usecase.impl.HomeUseCaseImpl
import uz.gita.labyrinthBall.mobdev.domain.usecase.impl.SplashUseCaseImpl

@Module
@InstallIn(ViewModelComponent::class)
interface UseCaseModule {
    @Binds
    fun bindGameUseCase(impl: GameUseCaseImpl): GameUseCase

    @Binds
    fun bindHomeUseCase(impl: HomeUseCaseImpl): HomeUseCase

    @Binds
    fun bindSplashUseCase(impl: SplashUseCaseImpl): SplashUseCase
}