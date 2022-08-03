programa
{
	
	funcao inicio()
	{

		inteiro matriz[3][3]
		inteiro somaDaMatriz = 0
		inteiro somaDaPrimeiraDiagonal =0
		
		para(inteiro linha=0; linha < 3; linha++){
			para(inteiro coluna=0; coluna<3; coluna++){
				leia(matriz[linha][coluna])
				somaDaMatriz += matriz[linha][coluna]
			}
		}
		para(inteiro indice=0; indice < 3; indice++){
			somaDaPrimeiraDiagonal += matriz[indice][indice]
		}
		
		escreva("somaDaMatriz : ",somaDaMatriz)
		escreva("\n1somaDaPrimeiraDiagonal : ",somaDaPrimeiraDiagonal)
		
		
	}
}

/*
 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.
 */
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 397; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */