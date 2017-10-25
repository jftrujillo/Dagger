package codemakers.daggermvvm.ui.listTask

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import codemakers.daggermvvm.R

class ListTastActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Tareas"
    }
}
