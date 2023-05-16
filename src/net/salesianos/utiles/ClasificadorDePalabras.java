package net.salesianos.utiles;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    
}
