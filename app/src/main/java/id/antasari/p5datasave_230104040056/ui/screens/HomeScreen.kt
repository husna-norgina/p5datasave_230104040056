package id.antasari.p5datasave_230104040056.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Folder
import androidx.compose.material.icons.outlined.Storage
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import id.antasari.p5datasave_230104040056.navigation.Dest
import id.antasari.p5datasave_230104040056.ui.components.GradientCard
import id.antasari.p5datasave_230104040056.ui.components.KevaChip
import id.antasari.p5datasave_230104040056.ui.components.InfoBanner
import id.antasari.p5datasave_230104040056.ui.theme.KevaGreen
import id.antasari.p5datasave_230104040056.ui.theme.KevaBlue
import id.antasari.p5datasave_230104040056.navigation.navigateSingleTopTo // <- helper

@Composable
fun HomeScreen(nav: NavController) {
    val scroll = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scroll)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // JUDUL RATA TENGAH
        Text(
            text = "Keep-Value Data Saver Lab",
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurface
        )

        // Badge kecil di bawah judul
        KevaChip(text = "Educational Practicum Project")

        // Card: SharedPreferences -> pakai helper
        GradientCard(
            icon = Icons.Outlined.Storage,
            title = "SharedPreferences Demo",
            subtitle = "Save small data like name & NIM using key-value pairs",
            chips = listOf("Key-Value", "Persistent"),
            from = KevaGreen,
            to = KevaGreen.copy(alpha = .82f)
        ) { nav.navigate(Dest.SP.route) }

        // Card: File Handling -> pakai helper
        GradientCard(
            icon = Icons.Outlined.Folder,
            title = "File Handling Demo",
            subtitle = "Write & read notes in internal storage",
            chips = listOf("Text Files", "Storage"),
            from = KevaBlue,
            to = KevaBlue.copy(alpha = .85f)
        ) { nav.navigate(Dest.Files.route) }

        // Info banner / quick tips kecil
        Spacer(Modifier.height(4.dp))
        InfoBanner("Tip: SharedPreferences cocok untuk data kecil (string/boolean). File lebih fleksibel untuk teks panjang.")
    }
}

