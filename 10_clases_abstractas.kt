val ENERGIA_MINIMA2 = 10

// Una interfaz es útil cuando quieres asegurarte de que diferentes clases sigan un contrato común (por ejemplo, que todas tengan un metodo moverse), pero no te interesa cómo lo hacen internamente.
//  Es una forma de organizar y estructurar el código, permitiendo que diferentes tipos de objetos se comporten de una manera uniforme, incluso si tienen implementaciones completamente diferentes.

// Podemos definir a Ave como clase abstracta, esto producirá que no podamos instanciar objetos Ave. Una clase abstracta puede definir solo la interfaz de un metodo, lo que se conoce como metodo abstracto.
// Veamos el siguiente ejemplo:

abstract class Ave5(var energia: Int) {
    open fun volar() { energia = energia - 10 }
    fun comer(cuanto: Int) { energia = energia + (cuanto * 2) }
    abstract fun esFeliz(): Boolean
    fun resetearEnergia() { energia = 0 }
}

class Golondrina2(energia: Int) : Ave5(energia) {
    override fun esFeliz() = true
}

class Torcaza2(energia: Int) : Ave5(energia) {
    var vecesQueVolo = 0
    override fun volar() {
        super.volar()
        vecesQueVolo++
    }
    override fun esFeliz() = energia < ENERGIA_MINIMA2
}

class Ornitologo {
    fun trabajar() {
        val ave = Golondrina2(energia = 100)
        ave.comer(2)
        ave.volar()
    }
}

// Podemos definir a Ave como clase abstracta, esto producirá que no podamos instanciar objetos Ave. Una clase abstracta puede definir solo la interfaz de un metodo,
//  lo que se conoce como metodo abstracto.