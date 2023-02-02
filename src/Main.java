public class Main {
    public static void main(String[] args) {

        // создаем книгу учета
        EmployeeBook employeeBook = new EmployeeBook();

        // добавление сотрудников в массив
        employeeBook.addEmployee("Фамилия1 Имя1 Отчество1", 1 , 100_000);
        employeeBook.addEmployee("Фамилия2 Имя2 Отчество2", 1 , 110_000);
        employeeBook.addEmployee("Фамилия3 Имя3 Отчество3", 2 , 50_000);
        employeeBook.addEmployee("Фамилия4 Имя4 Отчество4", 2 , 80_000 );
        employeeBook.addEmployee("Фамилия5 Имя5 Отчество5", 3 , 130_000 );
        employeeBook.addEmployee("Фамилия6 Имя6 Отчество6", 3 , 150_000);

        employeeBook.printAllEmployees(); //Получить список всех сотрудников со всеми данными
        System.out.println();

        // базовые методы ---------------------------------------------------------------------------------

        employeeBook.countTotalSalaryPerMonth(); //Сумма затрат на все зарплаты в месяц
        employeeBook.findMinSalaryEmployee(); //Найти сотрудника с минимальной зарплатой в компании
        employeeBook.findMaxSalaryEmployee(); //Найти сотрудника с максимальной зарплатой в компании
        employeeBook.countMiddleSalaryPerMonth(); //Подсчитать среднюю зарплату в компании в месяц
        employeeBook.printListEmployeesFullName(); //Получить список с ФИО всех сотрудников
        System.out.println();

        // сложные медоды ---------------------------------------------------------------------------------

        employeeBook.findMinSalaryEmployeeDepartment(1); //Найти сотрудника с минимальной зарплатой в отделе
        employeeBook.findMinSalaryEmployeeDepartment(2); //Найти сотрудника с минимальной зарплатой в отделе
        employeeBook.findMinSalaryEmployeeDepartment(3); //Найти сотрудника с минимальной зарплатой в отделе
        employeeBook.findMaxSalaryEmployeeDepartment(1); //Найти сотрудника с максимальной зарплатой в отделе
        employeeBook.findMaxSalaryEmployeeDepartment(2); //Найти сотрудника с максимальной зарплатой в отделе
        employeeBook.findMaxSalaryEmployeeDepartment(3); //Найти сотрудника с максимальной зарплатой в отделе
        employeeBook.countTotalSalaryPerMonthDepartment(1); //Сумма всех зарплат в отделе за месяц
        employeeBook.countTotalSalaryPerMonthDepartment(2); //Сумма всех зарплат в отделе за месяц
        employeeBook.countTotalSalaryPerMonthDepartment(3); //Сумма всех зарплат в отделе за месяц
        employeeBook.countMiddleSalaryPerMonthDepartment(1); //Средняя зарплата в отделе в месяц
        employeeBook.countMiddleSalaryPerMonthDepartment(2); //Средняя зарплата в отделе в месяц
        employeeBook.countMiddleSalaryPerMonthDepartment(3); //Средняя зарплата в отделе в месяц
        employeeBook.IndexSalaryDepartment(1, 5); //Проиндексировать зарплату всех сотрудников отдела на заданный процент
        employeeBook.IndexSalaryDepartment(2, 10); //Проиндексировать зарплату всех сотрудников отдела на заданный процент
        employeeBook.IndexSalaryDepartment(3, 1); //Проиндексировать зарплату всех сотрудников отдела на заданный процент
        employeeBook.printListEmployeesDepartment(1); // Получить список всех сотрудников отдела (все данные кроме отдела)
        employeeBook.printListEmployeesDepartment(2); // Получить список всех сотрудников отдела (все данные кроме отдела)
        employeeBook.printListEmployeesDepartment(3); // Получить список всех сотрудников отдела (все данные кроме отдела)
        employeeBook.printListEmployeesSalaryLessNumber(100000);  //Получить список сотрудников с зарплатой меньше заданного числа
        employeeBook.printListEmployeesSalaryMoreNumber(100000);  //Получить список сотрудников с зарплатой больше заданного числа
        System.out.println();

        // очень сложные методы ----------------------------------------------------------------------------------------------

        employeeBook.removeEmployeeByName("Фамилия1 Имя1 Отчество1"); //Найти сотрудника по ФИО и удалить его из массива
        employeeBook.removeEmployeeById(3); //Найти сотрудника по id и удалить его из массива
        employeeBook.addEmployee("Фамилия7 Имя7 Отчество7", 5 , 200_000); //добавить нового сотрудника
        employeeBook.addEmployee("Фамилия8 Имя8 Отчество8", 4 , 300_000 ); //добавить нового сотрудника

        employeeBook.changeDataEmployee("Фамилия7 Имя7 Отчество7", 4, 199000); //Найти сотрудника по ФИО изменить его зарплату и отдел
        employeeBook.printListEmployeesPerDepartment(); //Получить список всех сотрудников по отделам
        System.out.println();

        employeeBook.printAllEmployees(); //Получить список всех сотрудников со всеми данными

    }
}