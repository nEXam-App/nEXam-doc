package com.example.nexam.test

import cucumber.api.CucumberOptions

@CucumberOptions(
    features = ["features"],
    glue = ["com.example.nexam.cucumber.steps"],
    tags = ["@e2e", "@smoke"]
)

@java.lang.SuppressWarnings("unused")

class CucumberOptions