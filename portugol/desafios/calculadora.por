programa
{
	inclua biblioteca Util --> u
	inclua biblioteca Mouse --> m
	inclua biblioteca Teclado --> t
	inclua biblioteca Graficos -->g

	logico continuar = verdadeiro
	
	// cores
	inteiro visor = g.criar_cor(212, 212, 212)
	inteiro fundo = g.criar_cor(143, 143, 143)
	inteiro btn_operacoes = g.criar_cor(236,150,71)

	// posições
	inteiro pos_q_x[4] = {0, 101, 202, 303}
	inteiro pos_q_y[5] = {114, 215, 316, 417, 518}
	inteiro pos_nums_x[4] = {20, 121, 222, 323}
	inteiro pos_nums_y[5] = {140, 240, 340, 441, 542}
	inteiro pos_mouse = 0
	
	// matriz contendo os caracteres da calculadora
	cadeia numeros_calc[5][4] = {
		{"AC", "  ", " %", " +"},
		{" 7", " 8", " 9", " -"},
		{" 4", " 5", " 6", " X"},
		{" 1", " 2", " 3", " /"},
		{"00", " 0", " .", " ="}
	}
	
	cadeia resposta = ""

	funcao desenhar(){
		g.definir_cor(fundo)
		g.limpar()

		g.definir_cor(visor)
		g.desenhar_retangulo(0, 0, 400, 110, falso, verdadeiro)

		para(inteiro c = 0; c < 4; c++){
			para(inteiro l = 0; l < 5; l++){
				se(c == 3){
					g.definir_cor(btn_operacoes)
				}
				senao{
					g.definir_cor(g.COR_BRANCO)
				}
				
				g.desenhar_retangulo(pos_q_x[c], pos_q_y[l], 97, 97, falso, verdadeiro)
				g.definir_cor(g.COR_PRETO)
				g.definir_fonte_texto("Arial")
				g.definir_tamanho_texto(40.0)
				g.desenhar_texto(pos_nums_x[c], pos_nums_y[l], numeros_calc[l][c])
			}
		}

		g.definir_cor(fundo)
		g.definir_fonte_texto("Arial")
		g.definir_tamanho_texto(50.0)
		g.desenhar_texto(37, 60, resposta)
		
		g.renderizar()
	}

	funcao tecla_pressionada(inteiro v1){
		escolha(v1){
			caso t.TECLA_0_NUM:
				resposta += "0"
	
			caso t.TECLA_1_NUM:
				resposta += "1"
			
			caso t.TECLA_2_NUM:
				resposta += "2"
			
			caso t.TECLA_3_NUM:
				resposta += "3"
			
			caso t.TECLA_4_NUM:
				resposta += "4"
			
			caso t.TECLA_5_NUM:
				resposta += "5"
			
			caso t.TECLA_6_NUM:
				resposta += "6"
			
			caso t.TECLA_7_NUM:
				resposta += "7"
			
			caso t.TECLA_8_NUM:
				resposta += "8"
			
			caso t.TECLA_9_NUM:
				resposta += "9"

			caso t.TECLA_ADICAO:
				resposta += "+"
				
			caso t.TECLA_SUBTRACAO:
				resposta += "-"

			caso t.TECLA_MULTIPLICACAO:
				resposta += "*"

			caso t.TECLA_DIVISAO:
				resposta += "/"

			caso t.TECLA_DECIMAL:
				resposta += "."

			caso t.TECLA_ESC:
				continuar = falso
		}
	}

	funcao calcular(){
		
	}
	
	funcao inicio()
	{
		inteiro tecla
		g.iniciar_modo_grafico(verdadeiro)
		g.definir_dimensoes_janela(400, 614)
		enquanto(continuar == verdadeiro){
			desenhar()
			calcular()
			tecla = t.ler_tecla()
			tecla_pressionada(tecla)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2350; 
 * @DOBRAMENTO-CODIGO = [22];
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {pos_mouse, 20, 9, 9}-{resposta, 31, 8, 8};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */