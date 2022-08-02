package parallel;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import pageObjects.Employee;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DataTableExamples {
    @Given("the following datatable and convert to list")
    public void the_following_datatable_and_convert_to_list(DataTable dataTable) {
        System.out.println("Is DataTable empty? " + dataTable.isEmpty());
        // raw(): Returns a List of List of String.
        /*List<List<String>> data = dataTable.raw();
        System.out.println(data.get(1).get(1));
        System.out.println(data);*/
    }

    @Given("the following datatable and convert to map")
    public void the_following_datatable_and_convert_to_map(DataTable dataTable) {
        List<Map<String, String>> mapList = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> map : mapList) {
            System.out.println(map.get("name") + " | " + map.get("position") + " | " + map.get("office"));
        }
    }

    @Given("the following datatable and convert to pojo with DataTableTypeAnnotation")
    public void the_following_datatable_and_convert_to_pojo_DataTableType_Annotation(List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            System.out.println(employee.getName() + " | " + employee.getPosition() + " | " + employee.getPosition());
        }
    }

    @DataTableType
    public Employee emloyeeEntry(Map<String, String> entry) {
        return new Employee(entry.get("name"), entry.get("position"), entry.get("office"));
    }


    @Given("the following datatable and convert to pojo")
    public void the_following_datatable_and_convert_to_pojo1(List<Employee> employeeList) {
        //public void the_following_datatable_and_convert_to_pojo(DataTable dataTable) {
        //List<Employee> employeeList = dataTable.asList(Employee.class);
        for (Employee employee : employeeList) {
            System.out.println(employee.getName() + " | " + employee.getPosition() + " | " + employee.getPosition());
        }
    }
}
