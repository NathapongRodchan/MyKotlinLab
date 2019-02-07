package com.mykotlinlab.kotlinlab

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.mykotlinlab.kotlinlab.MusicList.MusicList
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView():Unit{
        setEvent()
    }

    private fun setEvent():Unit{
        btnOK.setOnClickListener{gotoMusicList()}
    }


    private fun gotoMusicList(){
        startActivity(Intent(this, MusicList::class.java).apply
        { putExtra("ARTIST_NAME", edtArtistName.text) })
    }
}
