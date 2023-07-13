import kotlin.math.round

fun exercioFuncoes(){

    fun valoresAnos(anos: Int){
        println("Questao 1")
        println("$anos equivale a:")
        var meses = anos*12
        println("meses: $meses")
        var dias = meses*30
        println("dias: $dias")
        var horas = dias*24
        println("horas: $horas")
        var minutos = horas*60
        println("minutos: $minutos")
        var segundos = minutos*60
        println("segundos: $segundos")
        println(">>>>>>>>>>>>>>>>>>>>>>>>>>")
    }

    fun quantidadeDeLetras(palavra: String){

        println("Questao 2")

        var tamanho = palavra.length

        println("A o texto infromado($palavra) tem $tamanho letras")

        println(">>>>>>>>>>>>>>>>>>>>>>>>>>")

    }

    fun calculoDoCubo(numero: Int){
        var cubo = numero*numero*numero

        println("Questao 3")
        println("o valor do cubo de $numero e igual a: $cubo")

        println(">>>>>>>>>>>>>>>>>>>>>>>>>>")
    }

    fun converteMilhasParaKm(milhas: Int){

        var km = milhas * 1.6

        println("Questao 4")
        println("$milhas valem ${km} kilometros")

        println(">>>>>>>>>>>>>>>>>>>>>>>>>>")

    }


    // Print das respostas

    valoresAnos(2)

    quantidadeDeLetras("Hipopotamo")

    calculoDoCubo(10)

    converteMilhasParaKm(1)

}