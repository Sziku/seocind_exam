package org.example;

import java.util.ArrayList;
import java.util.List;

public class Wizard {
    private String name;
    private List<String> spells =new ArrayList<>();
    private String favouriteSpell = null;

    public List<String> getKnownSpells() {
        return spells;
    }

    public Wizard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void learnSpell(String spell){
        spells.add(spell);
    }

    public void chooseFavoriteSpell(String spell){
        for(String knowspell : spells){
            if(knowspell.equals(spell)){
                favouriteSpell=spell;
            }
        }

    }

    public String getFavoriteSpell(){
        return favouriteSpell;
    }
}
