package com.example.nestedtype_safenavigation.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.nestedtype_safenavigation.navigation.AuthGraphRoutes
import com.example.nestedtype_safenavigation.navigation.Graph
import com.example.nestedtype_safenavigation.screens.ForgetPasswordScreen
import com.example.nestedtype_safenavigation.screens.LoginScreen
import com.example.nestedtype_safenavigation.screens.RegisterScreen

fun NavGraphBuilder.authNavGraph(
    navController: NavHostController
) {
    navigation<Graph.AuthGraph>(
        startDestination = AuthGraphRoutes.Login
    ) {
        composable<AuthGraphRoutes.Login> {
            LoginScreen(
                onClick = {
                    navController.navigate(Graph.MainGraph) {
                        popUpTo(Graph.AuthGraph) {
                            inclusive = true
                        }
                    }
                },
                onRegisterClick = { navController.navigate(AuthGraphRoutes.Register) }
            )
        }

        composable<AuthGraphRoutes.Register> {
            RegisterScreen()
        }

        composable<AuthGraphRoutes.ForgotPassword> {
            ForgetPasswordScreen()
        }
    }
}