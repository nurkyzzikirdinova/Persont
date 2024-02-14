//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Name   Age    Work    Salary Phone ");
        Person person1  =  new Person("Asylay", 22, "DevOps ", 2500, 1200);
        Person person2  =  new Person("Azamat", 40, "SecOps ", 3500, 1800);
        Person person3  =  new Person("Aimana", 42, "Product", 2800, 500);
        Person person4  =  new Person("Ayanai", 23, "Backend", 1500, 1100);
        Person person5  =  new Person("Kairat", 39, "Android", 5900, 1200);

        Person [] persons = {person1, person2, person3, person4, person5};


        for(Person person : persons){
            System.out.println(person);
        }
        System.out.println( );
        for(Person person : persons) {
            long mostMax = Person.getMaxSalary(persons);

            System.out.println("Эн жогорку айлык: " + mostMax + "$");
            break;

        }
        long mostMin = Person.getMinSalary(persons);
        System.out.println("Эн аз айлык: " + mostMin + "$" );

        int expensivePhone = Person.getPhonePrice(persons);
        System.out.println("Эн кымбат телефон: "+expensivePhone+ "$" );


    }
}