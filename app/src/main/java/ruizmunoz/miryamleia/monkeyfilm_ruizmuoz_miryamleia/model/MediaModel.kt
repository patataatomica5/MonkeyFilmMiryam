package ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.model

import androidx.annotation.DrawableRes

data class MediaModel(
    var id: Int,
    var title: String,
    var description: String,
    var catel: Int,
    var score: Int,
    var favorite: Boolean = false,
    var category: String,
    var genre: List<String>
)
