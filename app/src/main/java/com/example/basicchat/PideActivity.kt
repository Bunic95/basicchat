package com.example.basicchat

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.aldebaran.qi.sdk.QiContext
import com.aldebaran.qi.sdk.QiSDK
import com.aldebaran.qi.sdk.RobotLifecycleCallbacks
import com.aldebaran.qi.sdk.design.activity.RobotActivity

class PideActivity : RobotActivity(), RobotLifecycleCallbacks {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pidescreen)
        QiSDK.register(this, this)


        //Button zurück zur Vorigen Activity
        val backButton = findViewById<Button>(R.id.but_back_pide)
        backButton.setOnClickListener {
            val intent = Intent(this, turkischactivity::class.java)
            startActivity(intent)
        }
    }

    override fun onRobotFocusGained(qiContext: QiContext?) {
        TODO("Not yet implemented")
    }

    override fun onRobotFocusLost() {
        TODO("Not yet implemented")
    }

    override fun onRobotFocusRefused(reason: String?) {
        TODO("Not yet implemented")
    }

}