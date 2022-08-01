programa
{
	
	funcao inicio(){
	
		real P, E=0.0, M=0.0
		 
	     leia(P)
	       
	     se (P > 50) {
	     	E = (P-50)
	       	M = (E * 4)
	          escreva("Valor do excesso: ", E, " Valor da multa: ", M)
	     }
	     senao {
	        	escreva("Valor do excesso: ", E, " Valor da multa: ", M)
	     }
	}
}


/*

deve pagar um multa de R$ 4,00 por quilo excedente.

leia a variável P (peso de tomates) e verifique se há excesso.
Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que deverá pagar.
Caso contrário mostrar tais variáveis com o conteúdo ZERO.

 */
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 61; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */