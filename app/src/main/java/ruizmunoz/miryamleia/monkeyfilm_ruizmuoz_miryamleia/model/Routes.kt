package ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.model

sealed class Routes(val route : String) {
    object LoginScreen: Routes("login")
    object HomeScreen: Routes("home")
    object RegistroScreen: Routes("registro")
    object AñadirPeliScreen: Routes("añadirpeli")
    object InfoPeli: Routes("infopeli")
}