/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.examples.menu;

/**
 *
 * @author luisburgos
 */
public class MenuItem extends MenuComponent {

    private boolean vegetarian;
    private double price;

    public MenuItem(String name, boolean vegetarian, double price) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public boolean isVegetarian() {
        return this.vegetarian;
    }

    @Override
    public void print() {
        System.out.print(identado.toString() + "# " +  getName());
        if (isVegetarian()) {
            System.out.print("(v)");
        }
        System.out.println("," + getPrice());
    }

}
