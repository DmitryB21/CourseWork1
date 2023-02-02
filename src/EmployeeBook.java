import java.text.DecimalFormat;


public class EmployeeBook {

    private Employee[] employees = new Employee[10];

    private int size = 0; //для подсчета занятых ячеек




    //  Базовые методы  ------------------------------------------------------------

    //Получить список всех сотрудников со всеми данными
    public void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    //Сумма затрат на все зарплаты в месяц
    public void countTotalSalaryPerMonth() {
        float sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum = sum + employee.getSalary();
            }
        }
        System.out.println("Общие затраты компании на все зарплаты в месяц составляют " + sum);
    }

    //Найти сотрудника с минимальной зарплатой в компании
    public void findMinSalaryEmployee() {
        String name = "";
        float min = 100000000;
          for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                name = employee.getFullName();
            }
        }
        System.out.println("Минимальная зарплата в компании - у сотрудника " + name + " и составляет " + min);
    }

    //Найти сотрудника с максимальной зарплатой в компании
    public void findMaxSalaryEmployee() {

        String name = "";
        float max = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                name = employee.getFullName();
            }
        }
        System.out.println("Максимальная зарплата в компании - у сотрудника " + name + " и составляет " + max);
    }

    //Подсчитать среднюю зарплату в компании в месяц
    public void countMiddleSalaryPerMonth() {
        int count = 0;
        float sun = 0;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        for (Employee employee : employees) {
            if (employee != null) {
                sun = sun + employee.getSalary();
                count++;
            }
        }
        System.out.println("Средняя зарплата в компании в месяц составляет " + decimalFormat.format ( sun / count));
    }

    //Получить список с ФИО всех сотрудников
    public void printListEmployeesFullName() {
        System.out.println("Список сотрудников:");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println("ФИО: " + employee.getFullName());
            }
        }
    }

    // Сложные методы ---------------------------------------------------------------------------

    //Найти сотрудника с минимальной зарплатой в отделе
    public void findMinSalaryEmployeeDepartment(int numberDepartment) {
        String name = "";
        float min = 10000000;
         for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == numberDepartment) {
                if (employee.getSalary() < min) {
                    min = employee.getSalary();
                    name = employee.getFullName();
                }
            }
        }
        System.out.println("Минимальная зарплата  в отделе " + numberDepartment + " - у сотрудника " + name + " и составляет " + min);
    }

    //Найти сотрудника с максимальной зарплатой в отделе
    public void findMaxSalaryEmployeeDepartment(int numberDepartment) {
        String name = "";
        float max = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == numberDepartment) {
                if (employee.getSalary() > max) {
                    max = employee.getSalary();
                    name = employee.getFullName();
                }
            }
        }
        System.out.println("Максимальная зарплата  в отделе " + numberDepartment + " - у сотрудника " + name + " и составляет " + max);
    }

    //Сумма всех зарплат в отделе за месяц
    public void countTotalSalaryPerMonthDepartment(int numberDepartment) {
        float sum = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == numberDepartment) {
                sum = sum + employee.getSalary();
            }
        }
        System.out.println("В отделе " + numberDepartment + " затраты на все зарплаты в месяц составляют " + sum);
    }

    //Средняя зарплата в отделе в месяц
    public void countMiddleSalaryPerMonthDepartment(int numberDepartment) {
        int count = 0;
        float sum = 0;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == numberDepartment) {
                sum = sum + employee.getSalary();
                count++;
            }
        }
        System.out.println("В отделе " + numberDepartment + " средняя зарплата в месяц составляет " + decimalFormat.format(sum / count));
    }

    //Проиндексировать зарплату всех сотрудников отдела на заданный процент
    public void IndexSalaryDepartment(int numberDepartment, float index) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == numberDepartment) {
                float premiumFactor = (index + 100) / 100;
                employee.setSalary(employee.getSalary() * premiumFactor);
            }
        }
        System.out.println("Зарплата сотрудников в отделе " + numberDepartment + " проиндексирована на " + index + " процентов");
    }

    // Получить список всех сотрудников отдела (все данные кроме отдела)
    public void printListEmployeesDepartment(int numberDepartment) {
        System.out.println("Список сотрудников отдела " + numberDepartment);
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == numberDepartment) {
                System.out.println("id = " + employee.getId() + ", ФИО сотрудника: " + employee.getFullName() +
                        ", зарплата: " + employee.getSalary());
            }
        }
    }

    //Получить список сотрудников с зарплатой меньше заданного числа
    public void printListEmployeesSalaryLessNumber(int salaryLevel) {
        System.out.println("Список сотрудников отдела c зарплатой меньше " + salaryLevel);
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salaryLevel) {
                System.out.println("id = " + employee.getId() + ", ФИО сотрудника: " + employee.getFullName()  +
                        ", зарплата: " + employee.getSalary());
            }
        }
    }

    //Получить список сотрудников с зарплатой больше заданного числа
    public void printListEmployeesSalaryMoreNumber(int salaryLevel) {
        System.out.println("Список сотрудников c зарплатой больше " + salaryLevel);
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= salaryLevel) {
                System.out.println("id = " + employee.getId() + ", ФИО сотрудника: " + employee.getFullName()  +
                        ", зарплата: " + employee.getSalary());
            }
        }
    }

    // Очень сложные методы ----------------------------------------------------------------------------

    //Добавить нового сотрудника в массив
    public void addEmployee(String fullName, int department, float salary) {
        if (employees.length <= size) {
            System.out.println("Нельзя добавить сотрудника, закончилось место ");
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                Employee employee = new Employee(fullName, department, salary);
                employees[i] = employee;
                size++;
                System.out.println("Сотрудник ФИО = " + employee.getFullName() + " добавлен в массив в ячейку " + i);
                break;
            }
        }
    }

    //Найти сотрудника по ФИО и удалить его из массива
    public void removeEmployeeByName(String fullName) {

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getFullName().equals( fullName)) {
                System.out.println("Сотрудник с ФИО = " + employees[i].getFullName() + " удален из ячейки массива " + i);
                employees[i] = null;
                size--;
                return;
            }
        }
        System.out.println("Сотрудник с таким ФИО не найден");
    }

    //Найти сотрудника по id и удалить его из массива
    public void removeEmployeeById(int id) {

        for ( int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                size--;
                System.out.println("Сотрудник id = " + id + " удален из ячейки " + i);
                break;
            }
        }
    }

    //Найти сотрудника по ФИО изменить его зарплату и отдел
    public void changeDataEmployee(String fullName, int newDepartment, float newSalary) {

        for (Employee employee : employees) {
            if (employee != null && employee.getFullName().equals(fullName)) {
                employee.setDepartment(newDepartment);
                employee.setSalary(newSalary);
                System.out.println("Сотрудни ФИО = " + fullName + " переведен в отдел " + employee.getDepartment() +
                        " его новая зарплата составляет " + employee.getSalary());
                break;
            }
        }
    }

    //Получить список всех сотрудников по отделам
    public void printListEmployeesPerDepartment() {

        int department1 = 1;
        int department2 = 2;
        int department3 = 3;
        int department4 = 4;
        int department5 = 5;

        System.out.println("Список сотрудников отдела 1:");
        for (Employee value : employees) {
            if (value != null && value.getDepartment() == department1) {
                System.out.println(value.getFullName());
            }
        }
        System.out.println("Список сотрудников отдела 2:");
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department2) {
                System.out.println(employee.getFullName());
            }
        }

        System.out.println("Список сотрудников отдела 3:");
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department3) {
                System.out.println(employee.getFullName());
            }
        }

        System.out.println("Список сотрудников отдела 4:");
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department4) {
                System.out.println(employee.getFullName());
            }
        }

        System.out.println("Список сотрудников отдела 5:");
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department5) {
                System.out.println(employee.getFullName());
            }
        }


    }









}
