programa
{
	
	funcao inicio()
	{ 
	   inteiro tabuada,x=1,resultado
	   escreva("\nQual tabuada que voce deseja visualizar: ")
	   leia(tabuada)
		faca{

			resultado = tabuada * x
			escreva("\n",tabuada," X ", x, " = ",resultado)
			x++
		}
		enquanto(x<=10)
	}
}

/*
 * inteiro x, acm=0
 * faca {
 * escreva("Entre com um valor: ")
 * leia(x)
 * acm = acm + x
 * 
 * }
 * enquanto(x!=0)
 * escreva("Eu acumulei: ",acm)}
 */
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 429; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */