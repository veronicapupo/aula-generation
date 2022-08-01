programa
{
	
	funcao inicio()
	{    escreva("Digite o indice de poluicao medido: ")
		real indicePoluicao
		leia(indicePoluicao)

	se(indicePoluicao >= 0.5) {
      	escreva(" Grupo1, Grupo2, Grupo3 intimados a paralisarem suas atividades")
      }	

     se(indicePoluicao >=0.4 e indicePoluicao <0.5) {
      	escreva("\nGrupo1, Grupo2 intimados a suspenderem as atividades")
      }
      
     se(indicePoluicao >0.3 e indicePoluicao <0.4) {
      	escreva("\nGrupo1 intimado a suspender suas atividades")
      }
      
      		
	}
}

/*
 * Se o índice sobe para 0,3 
 * as indústrias do 1º grupo são intimadas a suspenderem suas atividades, 
 * 
 * se o índice crescer para 0,4 as industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades, 
 * 
 * 
 * se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. 
 * 
 * Faça um sistema que leia o índice de poluição medido e emita a notificação adequada aos diferentes grupos de empresas.

 */

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 545; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */