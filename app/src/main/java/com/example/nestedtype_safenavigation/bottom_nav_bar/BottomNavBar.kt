package com.example.nestedtype_safenavigation.bottom_nav_bar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.nestedtype_safenavigation.navigation.MainGraphRoutes
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

@Serializable
data class BottomNavBarItem<T>(
    val title : String,
    @Contextual val selectedIcon : ImageVector,
    @Contextual val unselectedIcon : ImageVector,
    val route : T
)

val bottomNavBarItems = listOf(
    BottomNavBarItem(
        title = "Home",
        selectedIcon = Icons.Filled.Home,
        unselectedIcon = Icons.Outlined.Home,
        route = MainGraphRoutes.Home
    ),
    BottomNavBarItem(
        title = "Profile",
        selectedIcon = Icons.Filled.Person,
        unselectedIcon = Icons.Outlined.Person,
        route = MainGraphRoutes.Profile
    ),
    BottomNavBarItem(
        title = "Settings",
        selectedIcon = Icons.Filled.Settings,
        unselectedIcon = Icons.Outlined.Settings,
        route = MainGraphRoutes.Settings
    ),
    BottomNavBarItem(
        title = "Notification",
        selectedIcon = Icons.Filled.Notifications,
        unselectedIcon = Icons.Outlined.Notifications,
        route = MainGraphRoutes.Notification
    )
)
