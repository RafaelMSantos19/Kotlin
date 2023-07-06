fun main() {
    val str="Coding in Kotlin"

    println(str)

    //Tamanho numerico da string
    println(str.length)

    //Acessando possição expecifica da String
    println("Acessando possição 10 da String: ${str[10]}")

    //Verificando qual e o inicio da String
    println(str.startsWith("c",true))
    println(str.startsWith("a",false))

    //Retorna um pedaço da string
    println(str.substring(10,16))

    //Troca parte da String
    println(str.replace("Kotlin","Java"))

    //Deixa a string toda em caixa baixa
    println(str.lowercase())

    //Deixa a string toda em caixa alta
    println(str.uppercase())

    //Remove espaçoes em branco do inicio da string
    println("                123445".trim())



}


