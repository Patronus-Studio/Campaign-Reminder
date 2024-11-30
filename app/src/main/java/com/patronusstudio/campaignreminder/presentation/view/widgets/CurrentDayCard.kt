package com.patronusstudio.campaignreminder.presentation.view.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.patronusstudio.campaignreminder.R
import com.patronusstudio.campaignreminder.presentation.theme.AppColor
import com.patronusstudio.campaignreminder.presentation.theme.AppShape
import com.patronusstudio.campaignreminder.presentation.theme.TextColor

/**
 * @author iamcodder
 * Created 30.11.2024 at 17:40
 */

@Preview(device = Devices.PIXEL_7_PRO, showSystemUi = true)
@Composable
fun CurrentDayCard(
    date: String = "20 September, 2020", maxWidth: Float = 0.8f, maxHeight: Float = 0.1f
) {
    Row {

    }
    Box(
        Modifier
            .fillMaxWidth(maxWidth)
            .fillMaxHeight(maxHeight)
            .clip(AppShape.roundedCorner24dp)
            .background(AppColor.PinkMaterial50, AppShape.roundedCorner24dp)
            .border(2.dp, AppColor.White, AppShape.roundedCorner24dp)
            .border(1.dp, AppColor.PinkMaterial100, AppShape.roundedCorner24dp)
            .shadow(
                1.dp,
                AppShape.roundedCorner24dp,
                clip = true,
                ambientColor = AppColor.PinkMaterial100,
                spotColor = AppColor.PinkMaterial100
            )
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(date, fontWeight = FontWeight.Black, color = TextColor.Grey, fontSize = 16.sp)
            Spacer(Modifier.width(16.dp))
            Box(
                Modifier
                    .size(50.dp)
                    .background(
                        Brush.radialGradient(
                            colors = listOf(
                                AppColor.Red, AppColor.Transparent10
                            )
                        ), AppShape.circleShape
                    ), contentAlignment = Alignment.Center
            ) {
                Surface(shape = AppShape.circleShape,
                    modifier = Modifier
                        .size(36.dp)
                        .background(AppColor.Red, shape = AppShape.circleShape)
                        .clickable { }) {
                    Box(
                        Modifier
                            .size(36.dp)
                            .clip(AppShape.circleShape)
                            .background(AppColor.PinkCongo, AppShape.circleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(R.drawable.baseline_calendar_today_24_white),
                            contentDescription = "Calendar",
                            modifier = Modifier.fillMaxSize(0.45f)
                        )

                    }
                }
            }
        }
    }
}

