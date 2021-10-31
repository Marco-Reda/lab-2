/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication49;

/**
 *
 * @author Marco
 */
public class Employee extends Person
{
    Employee(String name) 
    {
        super(name);
    }

    String office, hireDate;
    double salary;
    @Override
    public String toString() 
    {
        return "Employee " + name;
    }
}
