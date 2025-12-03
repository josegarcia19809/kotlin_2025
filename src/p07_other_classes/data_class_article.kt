package p07_other_classes

import p04_funciones.imprimirLinea

data class Article(
    var title: String,
    var content: String,
    val numberOfReaders: Int
)

fun getArticleList(): ArrayList<Article> {
    val articles = arrayListOf<Article>(
        Article(
            title = "Kotlin para Principiantes",
            content = "Una introducción sencilla al lenguaje Kotlin.",
            numberOfReaders = 1200
        ),
        Article(
            title = "Guía de Coroutines",
            content = "Aprende a manejar tareas asíncronas en Kotlin.",
            numberOfReaders = 980
        ),
        Article(
            title = "Data Classes Explicadas",
            content = "Todo lo que debes saber sobre las data classes.",
            numberOfReaders = 450
        ),
        Article(
            title = "Buenas Prácticas en Android",
            content = "Consejos para mejorar tus apps y tu código.",
            numberOfReaders = 3000
        ),
        Article(
            title = "Kotlin vs Java",
            content = "Comparación simple para entender sus diferencias.",
            numberOfReaders = 2100
        )
    )
    return articles
}


fun main() {
    val articles = getArticleList()

    val newArticles: ArrayList<Article> = arrayListOf()

    for (article in articles) {
        val newArticle = article.copy(title = article.title + " for my blog")
        newArticles.add(newArticle)
    }

    newArticles.forEachIndexed { index, article ->
        println("Índice ${index + 1} → ${article.title}")
        println("Contenido: ${article.content}")
        println("Número de lectores: ${article.numberOfReaders}")
        println()
        imprimirLinea()
    }
}