package com.example.dota2app

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CommentItemRow(item: CommentItemRowModel) {

    var isExpanded by remember {
        mutableStateOf(false)
    }

    Column (modifier = Modifier
        .padding(start = 24.dp, top = 26.dp, end = 24.dp)
        .background(Color(5, 11, 24))){


        Row(
            modifier = Modifier

                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically

        ) {
            Image(
                painter = painterResource(id = item.imageId),
                contentDescription = "image",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .size(36.dp)
                    .clip(
                        CircleShape
                    )
            )
            Column(
                modifier = Modifier
                    .padding(15.dp),

                ) {
                    Text(modifier = Modifier
                        .padding(bottom = 7.dp),
                        text = "Auguste Conte",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.sk_modernist_regular)),
                            fontWeight = FontWeight(400),
                            color = Color(0xFFFFFFFF),

                            letterSpacing = 0.5.sp,
                        )
                    )



                Text(
                    text = item.date.toString(),
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontFamily = FontFamily(Font(R.font.sk_modernist_regular)),
                        fontWeight = FontWeight(400),
                        color = Color(0x66FFFFFF),

                        letterSpacing = 0.5.sp,
                    )
                )
            }

        }

        Text(modifier = Modifier.clickable {
            isExpanded = !isExpanded
            },
            maxLines = if (isExpanded) 10 else 5,
            text = item.text ,
            style = TextStyle(
                fontSize = 12.sp,
                lineHeight = 20.sp,
                fontFamily = FontFamily(Font(R.font.sk_modernist_regular)),
                fontWeight = FontWeight(400),
                color = Color(0xFFA8ADB7),

                letterSpacing = 0.5.sp,
            )
        )


        Box(modifier = Modifier
            .padding(top = 24.dp, start = 26.dp, end = 37.dp)
            .border(width = 1.dp, color = Color(0xFF1A1F29))
            .size(width = 300.dp, height = 1.dp)
        )


    }
}