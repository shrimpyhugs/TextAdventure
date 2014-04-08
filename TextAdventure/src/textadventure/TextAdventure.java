
package textadventure;

/**
 * @author Dylan
 */
import java.util.Scanner;

public class TextAdventure {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //your everyday run of the mill Scanner
        CharacterInfo Character = new CharacterInfo(); //Create Character
        AdventureModule Adventure = new AdventureModule(); //load adventure module
      
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
        //*************************************************************//
        
    int a,b,c; //declares options
    System.out.println(">> Hello Adventurer, What is your Name?");
    Character.name = input.nextLine(); //sets player name
    System.out.println(">> Welcome " + Character.name + " , choose a class:");
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
            case "d": Character.profession = Profession[3]; //Set Warrior Profession
                      select = 1;  //option has been selected
                      break;
            case "e": Character.profession = Profession[4]; //Set Chef Profession
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
    Character.create();//rolls for stats and applies specialisations
    System.out.println(">> you have chosen the class " + Character.profession); 
    System.out.println();
    System.out.println(">> Your Character so far:");
    System.out.println(">> Name: " + Character.name);
    System.out.println(">> Profession: " + Character.profession);
    System.out.println(">> Weapon: " + Character.weapon);
    System.out.println(">> STRENGTH: " + Character.STRENGTH);
    System.out.println(">> DEXTERITY: " + Character.DEXTERITY);
    System.out.println(">> STEALTH: " + Character.STEALTH);
    System.out.println(">> INFLUENCE: " + Character.INFLUENCE);
    System.out.println(">> MAGIC: " + Character.MAGIC);
    System.out.println(">> FOOD: " + Character.FOOD);
    System.out.println();
    System.out.println(">> Begin your journey? (y)");
    while(!"y".equals(input.next())){}
    Adventure.Load();
    //************************************COMBAT ENCOUNTER*****************************************//
    System.out.println(">> " + Adventure.Enc[0].Description);//details information about encounter
    
    String response = "";//sets response string for input and initialises it
    int end = 0;//integer to see if encounter ends (1)
    while(!"attack".equals(response) && end == 0){//run through until "attack" is called or encounter ends (1) otherwise
    response = input.next();
    switch(response){
        case "examine":
            for(int i = 0; i < Adventure.Enc[0].quantity; i++){//loops through every monster
                int q = Adventure.Enc[0].Mob[i].MobType;
                System.out.print(">> Type: " + Adventure.Enc[0].Mob[i].MobSelection.get(q));
                System.out.println(", Name: " + Adventure.Enc[0].Mob[i].MobName);           
            }
            response = ""; //clear response for next input
        break;
        case "flee": 
            int i = (int)(Math.random() * 10 + 1);
            System.out.println(">> You rolled a " + i);
            if((i - Adventure.Enc[0].quantity + (Character.DEXTERITY - 10) >= 7)){
                System.out.println(">> You Flee from the enemy!");//success
                end = 1; //states combant has ended
                
            }
            else{
                System.out.println(">> the enemy catch up to you, -2 HEALTH and you must stand and fight!");
                Character.HEALTH = Character.HEALTH - 2;//loose 2 HEALTH from fail.
                response = "Attack";//cause Attack Case
            }     
        break;
            case "attack":System.out.println(">> Commence Combat");
            //combat goes here
            end = 1;
        break;
    }
    }
    
    //*****************************************************************************************//
    }
  }
}




