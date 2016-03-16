package accountant.emploee;

/**
 * Created by Yuriy on 16.03.2016.
 */
public class Accountant {
    public static void main(String[] args) {
        Emploee emploee1=new Emploee();//2-2-3
        Emploee emploee2=new Emploee();
        emploee1.calcSalary("Vasya",3456.67,4567.34,2345.12);
        emploee2.calcSalary("Vanya",1456.67,1567.34,1345.12);
        Person P1 = new Person();

        P1.test1(46);//2-2-4
        P1.test1(46, 97453534);
        P1.test1("Male", 97453534);
        P1.test1("Maxim", "Petrovich", "Male");
        P1.test1("Maxim", "Petrovich");

        System.out.println();
        System.out.println("*********************************************************************");
        System.out.println();

        P1.test("Maxim");
        P1.test("Maxim", "Petrovich");
        P1.test("Maxim", "Petrovich", 35);
        P1.test("Maxim", "Petrovich", 35, "Male");
        P1.test("Maxim", "Petrovich", 35, "Male", 48954789);
    }
}



