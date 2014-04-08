/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package textadventure;

import java.util.ArrayList;

public class CharacterInfo {
    String name,weapon,profession;
    int STRENGTH,DEXTERITY,MAGIC,STEALTH,INFLUENCE,FOOD,HEALTH,spells;
    ArrayList<String> Equiptment;
public void create(){
spells = 0;
STRENGTH = (int)(Math.random() * 8) + 9; //gives random stat between 7 and 16
DEXTERITY = (int)(Math.random() * 8) + 9; //gives random stat between 7 and 16
MAGIC = (int)(Math.random() * 8) + 9; //gives random stat between 7 and 16
STEALTH = (int)(Math.random() * 8) + 9; //gives random stat between 7 and 16
INFLUENCE = (int)(Math.random() * 8) + 9; //gives random stat between 7 and 16
FOOD = 4;
HEALTH = (int)(Math.random()* 11) + 20; //gives random Health between 20-30

    switch(profession) { //Check Profession and apply Specialisations
        case "Sorceror" : 
                          MAGIC = MAGIC + 4;
                          spells = spells + 2;
                          STRENGTH = STRENGTH - 2;
                          DEXTERITY = DEXTERITY - 2;
                          HEALTH = HEALTH - 8;              
            break;
        case "Rogue"    : 
                          STEALTH = STEALTH + 3;
                          DEXTERITY = DEXTERITY + 3;
                          MAGIC = MAGIC - 2;
                          INFLUENCE = INFLUENCE - 2;                           
            break;
        case "Bard"     : 
                          INFLUENCE = INFLUENCE + 4;
                          STRENGTH = STRENGTH - 1;
                          STEALTH = STEALTH - 2;
                          Equiptment.add("Instrument");
                          HEALTH = HEALTH + 2;   
            break;
        case "Warrior"  : 
                          STRENGTH = STRENGTH + 4;
                          DEXTERITY = DEXTERITY + 1;
                          MAGIC = MAGIC - 2;
                          STEALTH = STEALTH - 2;
                          HEALTH = HEALTH + 8;   
            break;
        case "Chef"     : 
                          FOOD = FOOD + 4;
                          INFLUENCE = INFLUENCE + 1;
                          STEALTH = STEALTH - 2;
                          MAGIC = MAGIC - 2;
                          HEALTH = HEALTH + 4;   
            break;
        }

}
}