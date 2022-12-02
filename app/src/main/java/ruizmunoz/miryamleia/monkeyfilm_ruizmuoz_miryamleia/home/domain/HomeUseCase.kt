package ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.home.domain

import ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.home.data.HomeRepository
import ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.model.MediaModel

class HomeUseCase {
    private val repository = HomeRepository()

    suspend operator fun invoke() :List<MediaModel>{
        return repository.doPelis()
    }
}