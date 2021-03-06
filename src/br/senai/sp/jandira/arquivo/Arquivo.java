package br.senai.sp.jandira.arquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {
	
	private String texto;
	private String caminho;
	
	//cria??o de um m?todo para cria??o(quando n?o existir o arquivo) e grava??o de dados no mesmo
	
	public boolean gravar(String caminho, String texto) {
		
	//estrutura utilizada para fazer tratamento na ocorr?ncia de erros
		try {
			
	/*precisamos de dois objetos, um para representar o aquivo e outro para
			representar a manipula??o(escrita) dos dados*/
			
			FileWriter arquivo = new FileWriter(caminho);
			
			PrintWriter escreverArq = new PrintWriter(arquivo);
			
			//append permite a escritura no nosso aquivo
			escreverArq.append(texto);
			
			escreverArq.close();
			
			return true;
			
			
		} catch(IOException e) {
			
			System.out.println("ERRO: " + e.getMessage());
			
			return false;
			
		}
		
	} 
	
	public String ler(String caminho) {
		
		//vari?vel acumuladora para o while
		String conteudo = "";
		
		try {
			
			//representa o arquivo em modo de leitura
			FileReader arquivo = new FileReader(caminho);
			
			//representa o dado de leitura na mem?ria principal do programa 
			//o bufferedreader reserva um espa?o de mem?ria para a grava??o/leitura do arquivo
			BufferedReader lerArq = new BufferedReader(arquivo);
			
			String linha = "";
			
			linha = lerArq.readLine();
			
			//com o while o arquivo ser? lido linha por linha at? que n?o hajam mais linhas
			
			while (linha != null) {
				
				conteudo += linha + "\n";
				
				linha = lerArq.readLine();
	
			}
			
			arquivo.close();
			
			//retorna o conte?do carregado com as linhas
			return conteudo;
		
		} catch (IOException e) {
			
			System.out.println("ERRO: " + e.getMessage());
			
			return "";
		}
		
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	

}
