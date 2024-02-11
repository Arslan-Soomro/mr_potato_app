package com.example.potatohead.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.snapshots.SnapshotStateMap
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.potatohead.R

@Composable
fun Layout(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    Box(modifier = modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            content()
        }
    }
}

@Composable
fun LabelCheckbox(checked: Boolean, onCheckedChange: (Boolean) -> Unit, label: String) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Checkbox(
            checked = checked,
            onCheckedChange = onCheckedChange
        )
        Text(text = label)
    }
}

@Composable
fun Potato(parts: SnapshotStateMap<String, Boolean>, modifier: Modifier = Modifier) {
    Row(modifier = Modifier) {
        Box {
            Image(
                painter = painterResource(id = R.drawable.body),
                contentDescription = "Potato Body",
                modifier = Modifier
                    .size(200.dp),
                contentScale = ContentScale.Fit
            )
            if (parts["Arms"] == true) {
                Image(
                    painter = painterResource(id = R.drawable.arms),
                    contentDescription = "Potato Arms",
                    modifier = Modifier.offset(x = 34.dp)
                )
            }
            if (parts["Ears"] == true) {
                Image(
                    painter = painterResource(id = R.drawable.ears),
                    contentDescription = "Potato Ears",
                    modifier = Modifier.offset(x = 34.dp)
                )
            }
            if (parts["Eyes"] == true) {
                Image(
                    painter = painterResource(id = R.drawable.eyes),
                    contentDescription = "Potato Eyes",
                    modifier = Modifier.offset(x = 34.dp)
                )
            }
            if (parts["Eyebrows"] == true) {
                Image(
                    painter = painterResource(id = R.drawable.eyebrows),
                    contentDescription = "Potato EyeBrows",
                    modifier = Modifier.offset(x = 34.dp)
                )
            }
            if (parts["Glasses"] == true) {
                Image(
                    painter = painterResource(id = R.drawable.glasses),
                    contentDescription = "Potato Glasses",
                    modifier = Modifier.offset(x = 34.dp)
                )
            }
            if (parts["Hat"] == true) {
                Image(
                    painter = painterResource(id = R.drawable.hat),
                    contentDescription = "Potato Hat",
                    modifier = Modifier.offset(x = 34.dp, y = -5.dp)
                )
            }
            if (parts["Mouth"] == true) {
                Image(
                    painter = painterResource(id = R.drawable.mouth),
                    contentDescription = "Potato Mouth",
                    modifier = Modifier.offset(x = 34.dp, y = 15.dp)
                )
            }
            if (parts["Nose"] == true) {
                Image(
                    painter = painterResource(id = R.drawable.nose),
                    contentDescription = "Potato Nose",
                    modifier = Modifier.offset(x = 34.dp)
                )
            }
            if (parts["Mustache"] == true) {
                Image(
                    painter = painterResource(id = R.drawable.mustache),
                    contentDescription = "Potato Mustache",
                    modifier = Modifier.offset(x = 34.dp)
                )
            }
            if (parts["Shoes"] == true) {
                Image(
                    painter = painterResource(id = R.drawable.shoes),
                    contentDescription = "Potato Shoes",
                    modifier = Modifier
                        .offset(x = 0.dp, y = 35.dp)
                        .width(200.dp)
                )
            }
        }
    }
}