import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import org.jetbrains.compose.ui.tooling.preview.Preview

val lightBlueColor = Color(color = 0xFF2196F3)
val darkBlueColor = Color(color = 0xFF1976D2)

@Composable
internal fun App() = AppTheme {
    KoinApplication(
        application = {
            modules(appModule)
        }
    ) {
        AppContent()
    }
}