programa
{
	inclua biblioteca Matematica --> mat 
	funcao inicio()
	{
	
	     inteiro A,B,C
	     real D
	     
          escreva("Entre com A:")
          leia(A)
          escreva("Entre com B:")
          leia(B)
          escreva("Entre com C:")
          leia(C)

          D = (mat.potencia((A+B),2.0) + mat.potencia((B+C),2.0)) / 2 
          escreva("\n o valor de D é: ",D)
          
         /* R = mat.potencia((A + B),2) 
          S = mat.potencia((B + C),2)
	     D = (R + S) / 2
	     escreva ("resultado = " , D)*/
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 334; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */