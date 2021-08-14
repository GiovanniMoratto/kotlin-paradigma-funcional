package br.com.alura.bytebank.exception

/**
 *@Author giovanni.moratto
 */

class SaldoInsuficienteException(
    mensagem: String = "O saldo é insuficiente"
) : Exception(mensagem)