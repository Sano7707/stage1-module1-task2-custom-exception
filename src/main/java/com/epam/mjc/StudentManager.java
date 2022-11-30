package com.epam.mjc;


import java.util.Arrays;

public class StudentManager {

  private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

  public Student find(long studentID)throws StudentNotFoundException {
    for (int i = 0; i < IDs.length; i++) {
      if(Arrays.binarySearch(IDs,studentID) >= 0){
        System.out.println("aaaaa");
      }
      else {
        throw new StudentNotFoundException("Could not find student with ID " + studentID);
      }

    }
    return Student.getValueOf(studentID);
  }

  public static void main(String[] args) {
    StudentManager manager = new StudentManager();

    for (long id : IDs) {
      Student student = manager.find(id);
      System.out.println("Student name " + student.getName());
    }

  }
}