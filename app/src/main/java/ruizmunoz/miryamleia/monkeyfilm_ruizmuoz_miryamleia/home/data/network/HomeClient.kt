package ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.home.data.network


import retrofit2.Response
import retrofit2.http.GET
import ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.home.data.network.response.HomeResponse

interface HomeClient {
    @GET("/v3/ba19d40a-9750-4413-bd70-9c6e703cc9e9")
    suspend fun doListaPelis(): Response<HomeResponse>
}