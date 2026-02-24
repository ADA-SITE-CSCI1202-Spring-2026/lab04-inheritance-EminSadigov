package week06;

public class Person {
    
    private String firstName;
    private String lastName;
    private String gender;

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName(){
        return firstName;

    }

    public void setFIrstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }


    public boolean equals(Person p){
        if(this.firstName.equals(p.firstName) && this.lastName.equals(p.lastName)){
            return true;
        }
        return false;
    }
}
