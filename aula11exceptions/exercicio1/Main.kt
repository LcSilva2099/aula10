package aula11exceptions.exercicio1

fun main() {
    val lista = mutableListOf<String>()

    lista.add("Pato")
    lista.add("Cachorro")
    lista.add("Gato")

    //teste

    try {
        println(lista[3])
    } catch (exception: Exception) {
        println("Exceção: ${exception.message}")
        println(exception.stackTrace)
    }
    // comentario do matheus teste branch
    // comentario do raul teste branch
}