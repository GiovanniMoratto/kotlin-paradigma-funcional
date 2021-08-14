package br.com.alura.bytebank.modelo

/**
 *@Author giovanni.moratto
 */

interface Autenticavel {
    fun autentica(senha: Int): Boolean
}