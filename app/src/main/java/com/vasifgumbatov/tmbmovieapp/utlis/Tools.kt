package com.vasifgumbatov.tmbmovieapp.utlis

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.net.Uri
import java.text.SimpleDateFormat
import java.util.Date

class Tools {

    companion object {
        fun openLink(mContext: Context, url: String) {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data = Uri.parse(url)
            mContext.startActivity(openURL)
        }

        @SuppressLint("SimpleDateFormat")
        fun convertLongToTime(time: Long): String {
            val date = Date(time)
            val format = SimpleDateFormat("dd MMM yyyy")
            return format.format(date)
        }
    }

}