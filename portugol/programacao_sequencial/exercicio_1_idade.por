programa
{
	
	funcao inicio()
	{    escreva("Digite a sua idade: ")
		inteiro idade, meses, dias
		leia(idade)
		escreva("Digite os meses: ")
		leia(meses)
		escreva("Digite dias: ")
		leia(dias)

		dias += ((idade * 12) * 30) + (meses * 30) 
		escreva("Idade em dias: ", dias)
	
		}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 242; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */