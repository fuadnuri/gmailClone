package components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.GppGood
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties

@Composable
fun AccountsDialogue(openDialogue: MutableState<Boolean>) {
    Dialog(onDismissRequest = {openDialogue.value=false}, content = {
        Card (
            modifier = Modifier.background(color = Color.White)
        ){


        Row (modifier = Modifier

            .clip(shape = RoundedCornerShape(16.dp))
            .height(150.dp).width(200.dp)

            .background(color = Color.White)
            .padding(horizontal = 20.dp)

            , verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){
            Icon(Icons.Outlined.GppGood, contentDescription = "bowayiiii")
            Column (modifier = Modifier.weight(2.0f)){
                Text("username", style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Black))
                Text("Email handle", style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Thin))
            }
            Text("99")
        }
    }
    })
}