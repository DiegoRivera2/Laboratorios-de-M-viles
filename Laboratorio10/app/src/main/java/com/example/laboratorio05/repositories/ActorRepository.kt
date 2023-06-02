package com.example.laboratorio05.repositories

import com.example.laboratorio05.data.dao.ActorDao
import com.example.laboratorio05.data.model.ActorModel

class ActorRepository(private val ActorsDao: ActorDao) {

    suspend fun getAllActors() = ActorsDao.getAllActors()

    suspend fun insertActors(actor: ActorModel) = ActorsDao.insertActor(actor)
}