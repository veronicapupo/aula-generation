programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio(){
	
		real n1, n2, n3, n4
		leia(n1, n2, n3, n4)
	
	se ((mat.potencia(n3, 2.0)) >= 1000) {
		escreva(n3)
	} senao { 
		escreva("\nn1 = ", n1 , ", n1 ao ² = ",mat.potencia(n1, 2.0))
		escreva("\nn2 = ", n2 , ", n2 ao ² = ",mat.potencia(n2, 2.0))
		escreva("\nn3 = ", n3 , ", n3 ao ² = ",mat.potencia(n3, 2.0))
		escreva("\nn4 = ", n4 , ", n4 ao ² = ",mat.potencia(n4, 2.0))	
	}
	   
}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 458; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */