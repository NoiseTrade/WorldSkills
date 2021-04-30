public class Students extends Person{

    private int studentID;
    private String specialisation;

    public Students(String teamName, String name, String address, String telephone, int studentID, String specialisation) {
        super(name,address,telephone);


        this.studentID = studentID;
        this.specialisation = specialisation;

    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public String toString(){
        return  "\nName: "+ getName() + " Student Id: " + getStudentID()+ " Skill: " +getSpecialisation();
    }

}
