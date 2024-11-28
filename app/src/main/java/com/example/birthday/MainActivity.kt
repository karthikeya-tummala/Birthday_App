package com.example.birthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthday.ui.theme.BirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BirthdayTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    image(
                        name = "Karthik",
                        org = "GITAM",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun image(name: String, org: String, modifier: Modifier = Modifier) {
    Box {
        Image(
            painter = painterResource(R.drawable.androidparty),
            contentDescription = "Background",
        )
        wish(name, org, modifier = Modifier.fillMaxSize().padding(8.dp))
    }
}

@Composable
fun wish(name: String, org: String, modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.Center, modifier = modifier.padding(6.dp)) {
        Text(
            text = "Happy Birthday to $name!",
            fontSize = 85.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = "From $org",
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BirthdayTheme {
        wish("Karthik", "GITAM")
    }
}