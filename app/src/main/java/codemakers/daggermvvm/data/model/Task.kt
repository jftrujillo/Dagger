package codemakers.daggermvvm.data.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.util.*

/**
 * Created by Administrador on 24/10/2017.
 */
@Entity
class Task(@PrimaryKey(autoGenerate = true)
           @ColumnInfo(name = "id")
           var id : Int,
           @ColumnInfo(name = "Titulo")
           var title : String,
           @ColumnInfo(name = "descripcion")
           var descripcion : String,
           @ColumnInfo(name = "date")
           var date : Date
           )


