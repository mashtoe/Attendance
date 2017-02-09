/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.automation.dal;

/**
 *
 * @author Bruger
 */
public class AttendanceDAO
{
    int[][] schedule = new int[5][8];
    
    public int[][] getSchedule(String... fag)
    {
        for (int i = 0; i < 7; i++)
        {
            int[] day = new int[8];
            
            for (int j = 0; j < day.length; j++)
            {
                
            }
            
        }
        return schedule;
    }
     
}
