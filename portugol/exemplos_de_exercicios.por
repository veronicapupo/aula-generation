programa
{
	
	funcao inicio()
	{
          real num1,num2,res
          escreva("Entre com o num1:")
          leia(num1)
          escreva("Entre com o num2:")
          leia(num2)
          res= num1+num2
          escreva("Soma: ",res)
          res= num1-num2
          escreva("\nDiferença: ",res)

          inteiro a,b
          a=5
          b=10
          escreva("\nO valor de A: ", a," é maior que valor de B: ",b)
          escreva("\nA é maior que B?", a>b)

          inteiro idade
          escreva("\nEntre com a sua idade:")
          leia(idade)

          se (idade>=18) {
          	escreva("\nVoce é maior de idade")
          	
          }
          senao {
          	escreva("Você é menor de idade")
          }

          inteiro mes
          escreva("\nDigite um numero de 1 ate 12 para saber o mes: ")
          leia(mes)
          escolha (mes) {
          	caso 1:
          	escreva("Janeiro")
          	pare
          	caso 2:
          	escreva("Fevereiro")
          	pare
          	caso 3:
          	escreva("março")
          	pare
          	caso 4:
          	escreva("abril")
          	pare
          	caso 5:
          	escreva("maio")
          	pare
          	caso 6:
          	escreva("junho")
          	pare
          	caso 7:
          	escreva("julho")
          	pare
          	caso 8:
          	escreva("agosto")
          	pare
          	caso 9:
          	escreva("setembro")
          	pare
          	caso 10:
          	escreva("outubro")
          	pare
          	caso 11:
          	escreva("novembro")
          	pare
          	caso 12:
          	escreva("dezembr")
          	pare
          	caso contrario:
          	escreva("opcao invalida")
          	pare
          }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1736; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */