val ENERGIA_MINIMA = 10 // esto es una const es referenciable dentro de cualquier clase que esté dentro de ese archivo

class Ave {
    var energia = 0 // la variable energia es una variable de instancia porque cada objeto Ave tiene su propio valor.

    //Por defecto los métodos que no devuelven nada no tienen ninguna anotación de tipo, se dice que son void o Unit.
    fun volar() { energia = energia - 10 }  // son metodos realmente no funciones

    fun comer(cuanto: Int) { energia = energia + (cuanto * 2) }

    //los métodos que solo devuelven valores y tienen una sola línea se definen con el símbolo =
    fun esFeliz() = energia > ENERGIA_MINIMA
    //también es posible definir un metodo que devuelve un valor mediante las llaves, definiendo una anotación de tipo para el metodo
    /*fun esFeliz(): Boolean {
        return energia > ENERGIA_MINIMA
    }*/

    fun resetearEnergia() { energia = 0 }
}
// Kotlin automáticamente define getters y setters para la variable energia (no es necesario hacer nada, mientras no especifiquemos la visibilidad del atributo a privada, de la siguiente manera: private var energia = 0)
// La manera de invocar al GETTER es: objeto.atributo y la manera de invocar al SETTER es objeto.atributo = valor


class Pepe {
    private var name: String = "pepito" // si la haces privada no se puede acceder con getter ni setter
    private var edad: Int = 10
    private var peso: Int = 0

    fun showEdad() {
        println("La edad de $name es $edad")
    }
}

fun main() {
    val pepe = Pepe()
    pepe.showEdad()
}
