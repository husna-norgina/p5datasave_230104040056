package id.antasari.p5datasave_230104040056.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Folder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Dest(
    val route: String,
    val label: String,
    val icon: ImageVector
) {
    data object Home : Dest(route = "home", label = "Home", icon = Icons.Outlined.Home)

    data object SP : Dest(route = "sp", label = "SharedPrefs", icon = Icons.Outlined.Settings)

    data object Files : Dest(route = "files", label = "Files", icon = Icons.Outlined.Folder)

    data object About : Dest(route = "about", label = "About", icon = Icons.Outlined.Info)

    companion object {
        val all = listOf(Home, SP, Files, About)
        const val startRoute = "home"
    }
}
