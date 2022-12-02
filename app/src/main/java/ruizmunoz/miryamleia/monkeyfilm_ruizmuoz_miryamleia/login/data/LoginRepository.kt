package ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.login.data

import ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.login.data.network.LoginService

class LoginRepository {
    private val api = LoginService()

    suspend fun doLogin(user: String, password: String) : Boolean {
        return api.doLogin(user, password)
    }
}