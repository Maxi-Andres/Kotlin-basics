import java.math.BigDecimal


//Strings
// Un string se encierra entre dobles comillas, o bien podemos aprovechar para escribir un texto largo con triples comillas dobles (lo que nos permite incluso utilizar enters).
// Podemos interpolar referencias de Kotlin mediante $ o bien utilizar código ejecutable usando ${zzz} donde zzz es código Kotlin.

class Cliente {
    var nombre = "Juan" // string simple
    fun saludo() = "Hola $nombre" // string simple interpolando una referencia
    fun otroSaludo() = "Hola ${nombre.uppercase()}" // interpolamos una expresión
    // string con múltiples líneas interpolando código Kotlin
    fun saludoFormal() =
        """
        Bienvenido, ${nombre.trim()} a nuestra aplicación.
        En breve nos contactaremos con ud.
        """
}

//Números
// Existen muchos tipos de datos diferentes para números:
//Int: es un número entero que admite negativos pero sin decimales
//Double, Float: son números reales que admiten decimales pero con errores en las operaciones, es por ello que no debemos usarlo para operaciones sensibles (como transacciones
// bancarias o que requieran cálculos exactos). ¿Por qué? Por este código que podés probar en este REPL

//BigDecimal: es el tipo de dato que conviene utilizar ya que no produce errores de redondeo (permite trabajar con una cantidad exacta de decimales y truncarlos o redondearlos en caso de ser necesario)
// todo: Tenes que importarlo fijate arriba

fun main() {
    val a: Double = 0.02
    val b: Double = 0.03
    val c: Double = b - a
    System.out.println(c)  // 0.009999999999999998

    val d: BigDecimal = BigDecimal("0.02")
    val e: BigDecimal = BigDecimal("0.03")
    val f: BigDecimal = e - d
    System.out.println(f)    // 0.01

    //Tanto Int, como Double como BigDecimal representan objetos a los que podés enviarle mensajes:

    val numero: Double = 10.0
    System.out.println(numero.inc())   // 11.0
    System.out.println(numero.rem(3))  // 1.0

}





