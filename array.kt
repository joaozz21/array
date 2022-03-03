fun main() {
    val itens = mutableListOf<String>("tênis","camiseta")

    do {
        print("\n1= Armazene um item ao estoque:\n" +
                "2= Remover um item do estoque\n" +
                "3= Atualizar itens do estoque.\n" +
                "4= Apresentar todos os itens do estoque\n" +
                "5= Encerrar programa\n")
        print("Escolha a função que deseja executar no estoque: ")
        val num= readLine()!!.toInt()

        when (num) {
            1 -> {
                println("\nAdicione um item ao estoque: ")
                val item = readLine()!!
                if(item.isEmpty()){
                    println("nenhum item adicionado.")
                }else{
                    itens.add(item)
                }
            }
            2 -> {
                println("\nRemova um item do estoque")
                val item = readLine()!!
                if(itens.contains(item)){
                    itens.remove(item)
                    println("$item removido com sucusso!")
                } else if(item.isEmpty()){
                    println("nenhum item removido.")
                }
                else{
                    println("O item $item não existe no estoque!")
                }
            }
            3 -> {
                println("\nAtualize um item do estoque")

            }
            4 -> {
                println("\nMostrar todos os itens do estoque")
                itens.forEach {
                    println(it)
                }
            }
        }
    } while(num!=5)
}

/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/