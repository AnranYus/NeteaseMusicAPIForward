package com.anranyus.apirequest

import com.anranyus.apirequest.model.Account
import com.anranyus.apirequest.model.AccountInfo

class UserService: BaseService() {

    /**
     * NOTE：必须先登录并获取cookie后才能使用
     *
     *使用cookie从服务器获取账户数据
     *其中最重要的是获得用户ID
     */
    fun getAccountInfo(): AccountInfo {
        return  gson.fromJson(request("/user/account",null), Account::class.java).account
    }



}