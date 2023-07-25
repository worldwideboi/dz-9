package cc.robotdreams;

public class Woman extends Person
{
    public Woman(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
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
                this.lastName = this.partner.lastName;
            }
            this.partner = null;
        }
    }

}

