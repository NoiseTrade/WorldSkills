abstract public class Person {

    private String name;
    private String address;
    private String telephone;

    public String getName() {

        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Person(String name, String address, String telephone) {

        this.name = name;
        this.address = address;
        this.telephone = telephone;
    }



}
