public class Main {
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Синицын Вадим Геннадьевич", 1, 45000);
        employees[1] = new Employee("Степанов Кирилл Сергеевич", 2, 81000);
        employees[2] = new Employee("Семёнов Алексей Владимирович", 3, 61000);
        employees[3] = new Employee("Соловьёв Дмитрий Олегович", 1, 73000);
        employees[4] = new Employee("Симонов Владислав Петрович", 5, 90000);
        employees[5] = new Employee("Сычов Андрей Андреевич", 4, 58000);
        employees[6] = new Employee("Синегузов Виктор Павлович", 2, 41000);
        employees[7] = new Employee("Савельев Илья Ларионович", 3, 50000);
        employees[8] = new Employee("Смирнов Василий Романович", 5, 70000);
        employees[9] = new Employee("Серёгин Александр Игоревич", 4, 33000);

        printAllEmployees();
        System.out.println("Сумма затрат на зарплаты в месяц: " + getTotalSalary());
        System.out.println("Минимальная зарплата у: " + getMinSalaryEmployee());
        System.out.println("Максимальная зарплата у: " + getMaxSalaryEmployee());
        System.out.println("Средняя зарплата: " + getAverageSalary());
        System.out.println("ФИО всех сотрудников:");
        printAllFullNames();
    }
    public static void printAllEmployees() {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
    }
        public static double getTotalSalary() {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }
    public static Employee getMinSalaryEmployee() {
        if (employees.length == 0) return null;
        Employee minEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < minEmployee.getSalary()) {
                minEmployee = employee;
            }
        }
        return minEmployee;
    }
    public static Employee getMaxSalaryEmployee() {
        if (employees.length == 0) return null;
        Employee maxEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > maxEmployee.getSalary()) {
                maxEmployee = employee;
            }
        }
        return maxEmployee;
    }
    public static double getAverageSalary() {
        return getTotalSalary() / employees.length;
    }
    public static void printAllFullNames() {
            for (Employee employee : employees) {
                System.out.println(employee.getFullName());
            }
        }
    }