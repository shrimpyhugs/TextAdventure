
package textadventure;

/**
 * @author Dylan
 */
import java.util.Scanner;

public class TextAdventure {
    static TextAdventure TextAdv;
    public static void main(String[] args) {
  
        Scanner input = new Scanner(System.in); //your everyday run of the mill Scanner
        CharacterInfo Character = new CharacterInfo(); //Create Character
        AdventureModule Adventure = new AdventureModule(); //load adventure module
        TextAdv = new TextAdventure();
        //**************************choices****************************//
        //String[] Weapon = new String[5];{
        //    Weapon[0] = "Frying Pan";
        //    Weapon[1] = "Flail";
        //    Weapon[2] = "Cutlass";
        //    Weapon[3] = "Fists";
        //    Weapon[4] = "Shotgun";
        //}
        
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
    System.out.println(">> (a)Sorceror (b) Rogue (c) Bard (d) Warrior (e) Chef");
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
    Adventure.Load(Character);
    TextAdv.Event(Adventure, Character, 0);

    }
  }
        
  public void Event(AdventureModule Adventure, CharacterInfo Character, int CurrentEvent){
      Scanner input = new Scanner(System.in);//Standard run of the mill scanner
      int NextEvent = CurrentEvent;
      int end = 0;//integer to see if encounter ends (1)
    System.out.println(">> " + Adventure.Eve[CurrentEvent].Description);//details information about encounter
    while(end == 0){    
    String response = input.nextLine();
    //examine
    if(response.equalsIgnoreCase("examine")){
    System.out.println(">> " + Adventure.Eve[CurrentEvent].examine);
    if(Adventure.Eve[CurrentEvent].quantity > 0){
    for(int i = 0; i < Adventure.Eve[CurrentEvent].quantity; i++)
        System.out.println(">> Monster Name: " + Adventure.Eve[CurrentEvent].Mob[i].MobName + " | Mob Type: " + Adventure.Eve[CurrentEvent].Mob[i].MobType);
    }
    }
    //Add Item
    for(int i = 0; i < Adventure.Eve[CurrentEvent].ItemCollectQty; i++){
        if(response.equalsIgnoreCase(Adventure.Eve[CurrentEvent].ItemCollectCommand[i])){
            for(int j = 0; j < Character.Equiptment.size(); j++){
                if(Adventure.Eve[CurrentEvent].ItemCollectName[i].equals(Character.Equiptment.get(j))){
                    int Qty = Character.EquiptmentQty.get(j);
                    Character.EquiptmentQty.set(j,Qty + Adventure.Eve[CurrentEvent].ItemCollectQuantity[i]);              
                }
                else{
                Character.Equiptment.add(Adventure.Eve[CurrentEvent].ItemCollectName[i]);
                Character.EquiptmentQty.add(Adventure.Eve[CurrentEvent].ItemCollectQuantity[i]);
                }          
            }
        }
    }
    //Remove Item
    for(int i = 0; i < Adventure.Eve[CurrentEvent].ItemRemoveQty; i++){
        if(response.equalsIgnoreCase(Adventure.Eve[CurrentEvent].ItemRemoveCommand[i])){
            for(int j = 0; j < Character.Equiptment.size(); j++){
                if(Adventure.Eve[CurrentEvent].ItemCollectName[i].equals(Character.Equiptment.get(j))){
                    //Delete equiptment
                }          
            }
        }
    }
    //Item Tests
    
    //Ability Tests
    for(int i = 0; i < Adventure.Eve[CurrentEvent].TestQuantity; i++){
        if(response.equalsIgnoreCase(Adventure.Eve[CurrentEvent].TestCommand[i])){
        switch(Adventure.Eve[CurrentEvent].TestAttribute[i]){
            case "STRENGTH": 
                if(((int)(Math.random() * 10 + 1) + (Character.STRENGTH - 10)) > Adventure.Eve[CurrentEvent].TestPassScore[i]){
                    System.out.println(">> " + Adventure.Eve[CurrentEvent].TestSuccessMsg[i]);
                    NextEvent = Adventure.Eve[CurrentEvent].TestSuccessLoc[i];
                }
                else{
                    System.out.println(">> " + Adventure.Eve[CurrentEvent].TestFailureMsg[i]);
                    NextEvent = Adventure.Eve[CurrentEvent].TestFailureLoc[i];
                }
                end = 1;
                break;
            case "DEXTERITY":
                if(((int)(Math.random() * 10 + 1) + (Character.DEXTERITY - 10)) > Adventure.Eve[CurrentEvent].TestPassScore[i]){
                    System.out.println(">> " + Adventure.Eve[CurrentEvent].TestSuccessMsg[i]);
                    NextEvent = Adventure.Eve[CurrentEvent].TestSuccessLoc[i];
                }
                else{
                    System.out.println(">> " + Adventure.Eve[CurrentEvent].TestFailureMsg[i]);
                    NextEvent = Adventure.Eve[CurrentEvent].TestFailureLoc[i];
                }
                end = 1;
                break;
            case "MAGIC":
                if(((int)(Math.random() * 10 + 1) + (Character.MAGIC - 10)) > Adventure.Eve[CurrentEvent].TestPassScore[i]){
                    System.out.println(">> " + Adventure.Eve[CurrentEvent].TestSuccessMsg[i]);
                    NextEvent = Adventure.Eve[CurrentEvent].TestSuccessLoc[i];
                }
                else{
                    System.out.println(">> " + Adventure.Eve[CurrentEvent].TestFailureMsg[i]);
                    NextEvent = Adventure.Eve[CurrentEvent].TestFailureLoc[i];
                }
                end = 1;
                break;
            case "STEALTH":
                if(((int)(Math.random() * 10 + 1) + (Character.STEALTH - 10)) > Adventure.Eve[CurrentEvent].TestPassScore[i]){
                    System.out.println(">> " + Adventure.Eve[CurrentEvent].TestSuccessMsg[i]);
                    NextEvent = Adventure.Eve[CurrentEvent].TestSuccessLoc[i];
                }
                else{
                    System.out.println(">> " + Adventure.Eve[CurrentEvent].TestFailureMsg[i]);
                    NextEvent = Adventure.Eve[CurrentEvent].TestFailureLoc[i];
                }
                end = 1;
                break;
            case "INFLUENCE":
                if(((int)(Math.random() * 10 + 1) + (Character.INFLUENCE - 10)) > Adventure.Eve[CurrentEvent].TestPassScore[i]){
                    System.out.println(">> " + Adventure.Eve[CurrentEvent].TestSuccessMsg[i]);
                    NextEvent = Adventure.Eve[CurrentEvent].TestSuccessLoc[i];
                }
                else{
                    System.out.println(">> " + Adventure.Eve[CurrentEvent].TestFailureMsg[i]);
                    NextEvent = Adventure.Eve[CurrentEvent].TestFailureLoc[i];
                }
                end = 1;
                break;
        }
    }
    }   
    
    
    //relocators    
    for(int i = 0; i < (Adventure.Eve[CurrentEvent].RelQuantity); i++){  
        if(response.equalsIgnoreCase(Adventure.Eve[CurrentEvent].CommandRel[i])){
                if(Adventure.Eve[CurrentEvent].LocRel[i] != -1){
                NextEvent = Adventure.Eve[CurrentEvent].LocRel[i];
                end = 1;
                }
                }
    }
   
    //Queries
            for(int i = 0; i < Adventure.Eve[CurrentEvent].QueQuantity; i++){
                if(response.equalsIgnoreCase(Adventure.Eve[CurrentEvent].CommandQue[i]))
                System.out.println(">> " + Adventure.Eve[CurrentEvent].InfoQue[i]);
            }
    //if monster encounter
    if(Adventure.Eve[CurrentEvent].quantity < 0){ //if there are monsters, dislay monster types
    response = "";//sets response string for input and initialises it
    while(!"attack".equals(response)){//run through until "attack" is called or encounter ends (1) otherwise
    response = input.next();
    switch(response){
        
        case "flee": 
            if(Adventure.Eve[CurrentEvent].CanFlee){
            int i = (int)(Math.random() * 10 + 1);
            System.out.println(">> You rolled a " + i);
           if((i - Adventure.Eve[CurrentEvent].quantity + (Character.DEXTERITY - 10) >= 7)){
               System.out.println(">> You Flee from the enemy!");//success
                end = 1; //states combant has ended
                
                }
                else{
                    System.out.println(">> the enemy catch up to you, -2 HEALTH and you must stand and fight!");
                    Character.HEALTH = Character.HEALTH - 2;//loose 2 HEALTH from fail.
                    response = "Attack";//cause Attack Case
                }
            }
            else
                System.out.println(">> you cannot flee from this encounter");
            break;        
        case "attack":System.out.println(">> Commence Combat");
            //combat goes here
            int Mobsleft = Adventure.Eve[CurrentEvent].quantity;
            boolean CharInitiative;
            
            //Calculating Initiative
            int MobInt = (int)(Math.random() * 10 + 1 + Adventure.Eve[CurrentEvent].quantity);
            int CharInt = (int)(Math.random() * 10 + 1 + (Character.DEXTERITY - 10));
            if(CharInt > MobInt)
                CharInitiative = true;
            else
                CharInitiative = false;
            //
            while(Character.HEALTH > 0 || Mobsleft > 0){
            
            }
            end = 1;
        break;
    }
    }
    }
    
  }
    TextAdv.Event(Adventure, Character, NextEvent);
    
  }
            
   
}
    
    
  
  
  





