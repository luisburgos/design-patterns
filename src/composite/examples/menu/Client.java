package composite.examples.menu;

public class Client {

    private MenuComponent allMenus;

    public Client(MenuComponent todosLosMenus) {
        this.allMenus = todosLosMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
