package com.spidev.user

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import dagger.android.support.DaggerAppCompatActivity

import kotlinx.android.synthetic.main.activity_user.*
import kotlinx.android.synthetic.main.content_user.*

class UserActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
        setSupportActionBar(toolbar)

        btnGoToDetail.setOnClickListener {
            Intent().setClassName(
                packageName,
                "com.spidev.detail.DetailActivity"
            ).also {
                startActivity(it)
            }
        }

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

}
