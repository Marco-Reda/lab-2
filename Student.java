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
public class Student extends Person
{
    Student(String name) 
    {
        super(name);
    }
    enum Status
    {
        freshman, sophomore, junior, senior
    }
    Status classStatus;
    @Override
    public String toString() 
    {
        return "Student " + name;
    }
}
