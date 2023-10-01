package toyShop;

public class Toy {

    private Integer id;
    public String name;
    public Integer weight;


    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getId(){
        return this.id;
    }
    public Integer getWeight(){
        return this.weight;
    }
    public void setId(int id){
        this.id = id;
    }

    public Toy(String name, Integer weight){
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return this.id + " " + this.weight + " " + this.name;
    }
}
