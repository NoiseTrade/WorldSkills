//This method is used for coach parameters and variables and extends from the Person class

public class Coach extends Person {

    private int coachID;
    protected Coach(int coachID,String teamName,String name, String address, String telephone) {

        super(name, address, telephone);
    }

    public int getCoachID() {
        return coachID;
    }

    public void setCoachID(int coachID) {
        this.coachID = coachID;
    }

    public String toString(){

        return "Name: " + getName();
    }

}
