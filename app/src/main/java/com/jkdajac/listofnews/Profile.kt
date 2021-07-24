package com.jkdajac.listofnews


import android.graphics.Bitmap

class Profile(
    val name: String,
    val description: String,
    val avatar: Bitmap,
    val like : Bitmap,
    var countLikes : Int = 0

) {

}