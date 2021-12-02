package br.senai.sp.jandira.arquivo;

import br.senai.sp.jandira.ui.Frame;

public class Main {

	public static void main(String[] args) {
		
		Arquivo objArquivo = new Arquivo();
		
		/*String caminho = "C:\\Users\\21276093\\Desktop\\Teste\\aula.txt";
		String texto1 = "SENAI Jandira - Programação Orientada a Objetos - Java";
		String texto2 = objArquivo.ler(caminho) + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam tincidunt sollicitudin quam ac rhoncus. Fusce arcu velit, faucibus mollis nisl eget, tincidunt rutrum ex. Aliquam erat volutpat. Nam elementum neque non porta pulvinar. Vivamus eu pellentesque diam, ut rhoncus nisi. Aenean commodo dui nec nisl rutrum, sit amet vulputate ipsum convallis. Vivamus quis mauris ac elit fringilla dignissim.";
		
		//desse jeito texto2 sobrescreverá o arquivo anterior
		objArquivo.gravar(caminho, texto1);
		objArquivo.gravar(caminho, texto2);
		
		//antes gravamos o texto 1 e depois acrescentamos o texto dois, dessa maneira o arquivo foi alterado, somando os dois dados
		System.out.println(texto2);
		
		objArquivo.gravar(caminho, texto2);*/
		
		Frame tela = new Frame();
		tela.setVisible(true);

	}

}
