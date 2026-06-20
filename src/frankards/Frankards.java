/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frankards;
import java.util.ArrayList;
import java.util.HashMap;

public class Frankards {
    HashMap<String, String> flashcards = new HashMap();
    private int listSize = flashcards.size();
    ArrayList<String> terms = new ArrayList<>();
    ArrayList<String> definitions = new ArrayList<>();
    
    public void enterList(String pTerm, String pDefinition){
        flashcards.put(pTerm, pDefinition);
        terms.add(pTerm);
        definitions.add(pDefinition);
    }
    
    public ArrayList<String> getTerms(){
        return terms;
    }
    public ArrayList<String> getDefinitions(){
        return definitions;
    }
}
