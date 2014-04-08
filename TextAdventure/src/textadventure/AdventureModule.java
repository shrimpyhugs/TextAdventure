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
    Encounter[] Enc = new Encounter[2];{
    Enc[0] = new Encounter();
    Enc[1] = new Encounter();
}
    public void Load() {
    
       Enc[0].load(3);
       Enc[0].Mob[0].mobcreate("Steve","VICIOUS CAMEL");
       Enc[0].Mob[1].mobcreate("Carl", "RED SNAKE",12);
       Enc[0].Mob[2].mobcreate("Johnsten", "AWKWARD GOBLIN",32,5);
       Enc[0].Description = "you walk down a dark corridor, suddenly three monsters jump out and face you to attack";
       
       
       Enc[1].load(4);
       Enc[1].Mob[0].mobcreate("Steve","VICIOUS CAMEL");
       Enc[1].Mob[1].mobcreate("Carl", "RED SNAKE",12);
       Enc[1].Mob[2].mobcreate("Johnsten", "AWKWARD GOBLIN",32,5);
       Enc[1].Mob[3].mobcreate("Freddy","SMALL DRAGON");
       Enc[1].Description = "The Narrow Passageway bends, you see ahead of you four looming monsters";
       
       
    }
}
