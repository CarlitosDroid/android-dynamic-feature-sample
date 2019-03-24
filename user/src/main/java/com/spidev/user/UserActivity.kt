package com.spidev.user

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import com.spidev.friends.BuildConfig
import com.spidev.user.dagger.inject

import kotlinx.android.synthetic.main.activity_user.*
import kotlinx.android.synthetic.main.content_user.*
import javax.inject.Inject

class UserActivity : AppCompatActivity() {

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
        inject()
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
            Log.e("DI-USER1", "$sharedPreferences")
            //Log.e("DI-USER2", "$okHttpClient")
            //Log.e("DI-USER3", "$gson")
            Snackbar.make(view, "Base URL: ${BuildConfig.BASE_URL}", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

}
