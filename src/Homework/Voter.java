package Homework;

public class Voter {
    private String name;
    private String address;
    private int age;
    //   int numberofVoter;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress(){
        return address;

    }

    public void setAddress() {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<16) {
            this.age = age;
        }else{
            System.out.println("You age must be at least 16 years old.");
        }
    }

}
