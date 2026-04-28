package com.jbchat.app
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
class MainActivity: ComponentActivity() {
 override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  setContent { App() }
 }
}
@Composable fun App(){
 var code by remember{ mutableStateOf("")}
 var unlocked by remember{ mutableStateOf(false)}
 var msg by remember{ mutableStateOf("")}
 var chat by remember{ mutableStateOf(listOf<String>())}
 MaterialTheme {
  Column(Modifier.fillMaxSize().padding(16.dp), verticalArrangement=Arrangement.spacedBy(8.dp)) {
   if(!unlocked){
    Text("Enter Secret Code")
    OutlinedTextField(value=code,onValueChange={code=it})
    Button(onClick={ if(code=="070781011291") unlocked=true }){ Text("Unlock") }
   } else {
    Text("J&B.chat.app")
    chat.forEach{ Text(it) }
    OutlinedTextField(value=msg,onValueChange={msg=it}, label={Text("Message")})
    Button(onClick={ chat = chat + "You: $msg"; msg="" }){ Text("Send") }
   }
  }
 }
}