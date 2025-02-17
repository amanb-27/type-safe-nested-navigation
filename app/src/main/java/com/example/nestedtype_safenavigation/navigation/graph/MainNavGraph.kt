package com.example.nestedtype_safenavigation.navigation.graph

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.nestedtype_safenavigation.navigation.MainGraphRoutes
import com.example.nestedtype_safenavigation.navigation.NotificationGraphRoutes
import com.example.nestedtype_safenavigation.screens.HomeScreen
import com.example.nestedtype_safenavigation.screens.NotificationScreen
import com.example.nestedtype_safenavigation.screens.ProfileScreen
import com.example.nestedtype_safenavigation.screens.SettingScreen

@Composable
fun MainNavGraph(
    modifier: Modifier,
    rootNavController: NavHostController,
    mainNavController: NavHostController
) {

    NavHost(
        navController = mainNavController,
        startDestination = MainGraphRoutes.Home,
        modifier = modifier.fillMaxSize()
    ) {
        composable<MainGraphRoutes.Home> {
            HomeScreen()
        }
        composable<MainGraphRoutes.Profile> {
            ProfileScreen()
        }
        composable<MainGraphRoutes.Notification> {
            NotificationScreen {
                rootNavController.navigate(NotificationGraphRoutes.NotificationSetting)
            }
        }
        composable<MainGraphRoutes.Settings> {
            SettingScreen()
        }
    }

}