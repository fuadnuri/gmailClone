package components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.VideoCall
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun BottomBar (modifier: Modifier){
    NavigationBar (containerColor = Color.White, tonalElevation = 2.dp){


        Icon(Icons.Default.Home, contentDescription = "Home",modifier=Modifier.weight((2.0f)))
        Spacer(modifier = Modifier.weight(2.0f))

        Icon(Icons.Outlined.VideoCall, contentDescription = "settings",modifier=Modifier.weight((2.0f)))

    }

}