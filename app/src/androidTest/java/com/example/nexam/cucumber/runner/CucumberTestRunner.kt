package com.example.nexam.cucumber.runner

import androidx.test.runner.AndroidJUnitRunner
import cucumber.api.android.CucumberInstrumentationCore
import android.os.Bundle
import com.example.nexam.BuildConfig
import com.example.nexam.cucumber.runner.CucumberTestRunner

class CucumberTestRunner : AndroidJUnitRunner() {
    private val instrumentationCore = CucumberInstrumentationCore(this)
    override fun onCreate(bundle: Bundle) {
        val tags = BuildConfig.TEST_TAGS
        if (!tags.isEmpty()) {
            bundle.putString(CUCUMBER_TAGS_KEY, tags.replace("\\s".toRegex(), ""))
        }
        var scenario = BuildConfig.TEST_SCENARIO
        if (!scenario.isEmpty()) {
            scenario = scenario.replace(" ".toRegex(), "\\\\s")
            bundle.putString(CUCUMBER_SCENARIO_KEY, scenario)
        }
        instrumentationCore.create(bundle)
        super.onCreate(bundle)
    }

    override fun onStart() {
        waitForIdleSync()
        instrumentationCore.start()
    }

    companion object {
        private const val CUCUMBER_TAGS_KEY = "tags"
        private const val CUCUMBER_SCENARIO_KEY = "name"
    }
}