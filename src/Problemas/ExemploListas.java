package Problemas;

import java.util.ArrayList;
import java.util.List;

public class ExemploListas {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("William"); // Inserir elemento na lista: add(obj), Exemplo Almir add(int, obj)
		list.add("Leandro");
		list.add("Tormes");
		list.add("Flavio");
		list.add("Depiro");
		list.add(2, "Almir"); // adcionando uma pessoa na posição 2

		// Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)

		list.remove("Tormes"); // Remover elementos da lista: remove(obj),
		list.remove(4); // removendo por possição na lista no caso o Depiro remove(int)
		list.removeIf(x -> x.charAt(0) == 'w'); // remover pessoa que começa com a letra W no caso William
												// removeIf(Predicate)

		System.out.println(list.size()); // Tamanho da lista: size() no caso temos 5 pessoas na lista
		for (String x : list) {
			System.out.println(x);

			// Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)
			System.out.println("------------------------");
			System.out.println("Index of Tormes " + list.indexOf("tomrmes")); // encontrar pessoa que existe
			System.out.println("Index of Jose " + list.indexOf("José")); // encontrar pessoa que Não existe

			// Encontrar primeira ocorrência com base em predicado: Integer result =
			// list.stream().filter(x -> x > 4).findFirst().orElse(null);

//			System.out.println("---------------------");
//			String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
//			System.out.println(name);

		}

	}

}
