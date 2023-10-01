package toyShop;

import java.util.LinkedList;

public class Toys<T extends Toy> {

    public LinkedList<T> toysList;
    private int counterId;
    public Toys(){
        this.toysList = new LinkedList<>();
        this.counterId = 0;
    }

    public LinkedList<T> getToysList() {
        return toysList;
    }

    public void addToy(T toy){
        toy.setId(counterId);
        this.toysList.add(toy);
        this.counterId ++;

    }


    @Override
    public String toString() {
        return "Toys{" +
                "toysList=" + toysList +
                '}';
    }
}
