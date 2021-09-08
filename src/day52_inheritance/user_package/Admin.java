package day52_inheritance.user_package;

public class Admin extends User{

    public Admin(){
        super(); // call super/user class no=args constructor
        System.out.println("Admin class constructer");
    }

    @Override
    public String toString(){
        return "Admin{" +
                "role: " + getRole() +
                ", name: " + getName() +
                ", id: " + getId() + "}";
    }
}
