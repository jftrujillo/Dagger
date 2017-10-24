package codemakers.daggermvvm

import android.app.Application
import android.arch.persistence.room.Room
import codemakers.daggermvvm.data.AppDatabase

/**
 * Created by Administrador on 24/10/2017.
 */
class App : Application(){
    companion object {
        lateinit var db: AppDatabase
    }

    override fun onCreate() {
        super.onCreate()
        db = Room.databaseBuilder(this,AppDatabase::class.java,"task_database").build()
    }
}

