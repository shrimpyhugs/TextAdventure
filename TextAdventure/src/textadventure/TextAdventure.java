
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
    System.out.println(">>Welcome " + Character.name + " , choose a class:");
    System.out.println(">> a)Sorceror b) Rogue c) Bard d) Warrior e) Chef");
    int select = 0;
    while(select == 0){ //while option hasnt been selected
        switch(input.next()) { //test to see which option was selected
            case "a": Character.profession = Profession[0]; //Set Sorceror Profession
                      select = 1;  //option has been selected
                      break;
            case "b": Character.profession = Profession[1]; //Set Rogue Profession
                     select = 1;  //option has been selected
                      break;
            case "c": Character.profession = Profession[2]; //Set Bard Profession
                      select = 1;  //option has been selected
                      break;
            case "d": Character.profession = Profession[3]; //Set Bard Profession
                      select = 1;  //option has been selected
                      break;
            case "e": Character.profession = Profession[4]; //Set Bard Profession
                      select = 1;  //option has been selected
                      break;
        }
    //************************************RANDOM EVENT CHOICE*************************************************************//
    //a = (int)(Math.random() * 5); //sets random item for weapon option a
    //b = (int)(Math.random() * 5); //sets random item for weapon option b
    //c = (int)(Math.random() * 5); //sets random item for weapon option c
    //while(b == a){b = (int)(Math.random() * 5);} //make sure b is not the same as a
    //while(c == a || c == b){c = (int)(Math.random() * 5);} //make sure c is not the same as a or b     
    //System.out.println(">>  a) " + Profession[a] + " b) " + Profession[b] + " c) " + Profession[c]);//shows choices
    //int select = 0;
    //while(select == 0){ //while option hasnt been selected
    //    switch(input.next()) { //test to see which option was selected
    //        case "a": Character.profession = Profession[a]; //if option A, set A as weapon
    //                  select = 1;  //option has been selected
    //                  break;
    //        case "b": Character.profession = Profession[b]; //if option B, set B as weapon
    //                 select = 1;  //option has been selected
    //                  break;
    //        case "c": Character.profession = Profession[c]; //if option C, set C as weapon
    //                  select = 1;  //option has been selected
    //                  break;
    //    }
    //}
    //********************************************************************************************************************//
    Character.create();
    System.out.println(">>you have chosen the profession " + Character.profession); 
    System.out.println(">>");
    System.out.println(">>Your Character so far:");
    System.out.println(">>Name: " + Character.name);
    System.out.println(">>Profession: " + Character.profession);
    System.out.println(">>Weapon: " + Character.weapon);
    System.out.println(">>STRENGTH: " + Character.STRENGTH);
    System.out.println(">>DEXTERITY: " + Character.DEXTERITY);
    System.out.println(">>STEALTH: " + Character.STEALTH);
    System.out.println(">>INFLUENCE: " + Character.INFLUENCE);
    System.out.println(">>MAGIC: " + Character.MAGIC);
    System.out.println(">>FOOD: " + Character.FOOD);

    }
    }
}


    

