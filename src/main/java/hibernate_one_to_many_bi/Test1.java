package hibernate_one_to_many_bi;


import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            session = factory.getCurrentSession();
//            Department dep = new Department("Sales", 800, 1500);
//            Employee emp1 = new Employee("Artem", "Hrybanov", 800);
//            Employee emp2 = new Employee("Oleg", "Pytsko", 1000);
//            Employee emp3 = new Employee("Anton", "Petruk", 1500);
//
//            dep.addEmpoyeeToDepartment(emp1);
//            dep.addEmpoyeeToDepartment(emp2);
//            dep.addEmpoyeeToDepartment(emp3);
//
//            session.beginTransaction();
//            session.save(dep);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

// ******************************************************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 4);
//
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

// ******************************************************************************
            session = factory.getCurrentSession();

            session.beginTransaction();

            System.out.println("Get department");
            Department department = session.get(Department.class, 4);

            System.out.println("Show department");
            System.out.println(department);
            System.out.println("Show empoloyees of department");
            System.out.println(department.getEmps());

            session.getTransaction().commit();
            System.out.println("Done!");

// ******************************************************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 4);
//
//            session.delete(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");


        } finally {
            session.close();
            factory.close();
        }
    }
}
