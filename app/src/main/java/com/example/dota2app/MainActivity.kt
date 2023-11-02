package com.example.dota2app

import android.content.ClipData.Item
import android.media.audiofx.AudioEffect.Descriptor
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat
import com.example.dota2app.ui.theme.TransparentStatusBar
import java.util.Date

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WindowCompat.setDecorFitsSystemWindows(window, false)
            TransparentStatusBar() //задаем прозрачность статус бара


            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(5, 11, 24))
            ) {


                item {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.Black)
                    ) {

                        HeaderImage()

                        Box(
                            modifier = Modifier
                                .padding(top = 330.dp)
                                .clip(RoundedCornerShape(20.dp, 20.dp, 0.dp, 0.dp))
                                .fillMaxSize()
                                .background(Color(5, 11, 24))

                        ) {
                            Column() {

                                Row(
                                    modifier = Modifier.padding(start = 124.dp, top = 15.dp),
                                    verticalAlignment = Alignment.Bottom
                                ) {
                                    Column {
                                        Text(
                                            text = "DoTA 2",
                                            style = TextStyle(
                                                fontSize = 20.sp,
                                                lineHeight = 26.sp,
                                                fontFamily = FontFamily(Font(R.font.sk_modernist_regular)),
                                                fontWeight = FontWeight(700),
                                                color = Color(0xFFFFFFFF),

                                                letterSpacing = 0.5.sp,
                                            )
                                        )
                                        Image(modifier = Modifier.padding(top = 8.dp),
                                            painter = painterResource(id = R.drawable.star),
                                            contentDescription = "image description",
                                            contentScale = ContentScale.None
                                        )
                                    }
                                    Text(
                                        text = "70M",
                                        style = TextStyle(
                                            fontSize = 12.sp,
                                            fontFamily = FontFamily(Font(R.font.sk_modernist_regular)),
                                            fontWeight = FontWeight(400),
                                            color = Color(0xFF45454D),

                                            letterSpacing = 0.5.sp,
                                        )
                                    )


                                }

                                TypeGame(listOf("MOBA", "MULTIPLAYER", "STRATEGY"))

                                Descriptin(
                                    desc = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two " +
                                            "teams of five players compete to collectively destroy a large structure defended " +
                                            "by the opposing team known as the \"Ancient\", whilst defending their own."
                                )

                                PreviewGame(list = listOf(R.drawable.img1, R.drawable.img2))


                                Text(
                                    modifier = Modifier.padding(start = 24.dp, top = 20.dp),
                                    text = "Review & Ratings",
                                    style = TextStyle(
                                        fontSize = 16.sp,
                                        fontFamily = FontFamily(Font(R.font.sk_modernist_regular)),
                                        fontWeight = FontWeight(700),
                                        color = Color(0xFFEEF2FB),

                                        letterSpacing = 0.6.sp,
                                    )
                                )




                                Row(modifier = Modifier.padding(start = 24.dp, top = 12.dp)) {
                                    Text(
                                        text = "4.9",
                                        style = TextStyle(
                                            fontSize = 48.sp,
                                            fontFamily = FontFamily(Font(R.font.sk_modernist_regular)),
                                            fontWeight = FontWeight(700),
                                            color = Color(0xFFFFFFFF),

                                            )
                                    )
                                    Column(modifier = Modifier.padding(start = 16.dp, top = 8.dp)) {
                                        Image(modifier = Modifier.padding(top = 8.dp),
                                            painter = painterResource(id = R.drawable.star),
                                            contentDescription = "image description",
                                            contentScale = ContentScale.None
                                        )
                                        Text(
                                            modifier = Modifier.padding(top = 8.dp),
                                            text = "70M Reviews",
                                            style = TextStyle(
                                                fontSize = 12.sp,
                                                fontFamily = FontFamily(Font(R.font.sk_modernist_regular)),
                                                fontWeight = FontWeight(400),
                                                color = Color(0xFFA8ADB7),

                                                letterSpacing = 0.5.sp,
                                            )
                                        )
                                    }
                                }


                            }
                        }
                        PrintLogo()


                    }
                }
                items(listOf(CommentItemRowModel(R.drawable.dota,"Artor", Date(), "Asssssssssssssss"),
                    CommentItemRowModel(R.drawable.dota,"Artor", Date(), "AsssssFF\nFFFFFFF\nFfff fffffff\nfff ffffFF\nF FFFFFFF FFFFFFdd\ndddd dddd ddFFFFFFFFF\nFFF FFssssssssss"),
                    CommentItemRowModel(R.drawable.dota,"Artor", Date(), "Asssssssssssssss"),
                    CommentItemRowModel(R.drawable.dota,"Artor", Date(), "Asssssssssssssss"),
                    CommentItemRowModel(R.drawable.dota,"Artor", Date(), "Asssssssssssssss")
                    )
                ) {

                    item -> CommentItemRow(item = item)
                }
            }


        InstallButton()
        }
    }
}


@Composable
fun InstallButton(){

    Box(contentAlignment = Alignment.Center,
        modifier = Modifier
            .padding(start = 24.dp, end = 24.dp, top = 728.dp)
            .width(345.dp)
            .height(64.dp)
            .clickable {

            }
            .background(
                color = Color(0xFFF4D144), shape = RoundedCornerShape(size = 12.dp)

            )

    ){

        Text(modifier = Modifier
            .width(59.dp)
            .height(24.dp),
            text = "Install",
            style = TextStyle(
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.sk_modernist_regular)),
                fontWeight = FontWeight(700),
                color = Color(0xFF050B18),

                letterSpacing = 0.6.sp,
            )
        )
    }

}


    @Composable
    fun HeaderImage() {
        Image(
            painter = painterResource(id = R.drawable.dota),
            modifier = Modifier
                .fillMaxWidth()
                .height(375.dp),
            contentDescription = "Background Image",
            contentScale = ContentScale.Crop
        )

    }


    @Composable
    fun PrintLogo() {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .padding(top = 309.dp, start = 21.dp)
                .size(85.dp)
                .border(2.dp, Color(31, 36, 48), RoundedCornerShape(15.dp))
                .clip(RoundedCornerShape(15.dp))
                .background(color = Color.Black)

        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = null,
                modifier = Modifier
                    .size(54.dp)
            )
        }
    }

    @Composable
    fun TypeGame(list: List<String>) {
        LazyRow(modifier = Modifier.padding(top = 35.dp, start = 21.dp)) {
            items(list) { item ->
                Box(
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .clip(RoundedCornerShape(15.dp))
                        .background(Color(21, 50, 77))
                ) {
                    Text(
                        modifier = Modifier.padding(
                            start = 11.dp,
                            end = 11.dp,
                            top = 4.dp,
                            bottom = 4.dp
                        ), text = item, style = TextStyle(
                            fontSize = 10.sp,
                            fontFamily = FontFamily(Font(R.font.montserratregular)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFF41A0E7)
                        )
                    )
                }
            }
        }
    }


    @Composable
    fun Descriptin(desc: String) {
        Text(
            modifier = Modifier.padding(start = 21.dp, top = 30.dp, end = 27.dp),
            text = desc,
            style = TextStyle(
                fontSize = 12.sp,
                lineHeight = 19.sp,
                fontFamily = FontFamily(Font(R.font.sk_modernist_regular)),
                fontWeight = FontWeight(400),
                color = Color(0xB2EEF2FB),
            )
        )
    }


    @Composable
    fun PreviewGame(list: List<Int>) {
        LazyRow(modifier = Modifier.padding(top = 15.dp, start = 21.dp)) {
            items(list) { item ->
                Image(
                    painter = painterResource(id = item),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(end = 15.dp)
                        .clip(RoundedCornerShape(15.dp))
                        .size(width = 240.dp, height = 135.dp)

                )
            }
        }
    }