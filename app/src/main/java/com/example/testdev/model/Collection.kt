package com.example.testdev.model

data class Collection(
    val href: String,
    val items: List<Item>,
    val metadata: Metadata,
    val version: String
)