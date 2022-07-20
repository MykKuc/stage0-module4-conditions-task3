package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double calculatedSalary;
        if(salary < 0 ){
            System.out.println("wrong input!");
        }else if(salary <= 10000){
            calculatedSalary = salary*0.85;
            System.out.println(calculatedSalary);
        }else if(salary <= 20000){
            calculatedSalary = salary*0.82;
            System.out.println(calculatedSalary);
        }else{
            calculatedSalary = salary*0.80;
            System.out.println(calculatedSalary);
        }
    }
}
