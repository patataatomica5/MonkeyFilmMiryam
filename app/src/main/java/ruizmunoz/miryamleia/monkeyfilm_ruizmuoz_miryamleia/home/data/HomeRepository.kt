package ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.home.data

import ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.home.data.network.HomeService
import ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.model.MediaModel

class HomeRepository {
    private val api = HomeService()

    suspend fun doPelis():List<MediaModel>{
        return api.doPelis()
    }
}