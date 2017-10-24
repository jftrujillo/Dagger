package codemakers.daggermvvm.data.model

import android.arch.persistence.room.TypeConverter
import java.util.*

/**
 * Created by jhonfredytrujilloortega on 10/24/17.
 */
class TypeConverters {
    companion object {
        @TypeConverter
        fun fromTimeStamp(value : Long) : Date = Date(value)
        @TypeConverter
        fun dateToTimeStamp(date : Date) : Long = date.time
    }
}