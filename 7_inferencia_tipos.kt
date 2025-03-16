fun main() {
    // Inferencia de tipo en variables simples
    val numero = 10  // Kotlin infiere que el tipo es Int
    val texto = "Hola, Kotlin"  // Kotlin infiere que el tipo es String
    val decimal = 3.14  // Kotlin infiere que el tipo es Double
    val esVerdadero = true  // Kotlin infiere que el tipo es Boolean

    println("Número: $numero")
    println("Texto: $texto")
    println("Decimal: $decimal")
    println("Es Verdadero: $esVerdadero")

    // Inferencia de tipos en colecciones
    val listaNumeros = listOf(1, 2, 3, 4)  // Kotlin infiere que el tipo es List<Int>
    val conjuntoLetras = setOf('a', 'b', 'c')  // Kotlin infiere que el tipo es Set<Char>
    val mapa = mapOf("a" to 1, "b" to 2)  // Kotlin infiere que el tipo es Map<String, Int>

    println("Lista de números: $listaNumeros")
    println("Conjunto de letras: $conjuntoLetras")
    println("Mapa: $mapa")

    // Inferencia en funciones
    val suma = { a: Int, b: Int -> a + b }  // Kotlin infiere que la función es (Int, Int) -> Int
    val resultado = suma(5, 3)
    println("Resultado de la suma: $resultado")
}
