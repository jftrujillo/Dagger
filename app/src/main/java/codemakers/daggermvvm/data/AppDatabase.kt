package codemakers.daggermvvm.data

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import codemakers.daggermvvm.data.model.Task
import codemakers.daggermvvm.data.model.TaskDao

/**
 * Created by Administrador on 24/10/2017.
 */

@Database (entities = arrayOf(Task::class),version = 1)
@TypeConverters(codemakers.daggermvvm.data.model.TypeConverters::class)
abstract class AppDatabase : RoomDatabase(){
    abstract fun taskDao(): TaskDao
}