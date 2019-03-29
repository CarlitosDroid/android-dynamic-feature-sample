package com.spidev.user

import android.util.Log
import androidx.lifecycle.ViewModel
import com.spidev.core.user.UserRepository

class UserViewModel(var userRepository: UserRepository): ViewModel() {

    fun getListOfUser(){
        Log.e("DI-USER-UVM-UR","$userRepository")
    }

}