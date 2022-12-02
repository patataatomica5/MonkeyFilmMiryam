package ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.registro.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun Registro(registroviewmodel: NavHostController) {
        Column(
            modifier= Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Row(){
                var texto by remember { mutableStateOf("") }
                var max= 50
                OutlinedTextField(
                    value = texto,
                    onValueChange = {
                        if(it.length <= max){
                            texto = it
                        }
                    },
                    label= { Text(text= "Usuario") },
                    colors= TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor= Color.Magenta,
                        unfocusedBorderColor = Color.Magenta
                    )
                )
            }
            Row(){
                var texto by remember { mutableStateOf("") }
                var max= 50
                OutlinedTextField(
                    value = texto,
                    onValueChange = {
                        if(it.length <= max){
                            texto = it
                        }
                    },
                    label= { Text(text= "Email") },
                    colors= TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor= Color.Magenta,
                        unfocusedBorderColor = Color.Magenta
                    )
                )
            }
            Row(){
                var texto by remember { mutableStateOf("") }
                var max= 50
                OutlinedTextField(
                    value = texto,
                    onValueChange = {
                        if(it.length <= max){
                            texto = it
                        }
                    },
                    label= { Text(text= "Contraseña") },
                    colors= TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor= Color.Magenta,
                        unfocusedBorderColor = Color.Magenta
                    ),
                    visualTransformation= PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(keyboardType= KeyboardType.Password)
                )
            }

            Row(){
                var texto by remember { mutableStateOf("") }
                var max = 50
                OutlinedTextField(
                    value = texto,
                    onValueChange = {
                        if(it.length <= max){
                            texto = it
                        }
                    },
                    label= { Text(text= "Repite la contraseña") },
                    colors= TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor= Color.Magenta,
                        unfocusedBorderColor = Color.Magenta
                    ),
                    visualTransformation= PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(keyboardType= KeyboardType.Password)
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 60.dp, vertical = 10.dp),
                horizontalArrangement = Arrangement.Start
            ){
                Text(text = "Intereses")
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 60.dp, vertical = 10.dp),
                horizontalArrangement = Arrangement.Start
            ){
                Box(){
                    var state by rememberSaveable { mutableStateOf(false) }
                    Checkbox(checked = state, onCheckedChange = {state = !state})
                    Text(
                        text= "Deportes",
                        modifier= Modifier.padding(40.dp, 15.dp, 0.dp, 0.dp)
                    )
                }

                Box(){
                    var state by rememberSaveable{ mutableStateOf(false) }
                    Checkbox(checked = state, onCheckedChange = {state = !state})
                    Spacer(modifier= Modifier.width(8.dp))
                    Text(
                        text= "Romance",
                        modifier= Modifier.padding(40.dp, 15.dp, 0.dp, 0.dp)
                    )
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 60.dp, vertical = 10.dp),
                horizontalArrangement = Arrangement.Start
            ){
                Box(){
                    var state by rememberSaveable { mutableStateOf(false) }
                    Checkbox(checked = state, onCheckedChange = {state = !state})
                    Text(
                        text= "Acción",
                        modifier= Modifier.padding(40.dp, 15.dp, 0.dp, 0.dp)
                    )
                }

                Box(){
                    var state by rememberSaveable{ mutableStateOf(false) }
                    Checkbox(checked = state, onCheckedChange = {state = !state})
                    Spacer(modifier= Modifier.width(8.dp))
                    Text(
                        text= "Historicas",
                        modifier= Modifier.padding(40.dp, 15.dp, 0.dp, 0.dp)
                    )
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 60.dp, vertical = 10.dp),
                horizontalArrangement = Arrangement.Start
            ){
                Box(){
                    var state by rememberSaveable { mutableStateOf(false) }
                    Checkbox(checked = state, onCheckedChange = {state = !state})
                    //Spacer(modifier= Modifier.width(8.dp))
                    Text(
                        text= "Sci-Fi",
                        modifier= Modifier.padding(40.dp, 15.dp, 0.dp, 0.dp)
                    )
                }

                Box(){
                    var state by rememberSaveable{ mutableStateOf(false) }
                    Checkbox(checked = state, onCheckedChange = {state = !state})
                    Spacer(modifier= Modifier.width(8.dp))
                    Text(
                        text= "Documentales",
                        modifier= Modifier.padding(40.dp, 15.dp, 0.dp, 0.dp)
                    )
                }
            }

            Row(){
                Button(
                    modifier= Modifier
                        .height(60.dp)
                        .width(340.dp),
                    onClick = {/*volver al login*/},
                    colors= ButtonDefaults.buttonColors(backgroundColor = Color.Magenta)
                ) {
                    Text(text= "Enviar")
                }
            }
        }
    }