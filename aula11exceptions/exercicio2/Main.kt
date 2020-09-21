package aula11exceptions.exercicio2

fun main() {
    val lista: ArrayList<String>? = null

    lista?.add("Pato")
    lista?.add("Cachorro")
    lista?.add("Gato")

    try {
        println(lista?.get(5))
    } catch (exception: Exception) {
        println(exception.toString())
        println(exception.stackTrace)
    }
}