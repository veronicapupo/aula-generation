programa
{
	
	funcao inicio()
	{
		real media [3], n1,n2,n3,somaMedia=0.0,mediaGeral
		inteiro x

		para (x = 0; x <3;x++)
		{
			escreva("\nEntre com a primeira nota: ")
			leia(n1) 
			
			escreva("\nEntre com a segunda nota: ")
			leia(n2) 
			
			escreva("\nEntre com a terceira nota: ")
			leia(n3) 
			media[x] = (n1+n2+n3) / 3
			escreva("\nMedia aritmetica: ",media[x])
			somaMedia += media[x]
			
		}
		mediaGeral = somaMedia / 3
		escreva("\nMedia geral: ",mediaGeral)
		para(x=0;x<3;x++)
		{
			escreva("\nMedia alune ", x+1, " foi de: ",media[x])
		}
		
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 493; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */