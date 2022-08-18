//Faça um programa que exiba "Infnet", caso o primeiro elemento de uma lista seja menor
// que o último, e "Tenfni", caso contrário.
fun main(){
    val triangulo = listOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 0)
    val fibonacci = listOf(1, 1, 2, 3, 5, 8, 13, 21, 34)
    val vazio = listOf<Int>()

    fun exibirInfnet(lista: List<Int>){
        if (lista[0] < lista[(lista.size) - 1]){
            println("Infnet")
        } else{
            println("Tenfni")
        }
    }

    exibirInfnet(triangulo)
    exibirInfnet(fibonacci)
}