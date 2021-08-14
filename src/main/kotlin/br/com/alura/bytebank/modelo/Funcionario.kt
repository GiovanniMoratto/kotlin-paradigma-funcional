package br.com.alura.bytebank.modelo

/**
 *@Author giovanni.moratto
 */

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    abstract val bonificacao: Double
}