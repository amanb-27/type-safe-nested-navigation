package com.example.nestedtype_safenavigation.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.nestedtype_safenavigation.navigation.Graph
import com.example.nestedtype_safenavigation.navigation.SettingGraphRoutes
import com.example.nestedtype_safenavigation.screens.ChangeLanguageScreen
import com.example.nestedtype_safenavigation.screens.ChangeThemeScreen

fun NavGraphBuilder.settingNavGraph(
    navController: NavHostController
){
    navigation<Graph.SettingGraph>(
        startDestination = SettingGraphRoutes.ChangeTheme
    ){
        composable<SettingGraphRoutes.ChangeTheme>{
            ChangeThemeScreen()
        }
        composable<SettingGraphRoutes.ChangeLanguage>{
            ChangeLanguageScreen()
        }
    }
}