package toyShop;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class PrizeDraw{

    private int totalWeight;
    private int counterWeight;
    private int randomWeight;

    private Queue<Toy> issuanceProcedure;

    public LinkedList getIssuanceProcedure(){
        return (LinkedList) this.issuanceProcedure;
    }

    public PrizeDraw(){
        this.issuanceProcedure = new LinkedList<>();
    }

    public void draw(Toys<Toy> toys){
        if (toys.getToysList().size() == 0){
            throw new ArrayIndexOutOfBoundsException();

        }else{
            this.totalWeight = 0;
            this.counterWeight = 0;
            for(Toy toy: toys.getToysList()){
                this.totalWeight += toy.getWeight();
            }
            this.randomWeight = new Random().nextInt(totalWeight);
            int index = 0;
            for (Toy toy: toys.getToysList()) {
                this.counterWeight += toy.getWeight();
                if (this.counterWeight >= this.randomWeight) {
                    toys.getToysList().remove(index);
                    this.issuanceProcedure.add(toy);
                    System.out.println(toy);
                    break;
                }
                index ++;
            }
        }

    }


    
}
