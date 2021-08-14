package br.com.alura.bytebank.exception

/**
 *@Author giovanni.moratto
 */

class FalhaAutenticacaoException(
    mensagem: String = "Falha na autenticação"
) : Exception(mensagem)