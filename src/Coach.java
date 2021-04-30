public class Coach extends Person {

    protected Coach(String teamName,String name, String address, String telephone) {

        super(name, address, telephone);
    }

    public String toString(){

        return "Name: " + getName();
    }


}
