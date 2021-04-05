package com.example.educatorv10.ui.topics

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TopicsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Topics Fragment"
    }
    val text: LiveData<String> = _text
}