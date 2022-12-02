package ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.home.data.network.response

import com.google.gson.annotations.SerializedName
import ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.model.MediaModel

data class HomeResponse(@SerializedName("success") val homeLista: List<MediaModel>)
