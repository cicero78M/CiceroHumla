package com.example.cicerohumla

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.humla.client.HumlaClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example usage of Humla library
        val client = HumlaClient()
        client.connect("server.example.com")
    }
}
