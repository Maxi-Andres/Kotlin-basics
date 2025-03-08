// Cuándo debería usar val y cuándo var. Por defecto definí tus variables como val, a menos de que necesites modificar las referencias. Por ejemplo: la edad de una persona debería poder modificarse, en
// cuanto al nombre puede ser que no necesites modificarlo o sí, eso dependerá de las reglas de negocio. El motivo principal es acotar el efecto en nuestros programas, mientras menor
// sea el efecto, más fácil es controlar nuestro software, y más fácil será testearlo.

// Companion object
// Kotlin provee la posibilidad de definir un objeto companion dentro de una clase, que es global para todas sus instancias

class Ave2 {
    companion object {
        var ENERGIA_MINIMA = 100
        fun subirEnergiaMinima(cuanto: Int) {
            ENERGIA_MINIMA += cuanto
        }

        fun crear() = Ave2()
    }

    var energia = 0
    fun esFeliz() = energia > ENERGIA_MINIMA
}
//en lugar de definir la referencia ENERGIA_MINIMA como constante por fuera de la clase, la asociamos al companion object
//para manipular la energía mínima (como por ejemplo para subirla o bajarla en base a un valor), debemos hacerlo también dentro del companion
//y también ofrecemos un método para crear un Ave, que por el momento solamente hace Ave(), pero el mecanismo de instanciación podría tornarse más complejo y el companion object es adecuado para tal fin.
//Todo lo que definimos en el companion object es accesible para atributos y métodos de instancia (como por ejemplo el método esFeliz). Desde otra clase, podemos invocar a la función que crea un ave de la siguiente manera:

val ave = Ave2.crear()

