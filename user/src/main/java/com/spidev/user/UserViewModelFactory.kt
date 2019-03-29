package com.spidev.user

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.spidev.core.user.UserRepository

@Suppress("UNCHECKED_CAST")
class UserViewModelFactory(var userRepository: UserRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(UserViewModel::class.java)) {
            return UserViewModel(userRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}