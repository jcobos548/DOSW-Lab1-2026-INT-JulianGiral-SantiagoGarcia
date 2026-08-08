package Laboratorio1.reto5;

import java.util.*;

public class BatallaConjuntos {

    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>(
                List.of(4, 9, 15, 7, 18, 21, 10, 5));

        TreeSet<Integer> treeSet = new TreeSet<>(
                List.of(12, 3, 25, 10, 7, 30, 18, 4));

        Set<Integer> hashFiltrado = hashSet.stream()
                .filter(n -> n % 3 != 0)
                .collect(TreeSet::new, TreeSet::add, TreeSet::addAll);

        Set<Integer> treeFiltrado = treeSet.stream()
                .filter(n -> n % 5 != 0)
                .collect(TreeSet::new, TreeSet::add, TreeSet::addAll);

        TreeSet<Integer> arena = new TreeSet<>();
        arena.addAll(hashFiltrado);
        arena.addAll(treeFiltrado);

        arena.forEach(n ->
                System.out.println("Número en arena: " + n));
    }
}
