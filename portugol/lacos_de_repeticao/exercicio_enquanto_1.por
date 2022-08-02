programa
{
	
	funcao inicio()
	{

	     inteiro numero = 1, soma = 0, contador = 0, media
	     
		

		enquanto(numero>0){
			
			escreva("Digite um número: ")
		     leia(numero)
			soma = soma + numero
			contador++			
		}
		media = soma / contador
		
		escreva("\nTotal do somatório: ",soma)
	     escreva("\nA média é: ",media)
          escreva("\nTotal de valores lidos: ",contador)

	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 131; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */