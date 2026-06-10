package com.example.businesscard
import com.example.mainactivity.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCard()
        }
    }
}

@Composable
fun BusinessCard() {
    val androidGreen = Color(0xFF3DDC84)

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = androidGreen
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            CardTop()
            CardBottom()
        }
    }
}

@Composable
fun CardTop() {
    Column(
        modifier = Modifier.padding(top = 100.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // 修复：R.drawable.avatar 替换为正确的 Compose 资源调用
        Image(
            painter = painterResource(id = R.drawable.avatar), // 临时用系统图标，避免报错
            contentDescription = "Avatar Logo",
            modifier = Modifier.size(120.dp)
        )

        Text(
            text = "Jin Xiao Yan",
            fontSize = 40.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Information Technology Teacher",
            fontSize = 16.sp,
            color = Color(0xFF004D40)
        )
    }
}

@Composable
fun CardBottom() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 60.dp)
    ) {
        HorizontalDivider()
        ContactRow(icon = Icons.Default.Call, info = "+18788278998")
        HorizontalDivider()
        ContactRow(icon = Icons.Default.Share, info = "@AndroidDev")
        HorizontalDivider()
        ContactRow(icon = Icons.Default.Email, info = "2628192034@qq.com")
        HorizontalDivider()
    }
}

@Composable
fun ContactRow(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    info: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Spacer(modifier = Modifier.width(40.dp))
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFF004D40),
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(20.dp))
        Text(text = info, color = Color.White, fontSize = 16.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBusinessCard() {
    BusinessCard()
}