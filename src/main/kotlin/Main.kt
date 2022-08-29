fun main(args: Array<String>) {

    //Usuarios
    // --- Administradores
    val adm1  =  "Admin"
    val adm2  =  "admin"
    val admpsw = "admin123"

    // --- Vendedores
    val vdr1 = "Vendedor"
    val vdr2 = "vendedor"
    val vdrpsw = "vendedor123"

    // --- Invitados
    val inv1 = "Invitado"
    val inv2 = "invitado"
    val invpsw = "invitado123"

    var intento = 1

    do{
        println(" *****  Bienvenido al sistema Restaurante Esperanza  *****")
        println("               Favor Ingrese credenciales\n\n             ")

        //Ingresar usuario
        print("--> Ingrese Usuario: ")
        val user = readln()

        //Imgresar contraseña
        print("--> Ingrese contraseña: ")
        val password = readLine()

        if (user == adm1 && admpsw == password || user == adm2 && admpsw == password) {

            println(" ***** Bienvenido Administrador *****\n")

            //Menu para admin
            println(" ---------- Menu ----------")
            println("1- Venta Nueva")
            println("2- Consultar Inventario")
            println("3- Cambiar contraseña")
            println("4- Salir del sistema")
            print("Ingrese digito: ")
            val seleccion = readln().toInt()

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

        } else {
            if (user == vdr1 && vdrpsw == password || user == vdr2 && vdrpsw == password) {

                println(" ***** Bienvenido Vendedor *****\n")

                //Menu para Vendedor
                println(" ---------- Menu ----------")
                println("1- Venta Nueva")
                println("2- Consultar Inventario")
                println("3- Salir del sistema")
                print("Ingrese digito: ")
                val seleccion = readln().toInt()

                when {
                    seleccion == 1 -> {
                        println("Ingrese Nueva Venta")
                    }
                    seleccion == 2 -> {
                        println("Consulta tu Inventario")
                    }
                    seleccion == 3 -> {
                        println("Hasta Luego")
                    }
                    else -> {
                        println("Ingrese una Opcion Valida")
                    }
                }
            } else {
                if (user == inv1 && invpsw == password || user == inv2 && invpsw == password) {

                    println(" ***** Bienvenido Invitado *****\n")

                    //Menu para Invitado
                    println(" ---------- Menu ----------")
                    println("1- Consultar Inventario")
                    println("2- Salir del sistema")
                    print("Ingrese digito: ")
                    val seleccion = readln().toInt()

                    when {
                        seleccion == 1 -> {
                            println("Consulta tu Inventario")
                        }
                        seleccion == 2 -> {
                            println("Hasta Luego")
                        }
                        else -> {
                            println("Ingrese una Opcion Valida")
                        }
                    }
                }
                else {
                    intento ++
                    println("\n¡Usuario no registrado!")
                    println("Intento No. $intento \n\n\n")
                }
            }
        }
    }while (intento <= 3) //Cantidad de intentos de ingreso de usuario

<<<<<<< HEAD
    //Comentario de prueba para mi rama 

=======
    println("!El sistema está desactivado!")
    println("Intertar de nuevo")
>>>>>>> JaredR
}
