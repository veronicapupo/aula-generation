programa
{
	
	funcao inicio()
	{
	   inteiro numero, somaPar=0, quantImpar=0

	   escreva("\nEntre com um numero: ")
	   leia(numero)
	   enquanto(numero!=0){
	   	se(numero % 2 ==0){
	   		somaPar += numero
	   	}
	   	senao{
	   		quantImpar++
	   	}
	   	escreva("\nEntre com um numero: ")
	   	leia(numero)
	   }
	   escreva("\nSoma dos numeros pares: ",somaPar)
        escreva("\nQuantidade de  numeros impares: ",quantImpar)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 435; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */