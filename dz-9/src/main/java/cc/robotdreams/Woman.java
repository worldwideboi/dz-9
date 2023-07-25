package cc.robotdreams;

public class Woman extends Person
{
    private String originalLastName;

    public Woman(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.originalLastName = lastName;

    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void registerPartnership(Man partner) {
        this.partner = partner;
        this.lastName = partner.lastName;
    }

    public void deregisterPartnership(boolean returnToPreviousLastName){
        if(partner != null){
            if(returnToPreviousLastName){
                this.lastName = this.originalLastName;
            }
            this.partner = null;
        }
    }

}

