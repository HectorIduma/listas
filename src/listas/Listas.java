package listas;

import java.util.*;

public class Listas {

    public static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        List<Integer> mescla = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                mescla.add(list1.get(i));
                i++;
            } else {
                mescla.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mescla.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mescla.add(list2.get(j));
            j++;
        }

        return mescla;
    }

    public static List<Integer> stringToList(String str) {
        List<Integer> list = new ArrayList<>();
        String[] partes = str.split(",");
        for (String part : partes) {
            list.add(Integer.parseInt(part.trim()));
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Ingrese la primera lista de numeros ordenados separados por comas:");
        String input1 = scn.nextLine();
        System.out.println("Ingrese la segunda lista de numeros ordenados separados por comas:");
        String input2 = scn.nextLine();

        List<Integer> lista1 = stringToList(input1);
        List<Integer> lista2 = stringToList(input2);

        List<Integer> mergedList = merge(lista1, lista2);

        System.out.println("Lista combinada: " + mergedList);
    }
}
