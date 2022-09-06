package com.example.testdev.model

import java.io.Serializable

data class Item(
    val data: List<Data>,
    val href: String,
    val links: List<Link>
) : Serializable