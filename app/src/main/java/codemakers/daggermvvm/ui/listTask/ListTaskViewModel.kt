package codemakers.daggermvvm.ui.listTask

import android.arch.lifecycle.ViewModel
import codemakers.daggermvvm.data.model.TaskDao
import javax.inject.Inject

/**
 * Created by jhonfredytrujilloortega on 10/24/17.
 */
class ListTaskViewModel @Inject
    constructor(val taskDao: TaskDao): ViewModel() {

}