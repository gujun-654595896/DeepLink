package com.gujun.deeplink

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_deeplink.*

/**
 *    author : gujun
 *    date   : 2020/8/19 11:14
 *    desc   :
 */
class DeepLinkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deeplink)
        var type = intent.data?.getQueryParameter("type")
        content.text = "DeepLink 传递的type=$type"
    }
}