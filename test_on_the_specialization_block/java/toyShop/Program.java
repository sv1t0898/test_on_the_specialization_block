package toyShop;

import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args){
        Toy toy1 = new Toy("конструктор", 23);
        Toy toy2 = new Toy("мячь", 4);
        Toy toy3 = new Toy("медведь", 11);
        Toy toy4 = new Toy("юла", 17);
        Toy toy5 = new Toy("кукла", 8);
        Toy toy6 = new Toy("самокат", 56);
        Toy toy7 = new Toy("коньки", 43);

        PrizeDraw prizeDraw = new PrizeDraw();

        Toys<Toy> toyBag = new Toys<>();
        System.out.println(toyBag.getToysList().size());
        toyBag.addToy(toy1);
        toyBag.addToy(toy2);
        toyBag.addToy(toy3);
        toyBag.addToy(toy4);
        toyBag.addToy(toy5);
        toyBag.addToy(toy6);
        toyBag.addToy(toy7);

        System.out.println(toyBag);
        prizeDraw.draw(toyBag);
        System.out.println(toyBag);
        prizeDraw.draw(toyBag);
        System.out.println(toyBag);
        prizeDraw.draw(toyBag);
        prizeDraw.draw(toyBag);
        prizeDraw.draw(toyBag);
        prizeDraw.draw(toyBag);
        prizeDraw.draw(toyBag);
        try{
            prizeDraw.draw(toyBag);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e + " - Подарки закончились((");
        }
        System.out.println();
        for (Object toy: prizeDraw.getIssuanceProcedure()){
            System.out.println(toy);
        }


        //prize(toyBag);

    }


}
