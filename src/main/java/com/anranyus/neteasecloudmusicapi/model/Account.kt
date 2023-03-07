package com.anranyus.neteasecloudmusicapi.model

data class Account(val accountInfo: AccountInfo)
data class AccountInfo(val id:String,val username:String,val type:Int,val status:Int,
                       val whitelistAuthority:Int,val createTime:String,val tokenVersion:String,
                       val ban:Int,val baoyueVersion:Int,val donateVersion:Int,val vipType:Int,
                       val anonimousUser:Boolean,val paidFee:Boolean)