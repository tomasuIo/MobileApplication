package com.marvelgallery.data.network.provider

import java.math.BigInteger
import java.security.MessageDigest

/**
 * Created by huzehao666 on 2017/11/16.
 */
fun claculatedMD5(text: String):String {
    val messageDigest = getMD5Digest(text)
    val md5 = BigInteger(1,messageDigest).toString(16)
    return "0" * (32 - md5.length) + md5
}

private fun getMD5Digest(str: String): ByteArray = MessageDigest.getInstance("MD5").digest(str.toByteArray())

private operator fun String.times(i: Int) = (1..i).fold(""){ acc, _-> acc +this }