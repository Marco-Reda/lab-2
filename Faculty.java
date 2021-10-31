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
public class Faculty extends Employee 
{
    Faculty(String name) 
    {
        super(name);
    }
    String officeHours, rank;
    @Override
    public String toString() 
    {
        return "Faculty " + name;
    }    
}
