package com.ipt.android.api.model

import com.google.gson.annotations.SerializedName

/**
 * class used to store the Token used to access API
 */

data class TokenJWT (
    @SerializedName("token") val token: String?
)