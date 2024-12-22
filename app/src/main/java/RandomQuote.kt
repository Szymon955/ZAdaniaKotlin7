// Singleton zarządzający cytatami
object QuoteManager {
    private val quotesList = mutableListOf(
        "Sigma boy is sigma boy",
        "Mam na imie Marek jestem programista",
        "Lewy to boss"
    )

    // Pobieranie losowego cytatu
    fun getRandomQuote(): String {
        return if (quotesList.isNotEmpty()) {
            quotesList.random()
        } else {
            "Nie ma, dodaj :)"
        }
    }

    // Dodawanie nowego cytatu
    fun addQuote(quote: String) {
        quotesList.add(quote)
    }
}

fun main() {
    while (true) {
        println("Wybierz opcję:")
        println("1. Wyświetl losowy cytat")
        println("2. Dodaj nowy cytat")
        println("3. Zakończ")


        when (readLine()?.toIntOrNull()) {
            1 -> println("Losowy cytat: ${QuoteManager.getRandomQuote()}")
            2 -> {
                println("Podaj nowy cytat:")
                val newQuote = readLine()
                if (!newQuote.isNullOrBlank()) {
                    QuoteManager.addQuote(newQuote)
                    println("Dodano nowy cytat")
                } else {
                    println("Cytat nie może być pusty")
                }
            }
            3 -> {
                println("Zakończono")
                break
            }
            else -> println("Nieprawidłowa opcja, spróbuj ponownie")
        }
    }
}
