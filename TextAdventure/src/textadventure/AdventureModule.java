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
    Event[] Eve = new Event[2];{
    Eve[0] = new Event();
    Eve[1] = new Event();
    }
    
    public void Load() {
       
    //**********************************ENCOUNTER_DETAILS***********************************************//
       Eve[0].load(4,2,0);
       Eve[0].Description = ">> The Narrow Passageway bends, you see ahead of you a crossroads, there are passsages to the left and right and straight on. do you (go left) (go right) or (go forward)?";
       Eve[0].examine = "as you peer down each passage, you see that the left descends after a short distance in a shallow stairway. the right and forward passages have no significant features";
       //Relocators
       Eve[0].CommandRel[0] = "Go Left";
       Eve[0].LocRel[0] = 1;
       Eve[0].CommandRel[1] = "Go Right";
       Eve[0].LocRel[1] = 2;
        
       Eve[1].load(3,0,0);
       Eve[1].Mob[0].mobcreate("Steve","VICIOUS CAMEL");
       Eve[1].Mob[1].mobcreate("Carl", "RED SNAKE",12);
       Eve[1].Mob[2].mobcreate("Johnsten", "AWKWARD GOBLIN",32,5);
       Eve[1].Description = ">> you walk down the dark corridor, suddenly three monsters jump out and face you to attack";
       Eve[1].examine = ">> The monsters dont appear to be frightened by your appearance in their home";
       

       
    }
}
