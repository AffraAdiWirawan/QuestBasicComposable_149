package com.example.pertemuan3


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pertemuan3.ui.theme.Pertemuan3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pertemuan3Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    basicColumn(modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


@Composable
fun basicColumn(modifier: Modifier =  Modifier){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier.fillMaxSize())
    {
        Text(
            "Login",
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold)

        Text(text = "Ini adalah halaman login",
            fontSize = 17.sp)
        Spacer(modifier = Modifier.padding(10.dp))

        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "",
            modifier = Modifier
                .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 0.dp)
                .size(210.dp)
        )
        Text(
            "Nama",
            fontSize = 19.sp
        )

        Text(text = "Affra Adi Wirawan",
            fontSize = 17.sp,
            color = Color.Red
        )

        Text(
            "20220140149",
            fontSize = 35.sp,
        )
        Image(
            painter = painterResource(id = R.drawable.gambar),
            contentDescription = "",
            modifier = Modifier
                .padding(16.dp)
                .size(420.dp)
                .clip(RoundedCornerShape(215.dp))
                .graphicsLayer(
                    alpha = 1.0f, // Mengatur transparansi untuk efek lecek
                    translationY = -10f, // Memberikan sedikit efek posisi
                    scaleX = 1.02f, // Mengubah ukuran sedikit untuk efek
                    scaleY = 1.02f
                )
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    }
}

@Preview(showBackground = true)
