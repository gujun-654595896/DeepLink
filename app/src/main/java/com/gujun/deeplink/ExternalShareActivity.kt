package com.gujun.deeplink

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_deeplink.content
import kotlinx.android.synthetic.main.activity_external_share.*

/**
 *    author : gujun
 *    date   : 2020/8/19 11:14
 *    desc   :
 */
class ExternalShareActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_external_share)
        val action = intent.action
        if (action != null) {
            when (action) {
                Intent.ACTION_SEND -> titleText.text = "单个系统分享"
                Intent.ACTION_SEND_MULTIPLE -> titleText.text = "多个系统分享"
            }
        }
        var type = intent.type
        if (type != null) {
            when {
                type.startsWith("text/") -> content.text = "是文本类型"
                type.startsWith("video/") -> content.text = "是视频类型"
                type.startsWith("audio/") -> content.text = "是音频类型"
                type.startsWith("image/") -> content.text = "是图片类型"
                type.startsWith("application/") -> content.text = "是文件类型"
            }
        }

    }
}