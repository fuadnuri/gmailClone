import android.provider.CalendarContract.Colors
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Card
import androidx.compose.material3.DrawerState
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.fuadroid.gmailclone.R
import components.AccountsDialogue
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun HomeAppBar(drawerState:DrawerState,scope:CoroutineScope,openDialog:MutableState<Boolean>){

    Box(modifier = Modifier.padding(10.dp).fillMaxWidth(),){
        Card (
            modifier = Modifier.requiredHeight(50.dp)
        ){

        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(6.dp)){
            IconButton (onClick = {
                scope.launch {
                    drawerState.apply {
                        if(isClosed) open() else close()
                    }}
            }){
                Icon(Icons.Default.Menu, contentDescription = "menu")
            }
            Text("Search for mails", modifier = Modifier.weight(2.0f))
            IconButton(onClick = {
                openDialog.value = true
            }) { Icon(imageVector = Icons.Outlined.Person, contentDescription = "profile", tint = Color.Blue)}
            if (openDialog.value){
                AccountsDialogue(openDialog)
            }
        }
        }
    }
}