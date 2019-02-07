package com.mykotlinlab.kotlinlab.MusicList

interface MusicListInterface {

    interface ActionView{
        fun initView()
        fun setEvent()
    }

    interface ActionPresenter{
        fun loadMusic(artistName : String)

    }
}