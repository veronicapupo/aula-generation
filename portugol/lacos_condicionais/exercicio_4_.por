programa
{
	
	funcao inicio()
	{
		inteiro numero
		escreva("\nEntre com um numero inteiro: ")
	     leia(numero)

          logico par = (numero % 2 == 0)
          logico positivo = (numero >= 0)
          
	     se(par) {
			se(positivo){
	     		escreva("\nEste numero é par e positivo!")
			} senao {
				escreva("\nEste numero é par e negativo!")
			}
	     } senao {
			se(positivo){
	     		escreva("\nEste numero é impar e positivo!")
			} senao {
				escreva("\nEste numero é impar e negativo!")
			}
     	
	     }
	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 190; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */