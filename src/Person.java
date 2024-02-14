public class Person {
    String name;
    int age;
    String work;
    long salary;
    int phonePrice;
    public Person( String name ,  int age, String work,  long salary, int phonePrice ){
        this.name= name;
        this.age= age;
        this.work= work;
        this.salary= salary;
        this.phonePrice= phonePrice;

    }
    @Override
    public String toString() {
        return name +"  "+
                age+"   "+
                work+"  "+
                salary+"$  "+
                phonePrice+"$";
    }

    public long getMaxSalary(){
        return salary;
    }
    public long getMinSalary(){
        return salary;
    }

    public int  getPhonePrice(){
        return phonePrice;
    }

    public static long getMaxSalary(Person[] persons) {
        long max = 0;
        for (Person person : persons) {
            if (person.getMaxSalary() > max) {
                max = person.salary;
            }
        }

        return max;

    }  public static long getMinSalary(Person[] persons) {
        long min = persons[0].salary;
        for (Person person : persons) {
            if (person.getMinSalary() < min) {
                min = person.salary;
            }
        }
        return min;
    }
    public static int getPhonePrice (Person[]persons){
        int maxP = 0;
        for (Person person : persons) {
            if (person.getPhonePrice() > maxP) {
                maxP =person. phonePrice;
            }
        }

        return maxP;

    }
}





