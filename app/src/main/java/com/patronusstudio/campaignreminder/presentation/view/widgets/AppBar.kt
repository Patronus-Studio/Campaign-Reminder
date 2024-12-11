package com.patronusstudio.campaignreminder.presentation.view.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.patronusstudio.campaignreminder.presentation.theme.AppColor
import com.patronusstudio.campaignreminder.presentation.theme.AppShape
import com.patronusstudio.campaignreminder.presentation.theme.TextColor

/**
 * @author iamcodder
 * Created 30.11.2024 at 20:34
 */
@Preview(device = Devices.PIXEL_7_PRO, showSystemUi = true)
@Composable
fun HomeBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .safeContentPadding(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text("Takvim Hatırlatıcı", fontWeight = FontWeight.Normal, color = TextColor.DarkerBlue, fontSize = 24.sp)
        CustomButton {

        }
    }
}

@Preview()
@Composable
fun CustomButton(text: String = "Ekle", btnListener: () -> Unit = {}) {
    Box(
        Modifier
            .safeContentPadding()
            .wrapContentHeight()
            .wrapContentWidth()
            .background(
                Brush.verticalGradient(
                    colors = listOf(AppColor.Transparent10, AppColor.PinkMaterial100),
                    tileMode = TileMode.Repeated
                ), AppShape.roundedCorner36dp
            )
        , contentAlignment = Alignment.Center
    ) {
        Surface(shape = AppShape.roundedCorner36dp,
            modifier = Modifier
                .padding(vertical = 5.dp, horizontal = 5.dp)
                .clip(AppShape.roundedCorner36dp)
                .background(AppColor.Red, shape = AppShape.roundedCorner36dp)
                .clickable { btnListener.invoke() }) {
            Box(
                Modifier
                    .clip(AppShape.roundedCorner36dp)
                    .background(AppColor.PinkCongo, AppShape.roundedCorner36dp)
                    .padding(vertical = 8.dp, horizontal = 32.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(text, fontWeight = FontWeight.Black, color = TextColor.White, fontSize = 20.sp)
            }
        }
    }

}