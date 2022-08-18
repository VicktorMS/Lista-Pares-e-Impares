fun main(){
    val triangulo = listOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 0)
    val fibonacci = listOf(1, 1, 2, 3, 5, 8, 13, 21, 34)
    val vazio = listOf<Int>()

    fun separarNumPareImpar(lista: List<Int>) {
        var pares = mutableListOf<Int>()
        var impares = mutableListOf<Int>()
        var soma = 0
        var prod = 1
        for(c in lista){
            if (c % 2 != 0){impares.add(c)}
            else{pares.add(c)}
        }
        for(c in pares){soma += c}
        for(c in impares){prod *= c}
        return println("LISTA: ${lista}\nNúmeros pares: ${pares} \nNúmeros impares: ${impares} \n" +
                "Soma de Números pares: ${soma} \nProduto de Números Impares: ${prod}\n")
    }
    separarNumPareImpar(triangulo)
    separarNumPareImpar(fibonacci)
}
