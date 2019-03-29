package com.spidev.detail

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import com.spidev.core.TAG_NAME
import com.spidev.friends.BuildConfig

import kotlinx.android.synthetic.main.activity_detail.*
import javax.inject.Inject

class DetailActivity : AppCompatActivity() {

    //@Inject
    //lateinit var userViewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            //Log.e("DI-UVM-DETAIL", "$userViewModel")
            Snackbar.make(view, "Base Detail URL: ${BuildConfig.BASE_URL}", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    override fun onBackPressed() {
        val returnIntent = Intent()
        returnIntent.putExtra(TAG_NAME, "Return a fake name")
        setResult(Activity.RESULT_OK, returnIntent)
        super.onBackPressed()
    }

}
