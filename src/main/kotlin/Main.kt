

fun main(args: Array<String>) {
    println("Bienvenido a Restaurante Esperanza")
    println("Ingrese Usuario")
    val user = readln()
    println("Ingrese contraseña")
    val password = readLine()
    //Menu//
    println("Menu")
    println("1-  Venta Nueva")
    println("2-  Consultar Inventario")
    println("3- Cambiar contraseña")
    println("4  Salir del sistema")
    println("Ingrese digito")
    //Toma de Seleccion
    var seleccion = readln()!!.toInt()

    //switch  se convierte en  when en kotlin
    //Diferentes caminos segun seleccion del menu
        when {

            seleccion == 1 -> {
                println("Ingrese Nueva Venta")
            }

            seleccion == 2 -> {
                println("Consulta tu Inventario")
            }

            seleccion == 3 -> {
                println("Cambia tu Contraseña")
            }

            seleccion == 4 -> {
                println("Hasta Luego")
            }

            else -> {

                println("Ingrese una Opcion Valida")

            }


        }

}
