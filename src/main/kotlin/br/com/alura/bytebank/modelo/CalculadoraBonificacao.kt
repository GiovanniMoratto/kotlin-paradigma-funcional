package br.com.alura.bytebank.modelo

/**
 *@Author giovanni.moratto
 */

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao
    }

}