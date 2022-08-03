programa
{
	
	funcao inicio()
	{
		inteiro valores [5], maiorPontuacao =0, i =0

		escreva("\nDigite cinco valores: ")
		
	
		para(i=0;i<5;i++) {
			escreva ("\nValor numero: ")
			leia(valores[i])

		se(maiorPontuacao < valores[i]) {
			maiorPontuacao = valores[i]
		}

		}
		escreva("\nA maior pontuacao é: ",maiorPontuacao)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 342; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */