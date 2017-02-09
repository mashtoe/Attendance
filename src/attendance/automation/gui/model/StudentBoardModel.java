/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.automation.gui.model;

import attendance.automation.be.Student;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Stefan-VpcEB3J1E
 */
public class StudentBoardModel
{
    private Student student;
    private StringProperty attendance;

    public StudentBoardModel(Student student)
    {
        this.student = student;
        attendance = new SimpleStringProperty();
      //  attendance.set(student.getAttendance());
        
    }
    
}
