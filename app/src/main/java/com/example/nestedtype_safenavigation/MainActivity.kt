package com.example.nestedtype_safenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.nestedtype_safenavigation.navigation.graph.RootNavGraph
import com.example.nestedtype_safenavigation.ui.theme.NestedTypesafeNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NestedTypesafeNavigationTheme {

                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    RootNavGraph()
                }
            }
        }
    }
}
