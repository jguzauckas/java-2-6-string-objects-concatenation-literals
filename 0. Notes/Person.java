public class Person {
    private String name;
    private int age;

    public Person(){
        name = "";
        age = 0;
    }

    public Person(String n, int a){
        name = n;
        age = a;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
    
    public int getAge(){
        return age;
    }

    public void setAge(int a){
        age = a;
    }

    public int numYearsUntil(int y){
        return y - age;
    }
}