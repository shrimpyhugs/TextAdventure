
package textadventure;

/**
 * @author Dylan
 */
import java.util.Scanner;

public class TextAdventure {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //your everyday run of the mill Scanner
        CharacterInfo Character = new CharacterInfo(); //Create Character
        //**************************choices****************************//
        String[] Weapon = new String[5];{
            Weapon[0] = "Frying Pan";
            Weapon[1] = "Flail";
            Weapon[2] = "Cutlass";
            Weapon[3] = "Fists";
            Weapon[4] = "Shotgun";
        }
        
        String[] Profession = new String[5];{
            Profession[0] = "Sorceror";
            Profession[1] = "Rogue";
            Profession[2] = "Bard";
            Profession[3] = "Warrior";
            Profession[4] = "Chef";
        }
        String[] Monster = new String[6];{
            Monster[0] = "Vicious Camel";
            Monster[1] = "Your Mother"; 
            Monster[2] = "Awkward Goblin going through puberty"; 
            Monster[3] = "Copyright Law"; 
            Monster[4] = "Small Dragon"; 
            Monster[5] = "Possessed Significant Other"; 
        }
        //*************************************************************//
    int a,b,c; //declares options
    System.out.println(">>Hello Adventurer, What is your Name?");
    Character.name = input.nextLine(); //sets player name
    System.out.println(">>Welcome " + Character.name + " ,what is your weapon of choice?");
    a = (int)(Math.random() * 5); //sets random item for weapon option a
    b = (int)(Math.random() * 5); //sets random item for weapon option b
    c = (int)(Math.random() * 5); //sets random item for weapon option c
    while(b == a){b = (int)(Math.random() * 5);} //make sure b is not the same as a
    while(c == a || c == b){c = (int)(Math.random() * 5);} //make sure c is not the same as a or b     
    System.out.println(">>  a) " + Weapon[a] + " b) " + Weapon[b] + " c) " + Weapon[c]);//shows choices
    int select = 0;
    while(select == 0){ //while option hasnt been selected
        switch(input.next()) { //test to see which option was selected
            case "a": Character.weapon = Weapon[a]; //if option A, set A as weapon
                      select = 1;  //option has been selected
                      break;
            case "b": Character.weapon = Weapon[b]; //if option B, set B as weapon
                      select = 1;  //option has been selected
                      break;
            case "c": Character.weapon = Weapon[c]; //if option C, set C as weapon
                      select = 1;  //option has been selected
                      break;
        }
    }
    System.out.println(">>you have chosen the " + Character.weapon + " and what class are you?");
    
    a = (int)(Math.random() * 5); //sets random item for weapon option a
    b = (int)(Math.random() * 5); //sets random item for weapon option b
    c = (int)(Math.random() * 5); //sets random item for weapon option c
    while(b == a){b = (int)(Math.random() * 5);} //make sure b is not the same as a
    while(c == a || c == b){c = (int)(Math.random() * 5);} //make sure c is not the same as a or b     
    System.out.println(">>  a) " + Profession[a] + " b) " + Profession[b] + " c) " + Profession[c]);//shows choices
    select = 0;
    while(select == 0){ //while option hasnt been selected
        switch(input.next()) { //test to see which option was selected
            case "a": Character.profession = Profession[a]; //if option A, set A as weapon
                      select = 1;  //option has been selected
                      break;
            case "b": Character.profession = Profession[b]; //if option B, set B as weapon
                      select = 1;  //option has been selected
                      break;
            case "c": Character.profession = Profession[c]; //if option C, set C as weapon
                      select = 1;  //option has been selected
                      break;
        }
    }
    
    System.out.println(">>you have chosen the profession " + Character.profession); 
            
    switch(Character.profession) { //Check Profession and apply Specialisations
        case "Sorceror" : System.out.println(">>As a Sorceror you gain +4 MAGIC and can choose 2 spells");
                          Character.MAGIC = Character.MAGIC + 4;
                          Character.spells = Character.spells + 2;
            break;
        case "Rogue"    : System.out.println(">>As a Rogue you gain +3 STEALTH and +2 DEXTERITY");
                          Character.STEALTH = Character.STEALTH + 3;
                          Character.DEXTERITY = Character.DEXTERITY + 2;
            break;
        case "Bard"     : System.out.println(">>As a Bard you gain +4 INFLUENCE and an instrument");
                          Character.INFLUENCE = Character.INFLUENCE + 4;
                          Character.Equiptment.add("Instrument");
            break;
        case "Warrior"  : System.out.println(">>As a Warrior you gain +4 STRENGTH and +1 DEXTERITY");
                          Character.STRENGTH = Character.STRENGTH + 4;
                          Character.DEXTERITY = Character.DEXTERITY + 1;
            break;
        case "Chef"     : System.out.println(">>As a Chef you gain +4 FOOD and +1 INFLUENCE");
                          Character.FOOD = Character.FOOD + 4;
                          Character.INFLUENCE = Character.INFLUENCE + 1;
            break;
        }
    
    
    System.out.println(">>");
    System.out.println(">>Your Character so far:");
    System.out.println(">>Name: " + Character.name);
    System.out.println(">>Profession: " + Character.profession);
    System.out.println(">>Weapon: " + Character.weapon);
    }
}
    

