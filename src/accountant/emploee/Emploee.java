package accountant.emploee;

/**
 * Created by Yuriy on 16.03.2016.
 */
public class Emploee {
    public void calcSalary(String name,double...salary){
        double total = 0;
        for (int i = 0; i < salary.length; i++) {
            total = salary[i] + total;
        }
        System.out.println("Name is: " + name);
        System.out.println("Total salary is: " + total);
        System.out.println();
    }
}


