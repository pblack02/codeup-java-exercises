public class Person {
    private static String name;

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public static String sayHello(){
//TODO: print a message to the console using the person's name
       return  "Hello " + name;
    }
    public static String getName(){
//TODO: return the person's name
        return sayHello();
    }


    public static void main(String[] args) {
        Person presley = new Person();
        presley.name = "Presley Black";
        Person person1 = new Person();
        person1.name = "john";
        Person person2 = new Person();
        person2.name = "john";
//        System.out.println(getName(person2.name));
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//
////         we are setting them equal to each-other: outcome is true.
//        person2 = person1;
////        System.out.println(person1 == person2);
//        presley.setName("Bod");
//        System.out.println(presley.getName());
//
//        presley.setName("john");
//        System.out.println(presley.getName());

    }

}
