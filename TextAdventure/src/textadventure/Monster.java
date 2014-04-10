/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package textadventure;
import java.util.ArrayList;
public class Monster {
    ArrayList<String> MobSelection;
       
    String MobName;
    int HEALTH,STRENGTH,MobType;
     public void mobcreate(String Name, String Type, int HP, int STR) {
            MobSelection = new ArrayList<>();
            MobSelection.add(0,"VICIOUS CAMEL");
            MobSelection.add(1,"YOUR MOTHER");
            MobSelection.add(2,"AWKWARD GOBLIN");
            MobSelection.add(3,"COPYRIGHT LAW");
            MobSelection.add(4,"SMALL DRAGON");
            MobSelection.add(5,"POSSESSED SIGNIFICANT OTHER");
            MobSelection.add(6,"GLASS BAGEL FANGIRL");
 
    MobName = Name;
    HEALTH = HP;
    STRENGTH = STR;
    switch(Type){
        //Standard Monster Types and their strength and health
        case "VICIOUS CAMEL": MobType = 0;
            break;
        case "YOUR MOTHER": MobType = 1;
            break;
        case "AWKWARD GOBLIN": MobType = 2;
            break;
        case "COPYRIGHT LAW": MobType = 3;
            break;
        case "SMALL DRAGON": MobType = 4;
            break;
        case "POSSESSED SIGNIFICANT OTHER": MobType = 5;
            break;
        case "GLASS BAGEL FANGIRL": MobType = 6;
            break;
        default:  
            int i = MobSelection.size();
                MobSelection.add(Type);
                MobType = i;
            break;
        }
     }
    public void mobcreate(String Name, String Type, int HP) {
            MobSelection = new ArrayList<>();
            //add in standard monsters
            MobSelection.add(0,"VICIOUS CAMEL");
            MobSelection.add(1,"YOUR MOTHER");
            MobSelection.add(2,"AWKWARD GOBLIN");
            MobSelection.add(3,"COPYRIGHT LAW");
            MobSelection.add(4,"SMALL DRAGON");
            MobSelection.add(5,"POSSESSED SIGNIFICANT OTHER");
            MobSelection.add(6,"GLASS BAGEL FANGIRL");
 
    MobName = Name;
    HEALTH = HP;
    switch(Type){
        //Standard Monster Types and their strength and health
        case "VICIOUS CAMEL": MobType = 0;
                              STRENGTH = 12;
            break;
        case "YOUR MOTHER": MobType = 1;
                            STRENGTH = 12;
            break;
        case "AWKWARD GOBLIN": MobType = 2;
                               STRENGTH = 12;
            break;
        case "COPYRIGHT LAW": MobType = 3;
                              STRENGTH = 12;
            break;
        case "SMALL DRAGON": MobType = 4;
                             STRENGTH = 12;
            break;
        case "POSSESSED SIGNIFICANT OTHER": MobType = 5;
                                            STRENGTH = 12;
            break;
        case "GLASS BAGEL FANGIRL": MobType = 6;
                                    STRENGTH = 12;
            break;
        default: 
            int i = MobSelection.size();
                MobSelection.add(Type);
                MobType = i;
            STRENGTH = 12;      
            break;
    }
    }
    public void mobcreate(String Name, String Type) {
            MobSelection = new ArrayList<>();
            //add in standard Monsters
            MobSelection.add(0,"VICIOUS CAMEL");
            MobSelection.add(1,"YOUR MOTHER");
            MobSelection.add(2,"AWKWARD GOBLIN");
            MobSelection.add(3,"COPYRIGHT LAW");
            MobSelection.add(4,"SMALL DRAGON");
            MobSelection.add(5,"POSSESSED SIGNIFICANT OTHER");
            MobSelection.add(6,"GLASS BAGEL FANGIRL");
    MobName = Name;
    switch(Type){
        //Standard Monster Types and their strength and health
        case "VICIOUS CAMEL": MobType = 0;
                              STRENGTH = 12;
                              HEALTH = 5;
            break;
        case "YOUR MOTHER": MobType = 1;
                            STRENGTH = 12;
                            HEALTH = 5;
            break;
        case "AWKWARD GOBLIN": MobType = 2;
                               STRENGTH = 12;
                               HEALTH = 5;
            break;
        case "COPYRIGHT LAW": MobType = 3;
                              STRENGTH = 12;
                              HEALTH = 5;
            break;
        case "SMALL DRAGON": MobType = 4;
                             STRENGTH = 12;
                             HEALTH = 5;
            break;
        case "POSSESSED SIGNIFICANT OTHER": MobType = 5;
                                            STRENGTH = 12;
                                            HEALTH = 5;
            break;
        case "GLASS BAGEL FANGIRL": MobType = 6;
                                    STRENGTH = 12;
                                    HEALTH = 5;
            break;
        default: 
                int i = MobSelection.size();
                MobSelection.add(Type);
                MobType = i;
                STRENGTH = 12;
                HEALTH = 5;
            break;
    }
    }
}
