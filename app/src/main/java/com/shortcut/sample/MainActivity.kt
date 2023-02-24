package com.shortcut.sample

import android.app.Activity
import android.content.ComponentName
import android.content.Intent

class MainActivity : Activity() {
    override fun onResume() {
        super.onResume()

        startActivity(
            Intent().setComponent(
                ComponentName(
                    "com.google.android.googlequicksearchbox",
                    "com.google.android.apps.search.weather.WeatherExportedActivity"
                )
            )
        )
        finish()
    }
}