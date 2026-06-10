# Lab2 实验报告

## 一、名片展示的个人信息
1. 姓名：Jin Xiao Yan
2. 职位：Information Technology Teacher
3. 联系电话：+18788278998
4. 社交账号：@AndroidDev
5. 邮箱地址：2628192034@qq.com

## 二、布局结构说明
本次使用 **Jetpack Compose** 实现名片界面，整体布局采用声明式 UI 构建：

1. 主界面使用 **BusinessCard** 作为根可组合函数，内部使用 **Surface** 作为背景容器，并设置自定义背景色。
2. 整体采用 **Column** 纵向布局，将界面分为上下两部分，通过 `verticalArrangement = Arrangement.SpaceBetween` 实现上下分布。
3. 上半部分 **CardTop**：
   - 继续使用 **Column** 垂直排列
   - 包含 **Image** 组件展示头像
   - 包含两个 **Text** 组件，分别显示姓名和职位
4. 下半部分 **CardBottom**：
   - 使用 **Column** 垂直排列
   - 通过 **Divider** 实现分割线效果
   - 调用自定义 **ContactRow** 组件展示联系方式
5. **ContactRow** 组件：
   - 使用 **Row** 横向布局
   - 左侧 **Icon** 显示 Material 图标
   - 右侧 **Text** 显示具体信息
   - 使用 **Spacer** 控制间距

整体嵌套结构：
BusinessCard → Column → CardTop + CardBottom
CardBottom → Column → Divider + ContactRow

## 三、遇到的问题与解决过程
1. **问题**：预览界面长时间不显示，运行无结果
   解决：Android Studio 预览缓存问题，使用刷新预览、重启预览、同步 Gradle 后正常显示。

2. **问题**：头像图片无法加载，提示资源不存在
   解决：将图片正确放入 res/drawable 目录，确保文件名全英文、无空格，代码中使用 R.drawable.avatar 正确引用。

3. **问题**：图标与文字没有对齐，排版不美观
   解决：给 Row 设置 verticalAlignment = Alignment.CenterVertically，使图标与文字居中对齐。

4. **问题**：背景颜色过于鲜艳
   解决：使用自定义颜色值 Color(0xFF3DDC84)，统一界面风格。

5. **问题**：组件之间间距不统一，界面拥挤
   解决：使用 Modifier.padding() 和 Spacer 精确控制间距，让界面更整洁。