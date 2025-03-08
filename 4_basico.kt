// Objetos singleton

object Pepita {
    var energia = 100
    fun volar(minutos: Int) {
        energia -= minutos * 2 + 10
    }
    fun comer(gramos: Int) {
        energia += gramos * 4
    }
}

fun main() {
    Pepita.energia = 150
    Pepita.volar(5)
    Pepita.comer(2)
    System.out.println("La energia de pepita es ${Pepita.energia}")  // "La energia de pepita es 88"
}

// Pepita es una instancia que se puede acceder globalmente, representa una implementación thread safe del Singleton que es más trabajosa de implementar en Java
// (podés investigar más en este artículo). Si trabajaste en Wollok (o Scala) el concepto es exactamente similar, solo que el nombre debe comenzar con mayúscula.