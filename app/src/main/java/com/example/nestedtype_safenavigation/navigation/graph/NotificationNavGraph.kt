package com.example.nestedtype_safenavigation.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.nestedtype_safenavigation.navigation.Graph
import com.example.nestedtype_safenavigation.navigation.NotificationGraphRoutes
import com.example.nestedtype_safenavigation.screens.NotificationDetailScreen
import com.example.nestedtype_safenavigation.screens.NotificationSettingScreen

fun NavGraphBuilder.notificationNavGraph(
    navController: NavHostController
) {
   navigation<Graph.NotificationGraph>(
       startDestination = NotificationGraphRoutes.NotificationSetting
   ){
       composable<NotificationGraphRoutes.NotificationSetting>{
           NotificationSettingScreen(){
               navController.navigate(NotificationGraphRoutes.NotificationDetailScreen)
           }
       }

       composable<NotificationGraphRoutes.NotificationDetailScreen>{
           NotificationDetailScreen()
       }
   }
}