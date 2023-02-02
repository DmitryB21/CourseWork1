import java.util.Objects;

public class Employee {

    private static int counter = 1;
    private final int id;

    private String fullName;
    private int department;
    private float salary;

    public Employee(String fullName, int department, float salary) {
        id = counter++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник:" +
                " id=" + id +
                ", ФИО = '" + fullName + '\'' +
                ", департамент = " + department +
                ", зарплата = " + salary;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && department == employee.department && Float.compare(employee.salary, salary) == 0 && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, department, salary);
    }
}
