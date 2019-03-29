package com.spidev.user

import android.app.Activity
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import com.google.gson.Gson
import com.spidev.core.TAG_NAME
import com.spidev.core.user.UserRepository
import com.spidev.friends.BuildConfig
import com.spidev.user.dagger.inject

import kotlinx.android.synthetic.main.activity_user.*
import kotlinx.android.synthetic.main.content_user.*
import javax.inject.Inject

class UserActivity : AppCompatActivity() {

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    @Inject
    lateinit var userViewModel: UserViewModel

    @Inject
    lateinit var userRepository: UserRepository

    @Inject
    lateinit var gson: Gson

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
                startActivityForResult(it, 101)
            }
        }

        fab.setOnClickListener { view ->
            Log.e("DI-USER-SP", "$sharedPreferences")
            Log.e("DI-USER-UVM", "$userViewModel")
            Log.e("DI-USER-UR", "$userRepository")
            //Log.e("DI-USER2", "$okHttpClient")
            Log.e("DI-USER-GSON", "$gson")
            userViewModel.getListOfUser()
            Snackbar.make(view, "Base URL: ${BuildConfig.BASE_URL}", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 101 && resultCode == Activity.RESULT_OK) {
            val name = data!!.getStringExtra(TAG_NAME)
            Toast.makeText(this, "$name", Toast.LENGTH_LONG).show()
        }
    }

}
