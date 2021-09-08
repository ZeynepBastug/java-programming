package day48_constructors_static;

import java.util.Arrays;

public class CybertekGroups {
    public static void main(String[] args) {
        // dependency injection. Group object creation depends on String name
        Group g1 = new Group("Cyberbugs");
        // print size of members
        System.out.println(g1.getMembers().size());
        g1.addMember("Berk");
        g1.addMember("Pavel");
        g1.addMember("Elvin");
        g1.addMember("Zeynep");
        g1.addMember("Parvin");
        g1.addMember("Rasim");
        g1.addMember("Maria");

        System.out.println(g1.getMembers().size());

        System.out.println(g1.toString());

        Group g2 = new Group("CyberCats");
        g2.setMembers(Arrays.asList("Stephen", "Wakshum", "Akrem", "Bulent", "Andreea", "Andrei"));
        // print all members. not toString()
        System.out.println("group2 members = " + g2.getMembers());

        // use if statement if Akrem is in the g2
        if(g2.getMembers().contains("Akrem")){
            System.out.println("Akrem is in the g2");
        } else {
            System.out.println("Akrem is not in the g2");
        }

        // remove some members from g1
        g1.removeMember("Pavel");
        g1.removeMember("Elvin");
        System.out.println(g1);





    }
}
