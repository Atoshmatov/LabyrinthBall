package uz.gita.labyrinthBall.mobdev.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.gita.labyrinthBall.mobdev.domain.repository.AppRepository
import uz.gita.labyrinthBall.mobdev.domain.repository.impl.AppRepositoryImpl
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
interface AppRepositoryModule {


    @[Binds Singleton]
    fun bindAppRepository(impl: AppRepositoryImpl): AppRepository
}