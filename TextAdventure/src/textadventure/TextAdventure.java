
package textadventure;

/**
 * @author Dylan
 */
import java.util.Scanner;

public class TextAdventure {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //your everyday run of the mill Scanner
        CharacterInfo character = new CharacterInfo(); //Create Character
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
    System.out.println("Hello Adventurer, What is your Name?");
    character.name = input.nextLine(); //sets player name
    System.out.println("Welcome " + character.name + " ,what is your weapon of choice?");
    a = (int)(Math.random() * 5); //sets random item for weapon option a
    b = (int)(Math.random() * 5); //sets random item for weapon option b
    c = (int)(Math.random() * 5); //sets random item for weapon option c
    while(b == a){b = (int)(Math.random() * 5);} //make sure b is not the same as a
    while(c == a || c == b){c = (int)(Math.random() * 5);} //make sure c is not the same as a or b     
    System.out.println("a) " + Weapon[a] + " b) " + Weapon[b] + " c) " + Weapon[c]);//shows choices
    int select = 0;
    while(select == 0){ //while option hasnt been selected
        switch(input.next()) { //test to see which option was selected
            case "a": character.weapon = a; //if option A, set A as weapon
                      select = 1;  //option has been selected
            case "b": character.weapon = b; //if option B, set B as weapon
                      select = 1;  //option has been selected
            case "c": character.weapon = c; //if option C, set C as weapon
                      select = 1;  //option has been selected
        }
    }
    System.out.println("aah the " + character.weapon + " An Excellent choice");
    
        System.out.println("and what class are you?");
    a = (int)(Math.random() * 5); //sets random item for weapon option a
    b = (int)(Math.random() * 5); //sets random item for weapon option b
    c = (int)(Math.random() * 5); //sets random item for weapon option c
    while(b == a){b = (int)(Math.random() * 5);} //make sure b is not the same as a
    while(c == a || c == b){c = (int)(Math.random() * 5);} //make sure c is not the same as a or b     
    System.out.println("a) " + Profession[a] + " b) " + Profession[b] + " c) " + Profession[c]);//shows choices
    select = 0;
    while(select == 0){ //while option hasnt been selected
        switch(input.next()) { //test to see which option was selected
            case "a": character.profession = a; //if option A, set A as weapon
                      select = 1;  //option has been selected
            case "b": character.profession = b; //if option B, set B as weapon
                      select = 1;  //option has been selected
            case "c": character.profession = c; //if option C, set C as weapon
                      select = 1;  //option has been selected
        }
    }
    
    }
    
}
