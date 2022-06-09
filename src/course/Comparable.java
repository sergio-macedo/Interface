package course;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Comparable {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        String path = "C:\\dev\\Java\\in.txt";


        try (BufferedReader br = new BufferedReader(new FileReader(path))) { //try with resources.
            String employeeCsv = br.readLine();
            while (employeeCsv != null) {
                String[] fields = employeeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }
            Collections.sort(list);
            for (Employee emp : list) {
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("type the right type of string" + e.getMessage());
        }


    }
}
