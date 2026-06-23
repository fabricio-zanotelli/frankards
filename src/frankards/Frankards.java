/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frankards;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Data model for the FranKards application.
 * Stores flashcard term-definition pairs using a HashMap for fast lookup
 * and parallel ArrayLists to preserve insertion order for sequential review.
 *
 * @author ZanFa595
 */
public class Frankards {
    private ArrayList<String> terms = new ArrayList<>();
    private ArrayList<String> definitions = new ArrayList<>();
    
    public void enterList(String pTerm, String pDefinition){
        terms.add(pTerm);
        definitions.add(pDefinition);
    }
    
    public ArrayList<String> getTerms(){
        return terms;
    }
    
    
    public ArrayList<String> getDefinitions(){
        return definitions;
    }
    
    /*
    comme la valeur size est dynamique dans le programme, 
    on ne peut pas creer d'attribut, qui etait mon premier reflexe, on doit l'acceder par une methode
    */
    public int getTermsCount() {
        return this.terms.size();
    }
}
