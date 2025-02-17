package com.example.nestedtype_safenavigation.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Graph {
    /**
     * MainGraph -> /main
     * AuthGraph -> /auth
     * Notification -> /notification
     * Setting -> /setting
     * */
    @Serializable
    data object MainGraph : Graph()

    @Serializable
    data object AuthGraph : Graph()

    @Serializable
    data object RootGraph : Graph()

    @Serializable
    data object NotificationGraph : Graph()

    @Serializable
    data object SettingGraph : Graph()
}

@Serializable
sealed class AuthGraphRoutes {

    /**
     * Login -> /auth/login
     * Register -> /auth/register
     * ForgetPassword -> /auth/forgetPassword
     */

    @Serializable
    data object Login : AuthGraphRoutes()

    @Serializable
    data object Register : AuthGraphRoutes()

    @Serializable
    data object ForgotPassword : AuthGraphRoutes()

}

@Serializable
sealed class MainGraphRoutes {

    /**
     * Home -> /main/home
     * Profile -> /main/profile
     * Setting -> /main/setting
     * Notification -> /main/notification
     */

    @Serializable
    data object Home : MainGraphRoutes()

    @Serializable
    data object Profile : MainGraphRoutes()

    @Serializable
    data object Settings : MainGraphRoutes()

    @Serializable
    data object Notification : MainGraphRoutes()
}

@Serializable
sealed class SettingGraphRoutes {
    /**
     * ChangeTheme -> /setting/changeTheme
     * ChangeLanguage -> /setting/changeLanguage
     */
    @Serializable
    data object ChangeTheme : SettingGraphRoutes()

    @Serializable
    data object ChangeLanguage : SettingGraphRoutes()
}

@Serializable
sealed class NotificationGraphRoutes {
    /**
     * NotificationSetting -> /notification/notificationSetting
     * NotificationDetailScreen -> /notification/notificationDetailScreen
     */
    @Serializable
    data object NotificationSetting : NotificationGraphRoutes()

    @Serializable
    data object NotificationDetailScreen : NotificationGraphRoutes()
}

