package br.com.gilberto;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TesteMap {

	public static void main(String[] args) {
		
		/*
		 * The Map interface provides three collection views, which allow a map's contents to be viewed
		 * as a set of keys, collection of values, or set of key-value mappings.
		 * 
		 */
		Map<String, Integer> nomesParaIdade = new HashMap<>();
		
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);
        
        // Temos uma coleção de chaves
        Set<String> chaves = nomesParaIdade.keySet();    
        for (String nome : chaves) {
            System.out.println(nome);
        }
        
        // Temos uma coleção de valores
        Collection<Integer> valores = nomesParaIdade.values();
        for (Integer idade : valores) {
            System.out.println(idade);
        }
        
        // Temos uma coleção das associações
        Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();    
        for (Entry<String, Integer> associacao : associacoes) {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }
	}
}
