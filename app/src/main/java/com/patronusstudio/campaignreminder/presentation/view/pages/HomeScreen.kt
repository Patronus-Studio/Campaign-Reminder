package com.patronusstudio.campaignreminder.presentation.view.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.patronusstudio.campaignreminder.presentation.theme.AppColor
import com.patronusstudio.campaignreminder.presentation.view.widgets.CurrentDayCard
import com.patronusstudio.campaignreminder.presentation.view.widgets.HomeBar

/**
 * @author iamcodder
 * Created 11.12.2024 at 23:15
 */
@Preview(device = Devices.PIXEL_7_PRO, showSystemUi = true)
@Composable
fun HomeScreen(){
    Column(modifier = Modifier.fillMaxSize().background(Brush.linearGradient(
        listOf(AppColor.PinkMaterial100,AppColor.PinkMaterial50,AppColor.BlueVeryLight,AppColor.BlueLight)
    ))) {
        HomeBar()
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
            CurrentDayCard()
        }
    }
}





