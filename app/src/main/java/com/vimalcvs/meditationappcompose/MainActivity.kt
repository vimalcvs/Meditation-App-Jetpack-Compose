package com.vimalcvs.meditationappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.vimalcvs.meditationappcompose.ui.components.FilterOptionsComponent
import com.vimalcvs.meditationappcompose.ui.components.HeaderProfileComponent
import com.vimalcvs.meditationappcompose.ui.components.MeditationTypesComponent
import com.vimalcvs.meditationappcompose.ui.components.SearchInputComponent
import com.vimalcvs.meditationappcompose.ui.theme.Grey
import com.vimalcvs.meditationappcompose.ui.theme.MeditationAppComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationAppComposeTheme {
                Column(
                    modifier = Modifier
                        .background(Grey)
                        .fillMaxSize()
                ) {
                    HeaderProfileComponent()
                    SearchInputComponent()
                    FilterOptionsComponent()
                    MeditationTypesComponent()
                }
            }
        }
    }
}
