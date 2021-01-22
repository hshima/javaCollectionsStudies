package collectionAPI;

import java.util.ArrayList;
import java.util.List;

public class A01ArrayOfType {

	public static void main(String[] args) {
		String head1 = "O que � Lorem Ipsum?";
		String p1 = "Lorem Ipsum � simplesmente uma simula��o de texto da ind�stria tipogr�fica e de impressos, e vem sendo utilizado desde o s�culo XVI, quando um impressor desconhecido pegou uma bandeja de tipos e os embaralhou para fazer um livro de modelos de tipos. Lorem Ipsum sobreviveu n�o s� a cinco s�culos, como tamb�m ao salto para a editora��o eletr�nica, permanecendo essencialmente inalterado. Se popularizou na d�cada de 60, quando a Letraset lan�ou decalques contendo passagens de Lorem Ipsum, e mais recentemente quando passou a ser integrado a softwares de editora��o eletr�nica como Aldus PageMaker.";
		String head2 = "De onde ele vem?";
		String p2_1 = "Ao contr�rio do que se acredita, Lorem Ipsum n�o � simplesmente um texto rand�mico. Com mais de 2000 anos, suas ra�zes podem ser encontradas em uma obra de literatura latina cl�ssica datada de 45 AC. Richard McClintock, um professor de latim do Hampden-Sydney College na Virginia, pesquisou uma das mais obscuras palavras em latim, consectetur, oriunda de uma passagem de Lorem Ipsum, e, procurando por entre cita��es da palavra na literatura cl�ssica, descobriu a sua indubit�vel origem. Lorem Ipsum vem das se��es 1.10.32 e 1.10.33 do \"de Finibus Bonorum et Malorum\" (Os Extremos do Bem e do Mal), de C�cero, escrito em 45 AC. Este livro � um tratado de teoria da �tica muito popular na �poca da Renascen�a. A primeira linha de Lorem Ipsum, \"Lorem Ipsum dolor sit amet...\" vem de uma linha na se��o 1.10.32.";
		
		List<String> text = new ArrayList<>();
		text.add(head1);
		text.add(p1);
		text.add(head2);
		text.add(p2_1);
		
//		Impress�o serializada
//		System.out.println(text);
		
//		Impress�o linha a linha
//		text.forEach(t -> System.out.println(t));
		
		
//		Impress�o de uma posi��o espec�fica. Nesse caso, zero
//		System.out.println(text.get(0));
		
//		Impress�o de exce��o: Acesso � posi��o 4
//		System.out.println(text.get(4)); //java.lang.IndexOutOfBoundsException
		
//		Ordena��o usando Collections
//		text.forEach(t -> System.out.println(t));
//		Collections.sort(text);
//		System.out.println("------------------------------------------------");
//		text.forEach(t -> System.out.println(t));
		
		
//		Ordena��o usando .sort()
		List<String> t2 = text;
//		t2.forEach(t -> System.out.println(t));
//		System.out.println("------------------------------------------------");
//		System.out.println("Usando Streams (imut�vel) ");
//		t2.stream().sorted().forEach(t -> System.out.println(t));
//		
//		System.out.println("------------------------------------------------");
//		System.out.println("Comprova imut�vel:");
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
		
//		Remo��o condicional
//		t2.removeIf(t -> t.contains("acredita"));
//		t2.forEach(t -> System.out.println(t));
		
		
		
	}

}
