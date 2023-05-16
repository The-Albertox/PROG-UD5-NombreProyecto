package net.salesianos.utiles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ClasificadorDePalabras {

    private Map<Character, List<String>> wordsByInitial;

    public ClasificadorDePalabras() {
        wordsByInitial = new HashMap<>();
    }

    public Map<Character, List<String>> getWordsByInitial() {
        return wordsByInitial;
    }

    public void setWordsByInitial(Map<Character, List<String>> wordsByInitial) {
        this.wordsByInitial = wordsByInitial;
    }
    public void addWord(String word) {
        String sanitizedWord = sanitizeWord(word);
        char initial = sanitizedWord.charAt(0);
        if (!wordsByInitial.containsKey(initial)) {
            wordsByInitial.put(initial, new ArrayList<String>());
        }
        wordsByInitial.get(initial).add(sanitizedWord);
    }



    public List<String> getWordsByInitial(char initial) {
        return wordsByInitial.getOrDefault(initial, new ArrayList<String>());
    }
    
    public Set<Character> getInitials() {
        return wordsByInitial.keySet();
    }
    private String sanitizeWord(String word) {
        return word.toLowerCase().trim();
    }
}
