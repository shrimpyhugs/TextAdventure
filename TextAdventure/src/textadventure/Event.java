/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package textadventure;
public class Event {
String Description;
int quantity, RelQuantity,QueQuantity;//amount of Monsters, amount of Options
Monster[] Mob;//array for Monster storage
String[] CommandRel;//array for the relocator Commands storage
    int[] LocRel;//array for Option location storage
String[] CommandQue;//array for query commands storage
    String[] InfoQue;//array for query info storage
String examine;//Examine Description
int CanFlee;//can you flee in the fight
public void load(int MobQty, int RelQty, int QueQty){
quantity = MobQty;//sets amount of Monsters
RelQuantity = RelQty;//sets amount of Options
QueQuantity = QueQty;
Mob = new Monster[quantity];//initialises Array 
LocRel = new int[RelQuantity];//initialises Array
CommandRel = new String[RelQuantity];//initialises Array
InfoQue = new String[QueQuantity];//initialises Array
CommandQue = new String[QueQuantity];//initialises Array
for(int i = 0; i < quantity; i++)
    Mob[i] = new Monster();//adds each monster to Array

}
}