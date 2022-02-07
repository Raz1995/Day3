package Day5;

class Employee {
    int id, age;
    String name, department;
    char gender;

    //constructor
    public Employee(int id, int age, String name, String department, char gender) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.department = department;
        this.gender = gender;
    }

    public static void employee(Employee ourNewEmployee) {
        System.out.println(ourNewEmployee.id + " " + ourNewEmployee.age + " " + ourNewEmployee.name + " " + ourNewEmployee.department + " " + ourNewEmployee.gender);

    }

    public static void main(String[] args) {
        Employee newEmployee1 = new Employee(5156, 25, "Raz", " marketing", 'M');
        Employee newEmployee2 = new Employee(5157, 35, "Gegham", " UX", 'M');
        Employee newEmployee3 = new Employee(5158, 45, "Tigran", " marketing", 'M');
        Employee newEmployee4 = new Employee(5159, 39, "Gegecik", " marketing", 'W');
        Employee newEmployee5 = new Employee(5160, 23, "Narine", " Design", 'W');


        employee(newEmployee1);
        employee(newEmployee2);
        employee(newEmployee3);
        employee(newEmployee4);
        employee(newEmployee5);
    }

}