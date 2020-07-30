package com.justai.jaicf.channel.aimybox.api

import com.justai.jaicf.api.BotResponse
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonObject

@Serializable
data class AimyboxBotResponse(
    val query: String,
    var text: String? = null,
    var action: String? = null,
    var intent: String? = null,
    var question: Boolean = true,
    val data: MutableMap<String, JsonObject> = mutableMapOf(),
    val replies: MutableList<AimyboxReply> = mutableListOf()
): BotResponse