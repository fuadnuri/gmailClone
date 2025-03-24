package com.fuadroid.gmailclone
import HomeAppBar
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fuadroid.gmailclone.ui.theme.GmailcloneTheme
import components.BottomBar
import kotlinx.coroutines.launch


class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GmailcloneTheme {
                GmailApp()
            }
        }
    }
}

@Composable
fun GmailApp(
){
    val drawerState= rememberDrawerState(initialValue = DrawerValue.Closed);//drawer state
    val scope = rememberCoroutineScope ()
    val openDialog = remember {
        mutableStateOf(
            false
        )
    }
    ModalNavigationDrawer(
        drawerContent = {
            ModalDrawerSheet {
                Column(

                    modifier = Modifier.padding(horizontal = 16.dp)
                        .verticalScroll(rememberScrollState())
                ) {
                    Spacer(Modifier.windowInsetsPadding(WindowInsets.statusBars))
                    Text("Gmail",color=Color.Red, modifier = Modifier.padding(16.dp), style = MaterialTheme.typography.titleLarge)
                    HorizontalDivider()

                    Text("All inboxes", modifier = Modifier.padding(16.dp), style = MaterialTheme.typography.titleMedium)
                    NavigationDrawerItem(
                        icon = {Icon(Icons.Outlined.MailOutline, contentDescription = "primary")},
                        label = { Text("Primary") },
                        selected = false,

                        onClick = {
                            scope.launch {
                                drawerState.close()
                            }
                        }
                    )
                    NavigationDrawerItem(
                        icon = {Icon(Icons.Default.AccountCircle, contentDescription = "primary")},
                        label = { Text("Social") },
                        selected = false,

                        onClick = {
                            scope.launch {
                                drawerState.close()
                            }
                        }
                    )
                    NavigationDrawerItem(

                        icon = {Icon(Icons.Default.Star,contentDescription = "primary",)},
                        label = { Text("Primary") },
                        selected = false,

                        onClick = {
                            scope.launch {
                                drawerState.close()
                            }
                        }
                    )
                    Text(text = "All labels".uppercase(),
                        fontSize = 22.sp,
                        color = Color.Gray,

                        )

                    NavigationDrawerItem(

                        icon = {Icon(Icons.Default.Star,contentDescription = "primary",)},
                        label = { Text("Primary") },
                        selected = false,

                        onClick = {
                            scope.launch {
                                drawerState.close()
                            }
                        }
                    )




                    NavigationDrawerItem(

                        icon = {Icon(Icons.Default.Star,contentDescription = "primary",)},
                        label = { Text("Primary") },
                        selected = false,

                        onClick = {
                            scope.launch {
                                drawerState.close()
                            }
                        }
                    )



                }
            }
        },
        drawerState=drawerState


    ) {


        Scaffold(
            topBar = { HomeAppBar(drawerState, scope,openDialog ) },
            bottomBar = {
                BottomBar(modifier = Modifier)
            },
            floatingActionButton = { IconButton(onClick = {}, enabled = true, content = {
                Icon(imageVector = Icons.Default.Add, contentDescription = "floating btn", tint = Color.White)
            }, modifier = Modifier.clip(shape = CircleShape.copy(all= CornerSize(size = 8.dp))).background(color=Color.Blue)
                ) },

            modifier = Modifier.windowInsetsPadding(WindowInsets.statusBars),

            ) {innerPadding ->
            LazyColumn(modifier = Modifier.padding(innerPadding)
                .fillMaxWidth()
                .padding(horizontal = 10.dp)){
                items(50){
                    index->
                        Row(
                            modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp)
                        ){
                            Icon(imageVector = Icons.Default.Face,
                                contentDescription = "pp",
                                modifier = Modifier.padding(end = 2.dp).size(48.dp))
                            Column(modifier=Modifier.weight(2.0f)) {
                                //
                                Text("Ageta Christy",  style = TextStyle(
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight(700),))
                                //subject
                                Text("subject", style = TextStyle(
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight(500)
                                ))
                                Text("Content", style = TextStyle(
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight(300)
                                ))

                            }
                            Column(
                                modifier = Modifier.fillMaxHeight()
                                    .padding(4.dp)

                            ) {
                                Text(text = "2:30")
                                IconButton(modifier = Modifier
                                    .size(50.dp)
                                    .padding(16.dp)
                                    , onClick = {}
                                ){


                                    Icon(imageVector = Icons.Default.Star, contentDescription = "rate")
                                }
                            }
                        }

                }

            }



        }
    }
}




