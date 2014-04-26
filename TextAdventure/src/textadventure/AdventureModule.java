/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package textadventure;
/**
 *
 * @author Dylan
 */
public class AdventureModule {
    Event[] Eve = new Event[11];{
    Eve[0] = new Event();
    Eve[1] = new Event();
    Eve[2] = new Event();
    Eve[3] = new Event();
    Eve[4] = new Event();
    Eve[5] = new Event();
    Eve[6] = new Event();
    Eve[7] = new Event();
    Eve[8] = new Event();
    Eve[9] = new Event();
    Eve[10] = new Event();
    }
    
    public void Load(CharacterInfo Character) {
       
    //**********************************ENCOUNTER_DETAILS***********************************************//
       //event 0
       Eve[0].load(0,3,0,0,0,0,0);
       Eve[0].Description = "The Narrow Passageway bends, you see ahead of you a crossroads, there are passsages to the left and right and straight on. do you (go left) (go right) or (go forward)?";
       Eve[0].examine = "as you peer down each passage, you see that the left descends after a short distance in a shallow stairway. the right and forward passages have no significant features";
       Eve[0].CommandRel[0] = "Go foward";
       Eve[0].LocRel[0] = 1;
       Eve[0].CommandRel[1] = "Go Right";
       Eve[0].LocRel[1] = 2;
       Eve[0].CommandRel[2] = "Go Left";
       Eve[0].LocRel[2] = 3;
       
       //event 1 "Go Forward"
       Eve[1].load(3,0,0,0,0,0,0);
       Eve[1].Description = "you walk down the dark corridor, suddenly three monsters jump out and face you to attack";
       Eve[1].examine = "The monsters dont appear to be frightened by your appearance in their home";
       //monsters with (NAME, TYPE, HITPOINTS, STRENGTH)
       Eve[1].Mob[0].mobcreate("Steve","VICIOUS CAMEL");
       Eve[1].Mob[1].mobcreate("Carl", "RED SNAKE",12);
       Eve[1].Mob[2].mobcreate("Johnsten", "AWKWARD GOBLIN",32,5);
       
       //event 2 "Go Right"
       Eve[2].load(0,1,1,1,0,0,0); // (Mobquantity, Relqty, infoqty, testqty, ItemCollectQty, ItemRemoveQty, ItemTestQty)      
       Eve[2].Description = "the dim passage way continues for a short while then stops abruptly with a heavy wooden door. do you try to (open the door) or (go back)?";
       Eve[2].examine = "upon closer examination you see the door has a lock, there doesnt appear to be any key nearby, maybe you could (kick down door)?";
       
       //Relocator, a Command and an event that the command will trigger
       Eve[2].CommandRel[0] = "go back";
       Eve[2].LocRel[0] = 5;
       
       //Query, a command that triggers text within the even to be displayed
       Eve[2].CommandQue[0] = "Open the Door";
       Eve[2].InfoQue[0] = "you attempt to open the door but it is locked, maybe you could try and (Kick Down Door)?"; 
       
       //Testm a command that tests a players Attribute, with a Passscore, success and fail messages and new event locators.
       Eve[2].TestCommand[0] = "Kick Down Door";
       Eve[2].TestAttribute[0] = "STRENGTH";
       Eve[2].TestPassScore[0] = 7;
       Eve[2].TestSuccessMsg[0] = "You Succeed in Kicking the door down, you enter.";
       Eve[2].TestFailureMsg[0] = "You fail to kick the door down, your only option is to go back.";
       Eve[2].TestSuccessLoc[0] = 4;
       Eve[2].TestFailureLoc[0] = 5;

       //event 3 "Go Left"
       //TO BE COMPLETED
       Eve[3].load(1,1,1,1,0,0,0);
       Eve[3].Description = "You follow the passage and go down the shallow staircase, suddenly a magical dragon appears with a magic wand, he doesnt seem bothered with you (Talk to him), (Run past him quickly), (go back)";
       Eve[3].examine = "he is wearing glasses";
       Eve[3].Mob[0].mobcreate("Barry Smotter", "SMALL DRAGON");
       Eve[3].CommandQue[0] = "talk to him";
       Eve[3].InfoQue[0] = "'Sod off' he says and he goes to sleep";
       Eve[3].CommandRel[0] = "go back";
       Eve[3].LocRel[0] = 8;
       Eve[3].TestCommand[0] = "run past him quickly";
       Eve[3].TestAttribute[0] = "DEXTERITY";
       Eve[3].TestPassScore[0] = 9;
       Eve[3].TestSuccessMsg[0] = "You jump past the Dragon and continue down the corridor";
       Eve[3].TestSuccessLoc[0] = 9;
       Eve[3].TestFailureMsg[0] = "You try to jump but the Dragon's tail swings and blocks you";
       Eve[3].TestFailureLoc[0] = 10;

       //event 4 "Kick Down Door" Success
       Eve[4].load(2,0,0,1,0,0,0);
       Eve[4].Description = "Past the door the corridor travels for a fair way, you soon enter a dimly lit room, there appears to be no other exits and inside are two glass bagel fangirls who turn to face you";
       Eve[4].examine = "you notice a lever on the wall to your right, you just might be able to reach it (pull lever)";
       Eve[4].Mob[0].mobcreate("Sam", "GLASS BAGEL FANGIRL");
       Eve[4].Mob[1].mobcreate("Dylan", "GLASS BAGEL FANGIRL");
       
       //event 5 "go back" (Same Location as Event 0)
       Eve[5].load(0,3,0,0,0,0,0);
       Eve[5].Description = "You return to the crossroads, from here you can (go right),(go forward), or leave the dungeon and (go left)";
       Eve[5].examine = "the forward path descends after a short distance into a shallow stairway. the right passage has no significant features and the left passage has dim light from the entrance of the Dungeon around the bend.";
       Eve[5].CommandRel[0] = "Go foward";
       Eve[5].LocRel[0] = 3;
       Eve[5].CommandRel[1] = "Go Right";
       Eve[5].LocRel[1] = 1;
       Eve[5].CommandRel[2] = "Go Left";
       Eve[5].LocRel[2] = 6;
       
       //event 6 "Go left" (Exiting the Dungeon)
       Eve[6].load(0,1,0,0,0,0,0);
       Eve[6].Description = "The light is blinding but as you adjust to the daylight it is nice and the wind is refreshing, you can end the adventure here or (go back)";
       Eve[6].examine = "the outside terrain of this cavern entrance is covered in small shrubs and small trees are dispersed among them";
       Eve[6].CommandRel[0] = "Go Back";
       Eve[6].LocRel[0] = 7;
       
       //event 7 "go back" clone of Event 1, view from the entrance
      
       //event 8 "go back" clone from Event 1, view from "go left" 
       
       //event 9 Pass Dragon Success
       
       //event 10 Pass Dragon Failure
    }
}
