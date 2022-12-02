package ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.home.ui.Home
import ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.home.ui.HomeViewModel
import ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.login.ui.Login
import ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.login.ui.LoginViewModel
import ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.model.Routes
import ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.registro.domain.infopeli.ui.RegistroViewModel
import ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.registro.ui.Registro

@Composable
fun CustomNavigator(){
    val loginviewmodel = LoginViewModel()
    val homeviewmodel = HomeViewModel()
    homeviewmodel.devolverLista()

    val registroviewmodel = RegistroViewModel()

    /*val infopeliviewmodel = InfoPeliViewModel()
    val añadirpeliviewmodel = AñadirPeliViewModel()*/

    val navigationController = rememberNavController()

    NavHost(navController = navigationController, startDestination = Routes.LoginScreen.route) {
        composable(route = Routes.LoginScreen.route) {
           Login(loginviewmodel, navigationController)
        }

        composable(route = Routes.HomeScreen.route) {
            Home(homeviewmodel)
        }

        /*
        composable(route = Routes.RegistroScreen.route) {
            Registro(registroviewmodel)
        }*/

        /*
        composable(route = Routes.InfoPeliScreen.route) {
            InfoPeli(infopeliviewmodel)
        }

        composable(route = Routes.AñadirPeliScreen.route) {
            Añadirpeli(añadirpeliviewmodel)
        }*/

    }
}