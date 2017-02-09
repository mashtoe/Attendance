/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.automation.be;

/**
 *
 * @author Bruger
 */
public class Student
{
    private String name;
    
    private String schoolclass;
    
    private double attendance;
    
    private String email;
    
    private int phonenum;

    public Student(String name, String schoolclass, double attendance, String email, int phonenum)
    {
        this.name = name;
        this.schoolclass = schoolclass;
        this.attendance = attendance;
        this.email = email;
        this.phonenum = phonenum;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSchoolclass()
    {
        return schoolclass;
    }

    public void setSchoolclass(String schoolclass)
    {
        this.schoolclass = schoolclass;
    }

    public double getAttendance()
    {
        return attendance;
    }

    public void setAttendance(double attendance)
    {
        this.attendance = attendance;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public int getPhonenum()
    {
        return phonenum;
    }

    public void setPhonenum(int phonenum)
    {
        this.phonenum = phonenum;
    }
    
    
}
