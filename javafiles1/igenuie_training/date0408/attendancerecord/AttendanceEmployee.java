package date0408.attendancerecord;

import java.util.Arrays;

public class AttendanceEmployee extends Employee implements Markable {
private int[] attendanceArray = new int[7];
AttendanceEmployee(String name,int id,String department){
    super(name, id, department);
}
 public void markAttendance(int[] inputArray){
    for(int i = 0; i < 7; i++){
        attendanceArray[i] = inputArray[i];
    }
 }
 public int calculatePresentDays(int[] attendanceArray){
    int count =0;
    for(int i : attendanceArray){
        if(i == 1){
            count++;
        }
    }
    return count;
 }
 public void displayAttendance(){
System.out.println("Attendance:"+Arrays.toString(attendanceArray));  
System.out.println("total present days:"+calculatePresentDays(attendanceArray));
 }
}
