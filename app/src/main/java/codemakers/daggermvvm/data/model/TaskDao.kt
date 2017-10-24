package codemakers.daggermvvm.data.model

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import io.reactivex.Flowable

/**
 * Created by jhonfredytrujilloortega on 10/24/17.
 */
@Dao
interface TaskDao {
    @Query("SELECT * FROM task")
    fun getAllTask() : Flowable<List<Task>>
}