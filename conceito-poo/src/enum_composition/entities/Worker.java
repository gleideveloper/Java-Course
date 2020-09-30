package enum_composition.entities;

import enum_composition.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    /**
     * Association between Worker with Department and List<HourContract>
     */
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract hourContract){
        contracts.add(hourContract);
    }

    public void removeContract(HourContract hourContract){
        contracts.remove(hourContract);
    }

    public Double income(int year, int mounth){
        Double sum = baseSalary;
        Calendar calendar = Calendar.getInstance();
        for (HourContract c: contracts) {
            calendar.setTime(c.getDate());
            if (calendar.get(Calendar.YEAR) == year && (calendar.get(Calendar.MONTH) + 1) == mounth){
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
