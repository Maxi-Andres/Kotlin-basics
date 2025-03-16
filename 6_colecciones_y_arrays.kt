// Colecciones mutables e inmutables
// En Kotlin, todas las colecciones vienen en dos “sabores”: mutables e inmutables. Las primeras soportan modificar sus elementos (agregar, quitar, actualizar), mientras que las segundas
// solo permiten acceder a sus elementos. Queda a criterio de quien programa cuál utilizar en cada caso, prefiriendo desde este espacio las inmutables (porque algo que no se puede modificar es menos propenso a errores).
// Existen literales para definir listas, conjuntos y mapas (dictionaries):

fun main() {
    // Lista inmutable
    val myList = listOf("Hello", "World")
    myList.size
    // ERROR, no puedo agregar un elemento a una lista inmutable
    // └ myList.add("Goodbye")

    // Lista mutable
    val myMutableList = mutableListOf("Hello", "World")
    myMutableList.add("Goodbye")
    println(myMutableList[1])  // "World"

    // Set inmutable
    val mySet = setOf("Hello", "World")
    // ERROR, no puedo agregar un elemento a un set inmutable
    // └ mySet.add("Goodbye")

    // Set mutable
    val myMutableSet = mutableSetOf("Hello", "World")
    myMutableSet.add("Goodbye")
    myMutableSet.add("Hello")  // no tiene efecto porque ya hay un elemento "Hello"
    println("${myMutableSet.size}")  // 3

    // Mapa/Diccionario inmutable
    val myMap = mapOf("a" to 1 , "b" to 2)
    // ERROR, no puedo agregar un elemento a un set inmutable
    // └ myMap.set("c", 3)

    val myMutableMap = mutableMapOf("a" to 1 , "b" to 2)
    myMutableMap.set("c", 3)
    println("${myMutableMap.size}")  // 3

//Rangos con arrays
    // Array de enteros con valores [0, 0, 0, 0, 0]
    val arrZeros = IntArray(5)

    // Array de enteros de tamaño 5 con valores [42, 42, 42, 42, 42]
    val arrConstants = IntArray(5) { 42 }

    // Podemos utilizar una lambda para inicializar un array: [0, 1, 2, 3, 4]
    var arrLambda = IntArray(5) { it }
    // ... o [1, 2, 3, 4, 5]
    var arrLambda2 = IntArray(5) { it + 1 }
}

//Recordemos que
// listas: respetan el orden en el que se agregan (como una fila) y admiten duplicados.
// conjuntos: no tienen orden y tampoco admiten duplicados. Dos objetos son iguales en base a la definición de equals() y hashCode().
// mapas: son un conjunto de pares clave/valor. Se acceden por clave.
// Ojo 👀: no hay que mezclar las ideas de val y var con la (in)mutabilidad de las colecciones. Por ejemplo, una colección inmutable podría estar referenciada con var, mientras que una mutable podría ser val.







