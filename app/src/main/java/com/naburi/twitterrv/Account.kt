package com.naburi.twitterrv

import java.lang.reflect.InvocationHandler

data class Account(
    var avatar: String,
    var name: String,
    var handler: String,
    var tweet: String,
    var comment: String,
    var retweet: String,
    var like: String,
    var share: String
)
