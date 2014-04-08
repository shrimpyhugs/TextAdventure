/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package textadventure;
public class Encounter {
String Description;
int quantity;
public Monster[] Mob;

public void load(int Qty){
quantity = Qty;
Mob = new Monster[quantity];
for(int i = 0; i < quantity; i++)
    Mob[i] = new Monster();
}
}