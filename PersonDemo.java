public class PersonDemo {
    public static void main(String args[]) {
        Person person = new Person("Stella Chimbende"), student = new Student("Consider Lonjezo"),
                employee = new Employee("Emmie Banda"), faculty = new Faculty("Law"),
                staff = new Staff("Esther Phiri"), people[] = { person, student, employee, faculty, staff };
        for (Person p : people)
            System.out.println(p);
    }

    static class Person {
        String name, address, phoneNumber, email;

        Person(String n) {
            name = n;
        }

        //Override attempt
        public String toString() {
            return "Person " + name;
        }
    }

    static class Student extends Person {
        Student(String n) {
            super(n);
        }

        enum Status {
            freshman, sophomore, junior, senior
        }

        Status classStatus;

        @Override
        public String toString() {
            return "Student " + name;
        }

    }

    static class Employee extends Person {
        Employee(String n) {
            super(n);
        }

        String office, hireDate;
        double salary;

        @Override
        public String toString() {
            return "Employee " + name;
        }
    }

    static class Faculty extends Employee {
        Faculty(String n) {
            super(n);
        }

        String officeHours, rank;

        @Override
        public String toString() {
            return "Faculty " + name;
        }
    }

    static class Staff extends Employee {
        Staff(String n) {
            super(n);
        }

        String title;

        @Override
        public String toString() {
            return "Staff " + name;
        }
    }
}
