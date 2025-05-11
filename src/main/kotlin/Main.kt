fun main() {
    var continuar = 1

    while (continuar == 1) {
        print("Digite o nome do herói: ")
        val nameHero = readLine()

        print("Digite a quantidade de XP do herói: ")
        val xpInput = readLine()
        val xpHeroi = xpInput?.toIntOrNull()

        if (nameHero.isNullOrBlank() || xpHeroi == null || xpHeroi < 0) {
            println("Entrada inválida. Tente novamente.")
            continue
        }

        val nivel = when {
            xpHeroi < 1000 -> "Ferro"
            xpHeroi < 2000 -> "Bronze"
            xpHeroi < 5000 -> "Prata"
            xpHeroi < 7000 -> "Ouro"
            xpHeroi < 8000 -> "Platina"
            xpHeroi < 9000 -> "Ascendente"
            xpHeroi < 10000 -> "Imortal"
            else -> "Radiante"
        }

        println("O Herói de nome $nameHero está no nível de $nivel")

        print("Deseja continuar com outro herói?\nDigite \n1 - Continuar\n2 - Parar: ")
        continuar = readLine()?.toIntOrNull() ?: 2
    }
}
