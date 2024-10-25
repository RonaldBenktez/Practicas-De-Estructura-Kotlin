import java.io.File

fun leerArchivo(ruta: String): String {
    val archivo = File(ruta)
    return archivo.readText()
}

fun escribirArchivo(ruta: String, content: String) {
    val archivo = File(ruta)
    archivo.writeText(content)
}

fun main(args: Array<String>) {
    val ruta = "C:\\Users\\PCmierda\\Desktop\\kotlin\\practica 6\\documentos\\archivo.txt"
    val contenido = leerArchivo(ruta)
    
    /* Ejemplo 1: Lectura de archivo */
    println(contenido)
    println("\n")
    
    /* Ejemplo 2: Escribir un archivo */
    val escritura = "vuelve en una prueba de appendText"
    
    escribirArchivo(ruta, escritura)
    println("Prueba Exitosamente")
}
