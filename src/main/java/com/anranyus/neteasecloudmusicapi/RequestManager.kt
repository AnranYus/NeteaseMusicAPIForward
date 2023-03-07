package com.anranyus.neteasecloudmusicapi

import com.anranyus.neteasecloudmusicapi.model.PlaylistSongItem
import com.anranyus.neteasecloudmusicapi.model.QRCodeInfo
import com.anranyus.neteasecloudmusicapi.store.CookieStore

class RequestManager(url:String) {
    companion object{
        lateinit var baseUrl:String
    }
    init {
        baseUrl = url
    }

    /*************LoginService*************/
    private lateinit var statusChangeEvent:LoginService.LoginStatus
    private val loginService = LoginService(statusChangeEvent)
    fun setLoginStatusChangeEvent(statusChangeEvent:LoginService.LoginStatus){
        this.statusChangeEvent = statusChangeEvent
    }

    fun getLoginQRCode(): QRCodeInfo? = loginService.getQRCode()

    fun setCookieEvent(cookieEvent: CookieStore.CookieEvent){
        loginService.cookieStore.setCookieEvent(cookieEvent)
    }

    /*************PlaylistService*************/
    val playlistService = PlaylistService()
    fun getUserPlaylist(uid:String) = playlistService.getUserPlaylist(uid)

    fun getPlaylistSongInfo(id:String): List<PlaylistSongItem> = playlistService.getAllSongInPlaylist(id)

    /*************SongService*************/
    private val songService = SongService()
    fun getSongUrl(ids:List<String>,level:String) = songService.getSongUrl(ids,level)

    /*************UserService*************/
    private val userService = UserService()
    fun getUserInfo() = userService.getAccountInfo()





}