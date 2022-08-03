programa
{
	inclua biblioteca Util --> util
	
	
	funcao inicio()
	{

	 inteiro valorDado [10], media = 0, soma = 0, numeroLancado = 0, maiorNumero =0, ocorrenciaMaiorNumero = 0

       para(inteiro i=0; i <10; i ++) {
	 	numeroLancado = util.sorteia(1,6)
	 	escreva("\nNúmero Lançado: ", numeroLancado) 	
	 	valorDado[i]= numeroLancado
	 	se (maiorNumero < numeroLancado){
	 		maiorNumero = numeroLancado
	 	}
       }

 	  para(inteiro i=0; i <10; i ++) {
	 	soma += valorDado[i]	
	 	se (valorDado[i] == maiorNumero){
	 	 ocorrenciaMaiorNumero++
	 	}
       }
      media = soma / 10
	 escreva("\nMedia da soma de todos os valores do vetor ", media) 
	 escreva("\nMaior numero do vetor " , maiorNumero)
	 escreva("\nMaior numero teve ",ocorrenciaMaiorNumero," ocorrencias")

	 

 
	 
	} 
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 795; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */