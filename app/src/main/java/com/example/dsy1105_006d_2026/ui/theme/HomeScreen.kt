package com.example.dsy1105_006d_2026.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dsy1105_006d_2026.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun HomeScreen(){
    //Genera una pantalla basica
    Scaffold(
      topBar ={
          TopAppBar({Text("Mi App en Kptlin")})
      }  // fin top

    ) // fin Scaff
    // Se refiere a un espacio para que queden los componentes Scaffold
    {innerPadding ->
        Column(
            modifier= Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            Text("!!!!  Bienvenido !!!!!")
            Button(onClick ={/*Accion futura*/ } ) {
                Text ("Presoname")
            }

            Image(
                painter = painterResource(id=R.drawable.logoduoc),
                contentDescription = "Logo App",
                modifier= Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.Fit
            )


        }// fin column



    }// fin inner

}// fin HomeScreen



@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}