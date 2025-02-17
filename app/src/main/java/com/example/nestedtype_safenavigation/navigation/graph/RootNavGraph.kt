package com.example.nestedtype_safenavigation.navigation.graph

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.nestedtype_safenavigation.navigation.Graph
import com.example.nestedtype_safenavigation.screens.MainScreen

@Composable
fun RootNavGraph() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Graph.AuthGraph
    ){
        authNavGraph(navController = navController)

        composable<Graph.MainGraph>(){
            MainScreen(
                rootNavController = navController
            )
        }

        settingNavGraph(navController = navController)
        notificationNavGraph(navController = navController)
    }
}