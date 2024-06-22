package com.example.zhazira_4_1_hw.ui.models

import java.io.Serializable

data class User(
    var name: String,
    val email: String,
    val password: String
): Serializable


