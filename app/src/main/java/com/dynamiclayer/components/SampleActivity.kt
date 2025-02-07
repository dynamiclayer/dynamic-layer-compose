@file:Suppress("KotlinConstantConditions")

package com.dynamiclayer.components

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material3.ExperimentalMaterial3Api
import com.dynamiclayer.components.exampleView.navigation.MainNavGraph


@ExperimentalFoundationApi
@ExperimentalMaterial3Api
class SampleActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MainNavGraph() }
    }
}























