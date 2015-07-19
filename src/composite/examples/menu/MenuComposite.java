package composite.examples.menu;

import java.util.ArrayList;

public class MenuComposite extends MenuComponent {

    private ArrayList<MenuComponent> menuComponents;

    public MenuComposite(String name) {
        this.name = name;
        menuComponents = new ArrayList<>();
    }

    @Override
    public void add(MenuComponent component) {
        this.menuComponents.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        this.menuComponents.remove(component);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void print() {

        System.out.print(identado.toString() + "* " + getName() + "\n");
        //System.out.println(identado.toString() + "---------------------");
        identado.append("     ");
        for(MenuComponent menuComponent : menuComponents){
            menuComponent.print();
        }
        identado.setLength(identado.length() - 5);
    }
}
