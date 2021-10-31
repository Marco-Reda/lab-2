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
public class Staff extends Employee
{
    Staff(String name) 
    {
        super(name);
    }
    String title;
    @Override
    public String toString() 
    {
        return "Staff " + name;
    }
}
