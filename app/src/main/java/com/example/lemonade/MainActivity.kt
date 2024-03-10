package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonadeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LemonadeApp()
                }
            }
        }
    }
}

@Composable
fun LemonadeApp(modifier: Modifier = Modifier) {
    var currentStep by remember { mutableIntStateOf(1) }

    Column(
        verticalArrangement = Arrangement.Top,
        modifier = modifier
    ) {
        // Header
        Text(
            text = stringResource(R.string.app_name),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(color = colorResource(R.color.lemonade_yellow))
                .padding(20.dp)
                .fillMaxWidth()
        )
        // Content
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            when(currentStep) {
                1 -> {
                    Image(
                        painter = painterResource(R.drawable.lemon_tree),
                        contentDescription = stringResource(R.string.lemon_tree_literal),
                        modifier = Modifier
                            .background(
                                color = colorResource(R.color.image_background),
                                shape = AbsoluteRoundedCornerShape(
                                    topLeft = 30.dp,
                                    topRight = 30.dp,
                                    bottomLeft = 30.dp,
                                    bottomRight = 30.dp
                                )
                            )
                            .padding(
                                vertical = 20.dp,
                                horizontal = 40.dp
                            )
                            .wrapContentSize()
                            .clickable {
                                currentStep = 2
                            }
                    )
                    Text(
                        text = stringResource(R.string.lemon_tree),
                        fontSize = 18.sp
                    )
                }

                2 -> {
                    Image(
                        painter = painterResource(R.drawable.lemon_squeeze),
                        contentDescription = stringResource(R.string.lemon_literal),
                        modifier = Modifier
                            .background(
                                color = colorResource(R.color.image_background),
                                shape = AbsoluteRoundedCornerShape(
                                    topLeft = 30.dp,
                                    topRight = 30.dp,
                                    bottomLeft = 30.dp,
                                    bottomRight = 30.dp
                                )
                            )
                            .padding(
                                vertical = 20.dp,
                                horizontal = 40.dp
                            )
                            .wrapContentSize()
                            .clickable {
                                currentStep = 3
                            }
                    )
                    Text(
                        text = stringResource(R.string.lemon),
                        fontSize = 18.sp
                    )
                }
                3 -> {
                    Image(
                        painter = painterResource(R.drawable.lemon_drink),
                        contentDescription = stringResource(R.string.glass_of_lemon_description),
                        modifier = Modifier
                            .background(
                                color = colorResource(R.color.image_background),
                                shape = AbsoluteRoundedCornerShape(
                                    topLeft = 30.dp,
                                    topRight = 30.dp,
                                    bottomLeft = 30.dp,
                                    bottomRight = 30.dp
                                )
                            )
                            .padding(
                                vertical = 20.dp,
                                horizontal = 40.dp
                            )
                            .wrapContentSize()
                            .clickable {
                                currentStep = 4
                            }
                    )
                    Text(
                        text = stringResource(R.string.glass_of_lemon),
                        fontSize = 18.sp
                    )
                }
                4 -> {
                    Image(
                        painter = painterResource(R.drawable.lemon_restart),
                        contentDescription = stringResource(R.string.glass_of_lemon_description),
                        modifier = Modifier
                            .background(
                                color = colorResource(R.color.image_background),
                                shape = AbsoluteRoundedCornerShape(
                                    topLeft = 30.dp,
                                    topRight = 30.dp,
                                    bottomLeft = 30.dp,
                                    bottomRight = 30.dp
                                )
                            )
                            .padding(
                                vertical = 20.dp,
                                horizontal = 40.dp
                            )
                            .wrapContentSize()
                            .clickable {
                                currentStep = 1
                            }
                    )
                    Text(
                        text = stringResource(R.string.glass_of_lemon),
                        fontSize = 18.sp
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LemonadePreview() {
    LemonadeTheme {
        LemonadeApp()
    }
}