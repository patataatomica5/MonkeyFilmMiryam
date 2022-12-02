package ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.home.data.network

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.core.network.RetrofitHelper
import ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.model.MediaModel


class HomeService{
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun doPelis():List<MediaModel>{
        return withContext(Dispatchers.IO){
            val response = retrofit.create(HomeClient::class.java).doListaPelis()
            response.body()?.homeLista ?: emptyList()
        }
    }
}