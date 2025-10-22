package p05_poo.videojuegosApp

fun main() {
    val juego1 = Videojuego("The legend of Zelda", "Aventura", "Nintendo Switch", 2017)
    println(juego1.mostrarDatos())

    val juego2 = Videojuego("Halo Infinite", "Shooter", "Xbox Series X", 2021)
    println(juego2.mostrarDatos())

    val juego3 = Videojuego("Among Us", "Party", "PC", 2018)
    println(juego3.mostrarDatos())

    val juego4 = Videojuego("Minecraft", "Sandbox", "PC", 2011)
    println(juego4.mostrarDatos())

    val juego5 = Videojuego("Fortnite", "Battle Royale", "PC", 2017)
    println(juego5.mostrarDatos())

    val juego6 = Videojuego("Super Mario Odyssey", "Aventura", "Nintendo Switch", 2017)
    println(juego6.mostrarDatos())

    val juego7 = Videojuego("Cyberpunk 2077", "RPG", "PlayStation 4", 2020)
    println(juego7.mostrarDatos())

    val juego8 = Videojuego("The Witcher 3", "RPG", "PC", 2015)
    println(juego8.mostrarDatos())

    val juego9 = Videojuego("Call of Duty: Warzone", "Shooter", "PlayStation 4", 2020)
    println(juego9.mostrarDatos())

    val juego10 = Videojuego("Animal Crossing", "Simulación", "Nintendo Switch", 2020)
    println(juego10.mostrarDatos())

    val juego11 = Videojuego("Resident Evil Village", "Horror", "PlayStation 4", 2021)
    println(juego11.mostrarDatos())

    val juego12 = Videojuego("God of War", "Acción", "PlayStation 4", 2018)
    println(juego12.mostrarDatos())

    // Crear lista de videojuegos
    val listaVideojuegos = ArrayList<Videojuego>()

    listaVideojuegos.add(juego1)
    listaVideojuegos.add(juego2)
    listaVideojuegos.add(juego3)
    listaVideojuegos.add(juego4)
    listaVideojuegos.add(juego5)
    listaVideojuegos.add(juego6)
    listaVideojuegos.add(juego7)
    listaVideojuegos.add(juego8)
    listaVideojuegos.add(juego9)
    listaVideojuegos.add(juego10)
    listaVideojuegos.add(juego11)
    listaVideojuegos.add(juego12)

    println("-".repeat(100))

    for (juego in listaVideojuegos) {
        println(juego.mostrarDatos())
    }
}