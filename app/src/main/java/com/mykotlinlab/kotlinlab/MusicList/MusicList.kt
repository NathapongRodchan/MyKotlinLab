package com.mykotlinlab.kotlinlab.MusicList

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.mykotlinlab.kotlinlab.R

class MusicList : AppCompatActivity(),MusicListInterface.ActionView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music_list)
    }

    override fun initView() {
        setEvent()
    }

    override fun setEvent() {

    }
}
