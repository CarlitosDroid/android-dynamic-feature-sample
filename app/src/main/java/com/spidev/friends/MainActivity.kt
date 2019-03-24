package com.spidev.friends

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import com.google.gson.Gson
import com.spidev.friends.dagger.inject

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import okhttp3.OkHttpClient
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var gson: Gson

    @Inject
    lateinit var okHttpClient: OkHttpClient

    @Inject
    lateinit var sharePreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inject(this)
        setSupportActionBar(toolbar)

        btnGoToUser.setOnClickListener {
            Intent().setClassName(
                packageName,
                "com.spidev.user.UserActivity"
            ).also {
                startActivity(it)
            }
        }

        fab.setOnClickListener { view ->
            Log.e("DI-APP1", "$sharePreferences")
            Log.e("DI-APP2", "$okHttpClient")
            Log.e("DI-APP3", "$gson")
            Snackbar.make(view, "Base URL: ${BuildConfig.BASE_URL}", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
