package accountant.emploee;

/**
 * Created by Yuriy on 16.03.2016.
 */
public class Accountant {
    public static void main(String[] args) {
        Emploee emploee1=new Emploee();
        Emploee emploee2=new Emploee();
        emploee1.calcSalary("Vasya",3456.67,4567.34,2345.12);
        emploee2.calcSalary("Vanya",1456.67,1567.34,1345.12);
    }

}
