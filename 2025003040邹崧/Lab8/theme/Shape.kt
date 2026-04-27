package com.example.myapplication.ui.theme // 原superheroes→myapplication
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

// 全局形状配置：统一圆角风格
val Shapes = Shapes(
    small = RoundedCornerShape(8.dp),   // 图片圆角
    medium = RoundedCornerShape(16.dp), // 卡片/按钮圆角
    large = RoundedCornerShape(24.dp)   // 大容器圆角
)