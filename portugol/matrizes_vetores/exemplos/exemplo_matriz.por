programa
{
	
	funcao inicio()
	{
		inteiro numeros[3] [2], somaNumeros=0,linha,coluna,somaColuna = 0

		para(linha=0;linha<3;linha++) {


			para(coluna=0;coluna<2;coluna++) {
				escreva("\nEntre com um número: ")
				leia(numeros[linha][coluna])
				somaNumeros += numeros [linha][coluna]
				se(coluna == 1) {
					somaColuna += numeros [linha][coluna]
				}
			}
		}
		escreva("\nSomatorio dos numeros foi:",somaNumeros)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 106; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */