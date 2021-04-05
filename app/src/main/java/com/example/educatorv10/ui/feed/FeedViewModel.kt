package com.example.educatorv10.ui.feed

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FeedViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Feed Fragment"
    }
    val text: LiveData<String> = _text
}