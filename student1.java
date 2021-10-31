/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication50;

/**
 *
 * @author Marco
 */
public class student1 
{
    private int studentId;
    private String studentName, studentAddress, collegeName;
    
    public student1(int studentId, String studentName, String studentAddress)
    {
        this.studentAddress=studentAddress;
        this.studentName=studentName;
        this.studentId=studentId;
        this.collegeName="FCI";
    }
    
    public student1(int studentId, String studentName, String studentAddress, String collegeName)
    {
        this(studentId, studentName, studentAddress);//invoking a constructor
        this.collegeName=collegeName;
    }
    
    public int getStudentId()
    {
        return this.studentId;
    }
    
    public String getStudentName()
    {
        return this.studentName;
    }
    
    public String getStudentAddress()
    {
        return this.studentAddress;
    }
    
    public String getCollegeName()
    {
        return this.collegeName;
    }
}
