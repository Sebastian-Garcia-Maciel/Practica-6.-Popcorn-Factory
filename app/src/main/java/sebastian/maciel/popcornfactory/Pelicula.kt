package sebastian.maciel.popcornfactory

data class Pelicula(
    var title: String,
    var image: Int,
    var header: Int,
    var sinopsis: String,
    var seats: ArrayList<Cliente>
) {

}