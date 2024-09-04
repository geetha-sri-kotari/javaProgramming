import javax.swing.JOptionPane;
class Employee {
    int id, salary;
    String name;
    Employee() {
        name = JOptionPane.showInputDialog("enter your name: ");
        id = Integer.parseInt(JOptionPane.showInputDialog("enter your id: "));
        salary = Integer.parseInt(JOptionPane.showInputDialog("enter your salary: "));
        showDetails();
    }
    void showDetails() {
        String outputString = "ID: " + id + "\nname : " + name + "\nsalary : " + salary;
        JOptionPane.showMessageDialog(null, outputString);
    }
}
public class jOptionPane {
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.showDetails();      // calling show details function
        Employee e2 = new Employee();
                               // writing show details function in constructor
        
    }
    
}
