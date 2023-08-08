package cc.robotdreams;

public class Person
{
    protected  String firstName;
    protected String lastName;
    protected int age;
    protected Person partner;;
    private static final int retirementAgeForMan = 65;
    private static final int retirementAgeForWoman = 60;





    public Person(String firstName,String lastName,int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.partner = null;

    }
    public boolean isRetired() {
        if (this instanceof Man) {
            return age >= retirementAgeForMan;
        } else if (this instanceof Woman) {
            return age >= retirementAgeForWoman;
        } else {
            return false;
        }
    }


}
