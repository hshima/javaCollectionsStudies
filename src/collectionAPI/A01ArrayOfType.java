package collectionAPI;

import java.util.ArrayList;
import java.util.List;

public class A01ArrayOfType {

	public static void main(String[] args) {
		String head1 = "O que é Lorem Ipsum?";
		String p1 = "Lorem Ipsum é simplesmente uma simulação de texto da indústria tipográfica e de impressos, e vem sendo utilizado desde o século XVI, quando um impressor desconhecido pegou uma bandeja de tipos e os embaralhou para fazer um livro de modelos de tipos. Lorem Ipsum sobreviveu não só a cinco séculos, como também ao salto para a editoração eletrônica, permanecendo essencialmente inalterado. Se popularizou na década de 60, quando a Letraset lançou decalques contendo passagens de Lorem Ipsum, e mais recentemente quando passou a ser integrado a softwares de editoração eletrônica como Aldus PageMaker.";
		String head2 = "De onde ele vem?";
		String p2_1 = "Ao contrário do que se acredita, Lorem Ipsum não é simplesmente um texto randômico. Com mais de 2000 anos, suas raízes podem ser encontradas em uma obra de literatura latina clássica datada de 45 AC. Richard McClintock, um professor de latim do Hampden-Sydney College na Virginia, pesquisou uma das mais obscuras palavras em latim, consectetur, oriunda de uma passagem de Lorem Ipsum, e, procurando por entre citações da palavra na literatura clássica, descobriu a sua indubitável origem. Lorem Ipsum vem das seções 1.10.32 e 1.10.33 do \"de Finibus Bonorum et Malorum\" (Os Extremos do Bem e do Mal), de Cícero, escrito em 45 AC. Este livro é um tratado de teoria da ética muito popular na época da Renascença. A primeira linha de Lorem Ipsum, \"Lorem Ipsum dolor sit amet...\" vem de uma linha na seção 1.10.32.";
		
		List<String> text = new ArrayList<>();
		text.add(head1);
		text.add(p1);
		text.add(head2);
		text.add(p2_1);
		
//		Impressão serializada
//		System.out.println(text);
		
//		Impressão linha a linha
//		text.forEach(t -> System.out.println(t));
		
		
//		Impressão de uma posição específica. Nesse caso, zero
//		System.out.println(text.get(0));
		
//		Impressão de exceção: Acesso à posição 4
//		System.out.println(text.get(4)); //java.lang.IndexOutOfBoundsException
		
//		Ordenação usando Collections
//		text.forEach(t -> System.out.println(t));
//		Collections.sort(text);
//		System.out.println("------------------------------------------------");
//		text.forEach(t -> System.out.println(t));
		
		
//		Ordenação usando .sort()
		List<String> t2 = text;
//		t2.forEach(t -> System.out.println(t));
//		System.out.println("------------------------------------------------");
//		System.out.println("Usando Streams (imutável) ");
//		t2.stream().sorted().forEach(t -> System.out.println(t));
//		
//		System.out.println("------------------------------------------------");
//		System.out.println("Comprova imutável:");
//		t2.forEach(t -> System.out.println(t));
//		
//		System.out.println("------------------------------------------------");
//		System.out.println("Usa .sort(null) em ordem natural (modifica o Array original):");
//		t2.sort(null);
//		t2.forEach(t -> System.out.println(t));
//
//		System.out.println("------------------------------------------------");
		
//		Removendo item
//		t2.remove(0);
		
//		Remoção condicional
//		t2.removeIf(t -> t.contains("acredita"));
//		t2.forEach(t -> System.out.println(t));
		
		
		
	}

}
