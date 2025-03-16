// Clase base
open class Ave4(var energia: Int = 10) { // open se tiene que usar si queres hacer subclases, o que sea abstractra (siempre son abiertas esas)
    companion object { // companion object: Esta palabra clave define un objeto que pertenece a la clase en lugar de a sus instancias. Los miembros de este objeto pueden ser accedidos sin necesidad de crear una instancia de la clase.
        const val ENERGIA_MINIMA = 20
    }
    open fun esFeliz(): Boolean { // lo mismo con los metodos
        return energia > ENERGIA_MINIMA
    }
    open fun volar() {
        println("El ave está volando con $energia de energía.")
    }
}

// Subclase Golondrina que hereda de Ave
class Golondrina : Ave4() {
    override fun esFeliz(): Boolean { // Golondrina siempre es feliz
        return true
    }
}

// Subclase Torcaza que hereda de Ave
class Torcaza(energia: Int) : Ave4() {
    var vecesQueVolo = 0
    override fun volar() { // Como regla general solo deben utilizar super cuando no puedan utilizar this, como en este caso: de lo contrario entrarían en loop infinito si invocaran a this.volar().
        super.volar() // Llama al metodo volar de la superclase Ave
        vecesQueVolo++
        println("La torcaza ha volado $vecesQueVolo veces.")
    }
}

fun main() {
    val ave = Ave4()
    val golondrina = Golondrina()
    val torcaza = Torcaza(energia = 50)

    // Llamada al metodo esFeliz()
    println("Ave feliz: ${ave.esFeliz()}")  // True si energia < ENERGIA_MINIMA
    println("Golondrina feliz: ${golondrina.esFeliz()}")  // Siempre true
    println("Torcaza feliz: ${torcaza.esFeliz()}")  // True si energia < ENERGIA_MINIMA

    // Llamada al metodo volar()
    ave.volar()
    golondrina.volar()
    torcaza.volar()  // Llama a super.volar() y después incrementa el contador de vuelos
}
