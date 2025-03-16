// Clase con un constructor que tiene un valor por defecto para el parámetro 'energia'
class Ave3(var energia: Int = 0) {
    fun volar() {
        println("El ave está volando con $energia de energía.")
    }
}

fun main() {
    // Para instanciar un objeto, Kotlin no utiliza la palabra new, simplemente se invoca mediante el nombre de la clase y paréntesis:
    val pepita = Ave3()
    pepita.volar()  // Salida: El ave está volando con 0 de energía.

    // Crear un objeto pasando un valor para energia
    val ave = Ave3(energia = 150)
    ave.volar()  // Salida: El ave está volando con 150 de energía.

    // Si no definimos un valor por defecto para energia, se vuelve obligatorio pasar un valor
    // Este código daría error si descomentamos esta línea:
    // val otraAve = Ave3()  // ERROR: No value passed for parameter 'energia'

    // Crear un objeto con el valor obligatorio para energia
    val otraAve = Ave3(energia = 200)
    otraAve.volar()  // Salida: El ave está volando con 200 de energía.
}
