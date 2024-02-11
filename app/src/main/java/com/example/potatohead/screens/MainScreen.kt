package com.example.potatohead.screens


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.potatohead.composables.Layout
import com.example.potatohead.globals.potatoParts
import com.example.potatohead.composables.LabelCheckbox
import com.example.potatohead.composables.Potato

@Composable
fun RenderMainScreen() {

    val partsState = remember {
        mutableStateMapOf(*potatoParts.map { it to false }.toTypedArray())
    }

    Layout {
        // Header
        Text(text = "Mr.Potato Head", fontSize = 20.sp, fontWeight = FontWeight.Bold, modifier=Modifier.padding(0.dp, 10.dp))
        // Potato Head

        // Parts Selector

        Spacer(modifier = Modifier.height(20.dp))
        Potato(parts = partsState)
        Text(text = "Click his parts to add/remove them!")
        Row {
            Column {
                for (name in potatoParts.take(5)) {
                    LabelCheckbox(
                        checked = partsState[name]!!,
                        onCheckedChange = { b -> partsState[name] = b },
                        label = name
                    )
                }
            }
            Spacer(modifier=Modifier.width(10.dp))
            Column {
                for (name in potatoParts.takeLast(5)) {
                    LabelCheckbox(
                        checked = partsState[name]!!,
                        onCheckedChange = { b -> partsState[name] = b },
                        label = name
                    )
                }
            }
        }
    }
}