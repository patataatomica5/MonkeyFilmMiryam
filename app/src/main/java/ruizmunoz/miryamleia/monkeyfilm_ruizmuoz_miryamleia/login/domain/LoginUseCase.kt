package ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.login.domain

import ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.login.data.LoginRepository

class LoginUseCase {
    private val respository= LoginRepository()

    suspend operator fun invoke(user: String, password: String) : Boolean {
        return respository.doLogin(user, password)
    }

}