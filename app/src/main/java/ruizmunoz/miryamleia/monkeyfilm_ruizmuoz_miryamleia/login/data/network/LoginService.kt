package ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.login.data.network

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.core.network.RetrofitHelper

class LoginService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun doLogin(user: String, password: String) : Boolean {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(LoginClient::class.java).doLogin()
            response.body()?.loginOk ?: false
        }
    }
}