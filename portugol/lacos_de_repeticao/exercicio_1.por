programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real 
		salario,
		mediaSalario=0.0,
		mediaNumeroFilhos=0.0,
		maiorSalario=0.0,
		percentualPessoasSalario=0.0,
		valorTotalSalarios=0.0
		
		inteiro 
		numerofilhos=0,
		numeroHabitantes =20,
          valorTotalFilhos =0
          
		para(inteiro habitante=0; habitante < numeroHabitantes; habitante++) { 
				
			escreva("\nDigite o valor do seu salario: ")
			leia(salario)
			escreva("\nQuantidade de filhos: ")
			leia(numerofilhos)
		
			valorTotalSalarios +=  salario
               valorTotalFilhos += numerofilhos
			
			se(maiorSalario < salario) {
				maiorSalario = salario
			}
               se(salario<=100) {
               	percentualPessoasSalario += 1 
               }
			
		}
		mediaSalario = valorTotalSalarios / numeroHabitantes
		mediaNumeroFilhos = valorTotalFilhos / numeroHabitantes
		
		escreva("\nA média de salario é: ",mat.arredondar(mediaSalario,2))
		
		escreva("\nA média de filhos é: ", mediaNumeroFilhos)
		
		escreva("\nO maior salario é : ", maiorSalario)
		
		escreva("\nPercentual de pessoas com salário até R$100,00 : ", percentualPessoasSalario)	
			
		}

		
	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 336; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */