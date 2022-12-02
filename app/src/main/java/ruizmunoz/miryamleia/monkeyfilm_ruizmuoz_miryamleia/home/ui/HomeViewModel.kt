package ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.home.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.home.domain.HomeUseCase
import ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.model.MediaModel

class HomeViewModel: ViewModel() {

    private var _listaPelis = MutableLiveData<List<MediaModel>>()
    var listaPeliculas : LiveData<List<MediaModel>> = _listaPelis

    val homeUseCase = HomeUseCase()

    fun changeList(){
        listaPeliculas = _listaPelis
    }


    fun devolverLista(){
        viewModelScope.launch {
            _listaPelis = MutableLiveData(homeUseCase())
            changeList()
        }
    }
}