//En Kotlin, al igual que muchos otros lenguajes, se diferencian las referencias como
//Variables: son referencias que pueden inicializarse apuntando a un objeto, y luego reasignarse a otro

class Perro () {
    var nombre = ""
}

fun main() {
    var unString = "Pepito"
    unString = "Otro String"  // ✅ Se puede reasignar porque es 'var'
    //Constantes: son referencias que nacen apuntando a un valor y no pueden ser modificadas para apuntar a otro objeto. Serían como “constantes”.


    val constante = "Constante"
    // constante = "Otro"  // ❌ NO COMPILA: 'val' no permite reasignación
    //constante = "Otro"  // <----- NO COMPILA !

//¡Ojo! no confundir el hecho de que no se pueda modificar la “referencia” de la mutabilidad/inmutabilidad del objeto al que apunta. Puedo tener un “val” apuntando a un elemento que sí mute.
    val perro = Perro()  // 'perro' es inmutable, pero su contenido no
    perro.nombre = "Juan"  // ✅ Esto SÍ compila
    // perro = Perro()  // ❌ NO COMPILA: 'val' no permite reasignar la referencia
    perro.nombre = "Carlos"  // ✅ Se puede cambiar el nombre SI COMPILA y puedo mutar la referencia nombre de perro
}