import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class JogoDaForca {
	private ArrayList<String> palavras = new ArrayList<>();   // lista de palavras lidas do arquivo
	private ArrayList<String> dicas = new ArrayList<>();     // lista de dicas lidas do arquivo
	private String dica = "";                               // dica da palavra sorteada
	private String[] letras = palavras.split("");            // letras da palavra sorteada
	private int acertos = 0;                              // contador de acertos
	private int penalidade = 0 + 1;                      // penalidade atual


	public JogoDaForca(String nomearquivo) throws Exception{
		try {     
			FileWriter leitor = new FileWriter(new File ("palavras.csv"));
			OutputStreamWriter saida;
			saida.write("palavras");
			saida.close();




		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	//lê as palavras + dicas o arquivo e as coloca nas respectivas listas. Lança (throw) a exceção “arquivo inexistente”,
	//caso o arquivo não exista.
	public void iniciar() {        //realiza o sorteio de uma das palavras existentes na lista de palavras.
		
	}
	
	public String getDica(acertos , palavras) {               //retorna a dica associada à palavra sorteada no momento.

		String dica="";
		if(acertos == 0 || terminou())
			return "não ha dica";

		if(acertos < palavras)
			dica+="tente um numero MAIOR";
		else
			dica+="tente um numero MENOR";   // essa parte nao esta terminada provavelmente ta errado
		return dica;
	}

	public int getTamanho(palavras) {            //retorna o tamanho da palavra sorteada no momento
		int  palavras = palavras.size();
		/retorna o tamanho da palavra sorteada no momento

	}

	public ArrayList<Integer> getPosicoes(String letra) throws Exception{    //
		try {

		}catch(Exception e) {}
	}
	//retorna uma lista com as posições encontradas da letra na palavra sorteada ou retorna uma lista vazia. Substitui as
	//letras encontradas na palavra por “*”. Contabiliza um acerto, para cada ocorrência encontrada, ou incrementa a
	//penalidade, no caso da inexistência da letra. O parâmetro letra é válido se tem apenas 1 caractere alfabético sem
	//acento – pode ser maiúscula ou minúscula.
	public boolean terminou() {     //retorna true, se o total de acertos é igual ao tamanho da palavra sorteada ou se a penalidade é 6.
		if(penalidade == 6);{
			return true;
		}return false;
	}

	public int getAcertos() {     //retorna o total de acertos
		return acertos;
	}

	public int getPenalidade() {      //retorna a penalidade atual (0, 1, 2, ... 6)
		return penalidade;
	}

	public String getResultado() {     //retorna “jogo em andamento”, “você venceu” ou “você foi enforcado”.
		if(getPenalidade() == 6);
		return "Voce foi Enforcado";
		if(getPenalidade() < 6 ) 
			return "Jogo em Andamento";

		else 
			return "Voce Venceu";
	}





}
