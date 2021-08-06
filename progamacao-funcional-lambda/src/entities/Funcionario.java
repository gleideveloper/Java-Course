package entities;

public class Funcionario {
    private String name;
    private String email;
    private Double salary;

    public Funcionario(String name, String email, Double salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    //Interface funcional Predicate
    public static boolean staticPredicateSalaryRef(Funcionario p){
        return p.getSalary() >= 2000;
    }
    public boolean noStaticFuncPredicate(){
        return salary >= 100;
    }

    //Interface funcional Consumer
    public static void staticPriceUpdate(Funcionario p){
        p.setSalary(p.getSalary() * 1.1);
    }
    public void noStaticPriceUpdate(){
        salary = salary * 1.1;
    }

    //Interface funcional Function
    public static String staticFunctionGetEmail(Funcionario p){
        return p.getEmail();
    }

    public String noStaticUpperCaseName(){
        return name.toUpperCase();
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "name = " + name + '\'' +
                "Email = " + email +
                "| salary=" + salary +
                '}';
    }
}
