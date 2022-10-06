package Day_35_Encapsulation;

public class Employee {
      private  String name;
      private double salary;
      public String lastName;

      public String getName(){
            return name;
      }

      public String getLastName(){
            return lastName;
      }

      public void setName( String name ){
            this.name = name;
      }

      public void setLastName( String  lastName ){
            this.lastName = lastName;
      }

      public double getSalary (){
            return salary;
      }

      public void setSalary( double salary ){
            this.salary = salary;
      }

      public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    ", lastName='" + lastName + '\'' +
                    '}';
      }

      public void setGender(char m) {
      }
}
