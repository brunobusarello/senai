programa
{
	
	funcao inicio()
	{
		inteiro cont_10 = 10
		para(inteiro cont = 2; cont <= 50; cont+=2){
			se(cont == cont_10){
				cont_10 += 10
				escreva(cont, "\n")
			}
			senao{
				se(cont < 10){
					escreva(" 0", cont, " ")
				}
				senao{
					escreva(" ", cont, " ")
				}
				
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 278; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */