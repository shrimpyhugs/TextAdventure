/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package textadventure;
public class Event {
String Description;
int quantity, RelQuantity,QueQuantity,TestQuantity;//amount of Monsters, amount of Options
Monster[] Mob;//array for Monster storage
String[] CommandRel;//array for the relocator Commands storage
    int[] LocRel;//array for Option location storage
String[] CommandQue;//array for query commands storage
    String[] InfoQue;//array for query info storage
String[] TestAttribute;//array for the Test Attribute
    int[] TestPassScore;//array for the score the test needs to succeed
    String[] TestSuccessMsg;
    int[] TestSuccessLoc;
    String[] TestFailureMsg;
    int[] TestFailureLoc;
    String[] TestCommand;
String examine;//Examine Description
int CanFlee;//can you flee in the fight

public void load(int MobQty, int RelQty, int QueQty, int TestQty){
quantity = MobQty;//sets amount of monsters
RelQuantity = RelQty;//sets amount of relocators
QueQuantity = QueQty;//sets amount of queries
TestQuantity = TestQty;//sets amount of tests


Mob = new Monster[quantity];//initialises Array 
LocRel = new int[RelQuantity];//initialises Array
CommandRel = new String[RelQuantity];//initialises Array
InfoQue = new String[QueQuantity];//initialises Array
CommandQue = new String[QueQuantity];//initialises Array
TestCommand = new String[TestQuantity];//initialises Array
TestAttribute = new String[TestQuantity];//initialises Array
TestPassScore = new int[TestQuantity];//initialises Array
TestSuccessMsg = new String[TestQuantity];//initialises Array
TestSuccessLoc = new int[TestQuantity];//initialises Array
TestFailureMsg = new String[TestQuantity];//initialises Array
TestFailureLoc = new int[TestQuantity];//initialises Array
for(int i = 0; i < quantity; i++)
    Mob[i] = new Monster();//adds each monster to Array

}


}