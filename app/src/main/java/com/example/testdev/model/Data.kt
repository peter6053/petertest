package com.example.testdev.model

import java.io.Serializable

class Data(
    var album: List<String>,
    var center: String,
    var date_created: String,
    var description: String,
    var description_508: String,
    var keywords: List<String>,
    var location: String,
    var media_type: String,
    var nasa_id: String,
    var photographer: String,
    var secondary_creator: String,
    var title: String,
) : Serializable