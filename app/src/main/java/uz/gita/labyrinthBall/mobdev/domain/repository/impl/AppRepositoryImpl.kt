package uz.gita.labyrinthBall.mobdev.domain.repository.impl

import uz.gita.labyrinthBall.mobdev.domain.repository.AppRepository
import javax.inject.Inject

class AppRepositoryImpl
@Inject constructor() : AppRepository {
    private val list = ArrayList<Array<Array<Int>>>()
    override fun loadMap() {
        list.add(
            arrayOf(

            )
        )
    }
}