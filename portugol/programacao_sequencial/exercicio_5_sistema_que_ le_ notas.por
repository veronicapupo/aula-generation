programa
{
	
	funcao inicio()
	{
	  cadeia aluno = "Verônica Pupo"
	  real  nota1, nota2, nota3, media
	  real peso1 = 2.0, peso2 = 3.0, peso3 = 5.0
       real pesototal = peso1 + peso2 + peso3
	  escreva("\nEntre com a primeira nota: ")
       leia(nota1)
       escreva("\nEntre com a segunda nota: ")
       leia(nota2)
       escreva("\nEntre com a terceira nota: ")
       leia(nota3)
       media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / pesototal
	  escreva("Média :", media)	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 515; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */