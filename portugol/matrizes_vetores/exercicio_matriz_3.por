programa
{
	
	funcao inicio()
	{
		inteiro N1[4][6], N2 [4][6], soma = 0, M1[i], M2[i], i = 0,

            escreva("\nDigite os valores da matrizN1: ")
            para( inteiro l = 0; l <4; l++) {

            	  para(inteiro c = 0; c <6; c++) {
            	  	leia(N1[l][c])
            	  	somaN1 += N1[l][c]
                 	  }
            }
               escreva("\nDigite os valores da matriz N2: ")
            para( inteiro l = 0; l <=4; l++) {

            	  para(inteiro c = 0; c <=6; c++) {
            	  	leia(N1[l][c])
            	  	somaN1 += N2[l][c]
            	  }

            	  para(inteiro l = 0; l <= 4; l++) {
            	  	para(inteiro c = 0; c <= 6; c++) {
            	  		M1 [l][c] = N1 [l][c] + N2 [l][c]
            	  		M2 [l][c] = N1 [l][c] + N2[l][c]
            	  	}
            	  }

            	  escreva("\nResultado da M1: ")

            	  para(inteiro l =0; l <=4; l++){
            	  	para(inteiro c = 0; c <= 6; c++){
            	  		escreva([l][c])
            	  	}

            	  }

            	  escreva("\nResultado da M2: ")

            	  para(inteiro l = 0; l <= 4; l++){
            	  	para(inteiro c = 0; c <=6; c++) {
            	  		escreva(M2[l][c],)
            	  	}
            	  }
            	  	
            	  	
/*
 * 
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.
 */
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 329; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */