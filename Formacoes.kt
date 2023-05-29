// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(
    val nome: String,
    val idade: Int,
    val email: String
)

data class ConteudoEducacional(
    var nome: String,
    val duracao: Int = 0
)

data class Formacao(
    val nome: String,
    val duracaoTotal: Int = 0,
    var conteudos: List<ConteudoEducacional>,
    val nivel: Nivel
) {
    private val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {

    val user1 = Usuario("Maria da Silva", 35, "maria.silva@outlook.com")
    val user2 = Usuario("José dos Santos", 40, "jose.santos@hotmail.com")
    val user3 = Usuario("Jonas Pinheiro", 53, "jonas.pinheiro@gmail.com")
    val user4 = Usuario("Camila Andrade", 25, "mila.andrade@gmail.com")

    val conteudosKotlin: List<ConteudoEducacional> = listOf(
        ConteudoEducacional("Princípios de Agilidade e Desenvolvimento de Software", 18),
        ConteudoEducacional("Docker Fundamentals", 7),
        ConteudoEducacional("Desafios de Código", 10),
        ConteudoEducacional("Dominando a Linguagem de Programação Kotlin", 14),
        ConteudoEducacional("Explorando o Spring Framework com Java e Kotlin", 21)
    )

    val conteudosHTML: List<ConteudoEducacional> = listOf(
        ConteudoEducacional("Lógica de Programação Essencial", 4),
        ConteudoEducacional("Introdução ao Git e ao GitHub", 3),
        ConteudoEducacional("Introdução a Criação de Websites com HTML5 e CSS3", 7),
        ConteudoEducacional("Introdução a Programação com JavaScript", 13)
    )

    val conteudosCloudFullstack: List<ConteudoEducacional> = listOf(
        ConteudoEducacional("Primeiras Páginas Interativas com JavaScript", 18),
        ConteudoEducacional("Dominando Algoritmos com Desafios de Código JavaScript", 10),
        ConteudoEducacional("Começando no Framework Angular", 22),
        ConteudoEducacional("Dominando a Linguagem de Programação Java", 27),
        ConteudoEducacional("Ganhando Produtividade com Spring Framework", 19),
        ConteudoEducacional("Princípios Cloud Computer com AWS", 10)
    )

    val conteudosJava: List<ConteudoEducacional> = listOf(
        ConteudoEducacional("Princípios de Desenvolvimento de Software", 14),
        ConteudoEducacional("Conhecendo a Linguagem de Programação Java", 25),
        ConteudoEducacional("Trabalhando com Banco de Dados SQL e NoSQL", 8),
        ConteudoEducacional("Ganhando Produtividade com Spring Framework", 18)
    )

    val formacao1 = Formacao("Bootcamp TQI Kotlin - Backend Developer", 70, conteudosKotlin, Nivel.AVANCADO)
    val formacao2 = Formacao("HTML Web Developer", 27, conteudosHTML, Nivel.BASICO)
    val formacao3 = Formacao("Cloud Fullstack Bootcamp - Warburg Pincus", 106, conteudosCloudFullstack, Nivel.INTERMEDIARIO)
    val formacao4 = Formacao("Banco PAN Java Developer", 65, conteudosJava, Nivel.INTERMEDIARIO)

    formacao1.matricular(user1)
    formacao2.matricular(user2)
    formacao3.matricular(user3)
    formacao4.matricular(user4)

    println("O Usuário(a) ${user1.nome} está inscrito(a) no curso ${formacao1.nome} com duração de ${formacao1.duracaoTotal} horas.")
    println("O Usuário(a) ${user2.nome} está inscrito(a) no curso ${formacao2.nome} com duração de ${formacao2.duracaoTotal} horas.")
    println("O Usuário(a) ${user3.nome} está inscrito(a) no curso ${formacao3.nome} com duração de ${formacao3.duracaoTotal} horas.")
    println("O Usuário(a) ${user4.nome} está inscrito(a) no curso ${formacao4.nome} com duração de ${formacao4.duracaoTotal} horas.")

}