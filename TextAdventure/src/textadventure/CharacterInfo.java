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
    ArrayList<Integer> EquiptmentQty;
        String[] WeaponType = new String[5];{
            WeaponType[0] = "Frying Pan";
            WeaponType[1] = "Flail";
            WeaponType[2] = "Cutlass";
            WeaponType[3] = "Dagger";
            WeaponType[4] = "Shotgun";
        }
        int[] WeaponStrength = new int[5];{
            WeaponStrength[0] = 2;//frying pan
            WeaponStrength[1] = 3;//flail
            WeaponStrength[2] = 4;//cutlass
            WeaponStrength[3] = 1;//Dagger
            WeaponStrength[4] = 5;//shotgun
        }
        boolean[] Reload = new boolean[5];{
        Reload[0] = false;//frying pan
        Reload[1] = false;//flail
        Reload[2] = false;//cutlass  
        Reload[3] = false;//Dagger
        Reload[4] = true;//shotgun
        }
        String[] WeaponAttribute = new String[5];{
        WeaponAttribute[0] = "STRENGTH";
        WeaponAttribute[1] = "STRENGTH";
        WeaponAttribute[2] = "STRENGTH";
        WeaponAttribute[3] = "DEXTERITY";
        WeaponAttribute[4] = "MAGIC";        
        }
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
                          weapon = WeaponType[4]; //shotgun
            break;
        case "Rogue"    : 
                          STEALTH = STEALTH + 3;
                          DEXTERITY = DEXTERITY + 3;
                          MAGIC = MAGIC - 2;
                          INFLUENCE = INFLUENCE - 2;   
                          weapon = WeaponType[3]; //fists
            break;
        case "Bard"     : 
                          INFLUENCE = INFLUENCE + 4;
                          STRENGTH = STRENGTH - 1;
                          STEALTH = STEALTH - 2;
                          Equiptment.add("Instrument");
                          EquiptmentQty.add(1)
                          HEALTH = HEALTH + 2;   
                          weapon = WeaponType[1]; //Flail
            break;
        case "Warrior"  : 
                          STRENGTH = STRENGTH + 4;
                          DEXTERITY = DEXTERITY + 1;
                          MAGIC = MAGIC - 2;
                          STEALTH = STEALTH - 2;
                          HEALTH = HEALTH + 8;  
                          weapon = WeaponType[2]; //cutlass
                        
            break;
        case "Chef"     : 
                          FOOD = FOOD + 4;
                          INFLUENCE = INFLUENCE + 1;
                          STEALTH = STEALTH - 2;
                          MAGIC = MAGIC - 2;
                          HEALTH = HEALTH + 4;
                          weapon = WeaponType[0]; //frying pan
            break;
        }

}
}