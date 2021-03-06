import models.*

fun main() {
    println("KOTLIN")
    val p1 = Persona()
    println(p1.nombre)
    p1.edad = 20
    println(p1.show())
    p1.edad = -1
    try {
        p1.setEdad(-1)
    } catch (e: Exception) {
        println(e.message)
    }
    println(p1.edad)
    p1.edad = 10
    println(p1.edad)

    val p3 = PersonaJ("Pepe", 20)
    println(p3.show())
    val p5 = Persona(edad = 20)
    val p6 = Persona(nombre = "Prueba")
    println(p6.isMayorDeEdad)
    val p7 = Persona(nombre = null)
    println(p7.nombre?.uppercase() ?: "No tiene nombre")

    val o1 = Ordenador(marca = "HP", precio = 32.0)
    println(o1)
    val (marca, precio) = o1
    println("$marca, $precio")
    val o2 = o1.copy(precio = 33.0)
    println(o2)
    val o3 = Ordenador(marca = "HP", precio = 32.0)
    println(o3)

    val s1 = Servidor
    println(s1)
    println(s1.uuid)
    val s2 = Servidor
    println(s2)
    println(s2.uuid)

    println(Ordenador.size)
    val o4 = Ordenador.create("HP", 32.0)
    println(o4.fechaVenta)

    val prog = Programador("Juan", 20, 3)
    println(prog)
    val progKotlin = ProgramadorKotlin("Ana", 20, 3)
    println(progKotlin)
    progKotlin.disfrutar()
    val prog2: IKotlin = ProgramadorKotlin("Eva", 18, 1)
    prog2.disfrutar()

    val o5 = Ordenador.create("HP", 32.0)
    println(o5)
    println(o5.precioActual)
    o5.precioActual = 33.0
    println(o5.precioActual)


//    println("JAVA")
//    val p2 = PersonaJ()
//    println(p2.nombre)
//    p2.edad = 20
//    println(p2.show())
//    try {
//        p2.edad = -1
//    } catch (e: Exception) {
//        println(e.message)
//    }
//    println(p2.edad)
//    p2.edad = 10
//    println(p2.edad)
//
//    val p4 = PersonaJ("Pepe", 20)
//    println(p4.show())
//    val p8 = PersonaJ(null, 2)

    // Tipos plataforma
    val personaJava = PersonaJ("Juan", 20)
    val nombre = personaJava.nombre
    val nombreNull = personaJava.nombreNull
    val nombreNotNull = personaJava.nombreNotNull
    println("${nombre.length}, ${nombreNull?.length}, ${nombreNotNull.length}")

    // Object expression
    val azahara = object {
        val nombre = "Azahara"
        var edad = 20
    }
    println(azahara.nombre)
    println(azahara.edad)
    azahara.edad = 21
    println(azahara.edad)


}