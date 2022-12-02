package ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.login.data.network.response

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("ok")
    val loginOk: Boolean
)
