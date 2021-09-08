package day61_exceptions_collections;

public class ElementaryStudent {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // check if name is null first, otherwise we might get NullPointerException
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty or null");
        }
        // if name is all numbers, or starts with numbers
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 5 || age < 12){
            throw new IllegalArgumentException("Age cannot be < 5 or > 12");
        }
        this.age = age;
    }
}



