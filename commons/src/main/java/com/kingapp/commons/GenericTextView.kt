package com.kingapp.commons


import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.kingapp.commons.ui.theme.ModularProyectTheme


@Composable
fun GenericTextView(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ModularProyectTheme {
        GenericTextView(name = "Button 1 ")
    }
}