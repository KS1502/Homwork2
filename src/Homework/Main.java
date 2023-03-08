package Homework;

public class Main {
    public static void main(String[] args) {


        Voter bill = new Voter("Bill",Germany,16);
        System.out.println(bill.getName() + "`s parametes are:");
        System.out.println("Address" + bill.getAddress());
        System.out.println("Age" + bill.getAge());

        Voter john = new Voter("John",Germany,13);
        System.out.println(john.getName() + "`s parametes are:");
        System.out.println("Address" + john.getAddress());
        System.out.println("Age" + john.getAge());


        john.setAge(2);
        john.setAddress(Germany);
        System.out.println(john.getName() + "`s parametes are:");
        System.out.println("Address" + john.getAddress());
        System.out.println("Age" + john.getAge());

    }
}
