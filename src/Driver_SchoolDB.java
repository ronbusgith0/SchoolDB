//https://youtu.be/54niG7XuHFg

import java.util.*;
import java.io.*;


public class Driver_SchoolDB {


    public static void main(String[] args) {
        FileInputStream fileByteStream = null;
        Scanner inFS = null;
        try {
			fileByteStream = new FileInputStream("SchoolDB_Initial.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        inFS = new Scanner(fileByteStream);

        Course[] courses = new Course[100];
        int numCourses = 0;
        Student[] students = new Student[100];
        int numStudents = 0;
        GeneralStaff[] gStaff = new GeneralStaff[100];
        int numGStaff = 0;
        Faculty[] faculties = new Faculty[100];
        int numFaculty = 0;


        while (inFS.hasNextLine()) {
            String obj = inFS.next();
            if (obj.equals("Course:")) {
                String[] str = inFS.nextLine().split(",");
              
                if (str[0].equals(" false") || str[0].equals(" true")) {
                    Boolean objIsGraduate = str[0].equals(" true") ? true: false;
              
                    if (str.length > 1) {
                      
                        int objCourseNum = Integer.parseInt(str[1].replace(" ", ""));
                        String objCourseDept = str[2].replace(" ", "");
                        int objNumCredits = Integer.parseInt(str[3].replace(" ", ""));
                        Course course = new Course(objIsGraduate, objCourseNum, objCourseDept, objNumCredits);
                        courses[numCourses] = course;
                        numCourses++;
                    }
                    else {
                     
                        Course course = new Course(objIsGraduate, numFaculty, obj, numFaculty);
                        courses[numCourses] = course;
                        numCourses++;
                    }
                }
            }
            else if (obj.equals("Faculty:")) {
                String[] str = inFS.nextLine().split(",");

  
                if (str[0].equals(" true") || str[0].equals(" false")) {
                    if (str[0].equals(" true")) {
                        Faculty faculty = new Faculty(true);
                        faculties[numFaculty] = faculty;
                        numFaculty++;
                    }
                }
                  
                else if (str.length > 1) {
                  
                    if (str[1].replace(" ", "").equals("true") || str[1].replace(" ", "").equals("false")) {
                        String objDeptName = str[0];
                        Boolean objIsTenured;
                      objIsTenured = str[1].equals(" true") ? true: false;
                        Faculty faculty = new Faculty(objDeptName, objIsTenured);
                        faculties[numFaculty] = faculty;
                        numFaculty++;
                    }

                      
                    else {
                        String objName = str[0] ;
                        str[1] = str[1].replace(" ", "");
                        int objBirthYear = Integer.parseInt(str[1]);
                        String objDeptName = str[2].replace(" ", "");
                        Boolean objIsTenured;
                      objIsTenured = str[3].replace(" ", "").equals("true") ? true: false;
                        Faculty faculty = new Faculty(objName, objBirthYear, objDeptName, objIsTenured);
                        faculties[numFaculty] = faculty;
                        numFaculty++;
                    }
                }
                else {
                  
                    Faculty faculty = new Faculty();
                    faculties[numFaculty] = faculty;
                    numFaculty++;
                }
            } else if (obj.equals("GeneralStaff:")) {
           
                String[] str = inFS.nextLine().split(",");
              
                if (str.length == 0) {
                    GeneralStaff generalStaff = new GeneralStaff();
                    gStaff[numGStaff] = generalStaff;
                    numGStaff++;
                }
              
                if (str.length == 1) {
                    str[0] = str[0].trim();
                    GeneralStaff generalStaff = new GeneralStaff(str[0]);
                    gStaff[numGStaff] = generalStaff;
                    numGStaff++;
                }
             
                if (str.length == 2) {
                    GeneralStaff generalStaff = new GeneralStaff(str[0], str[1]);
                    gStaff[numGStaff] = generalStaff;
                    numGStaff++;
                }
              
            
                if (str.length == 4) {
                    GeneralStaff generalStaff = new GeneralStaff(str[0], Integer.parseInt(str[1].replace(" ", "")), str[2], str[3]);
                    gStaff[numGStaff] = generalStaff;
                    numGStaff++;
                }
            }
            else if (obj.equals("Student:")) {
                String[] str = inFS.nextLine().split(",");
              
              
                if (str[0].equals("true")) {
                    Student student = new Student(true);
                    students[numStudents] = student;
                    numStudents++;
                }
                if (str[0].equals("false")) {
                    Student student = new Student(false);
                    students[numStudents] = student;
                    numStudents++;
                }
                if (str.length > 1) {

                  
                    if (str[1].replace(" ", "").equals("true") ||  str[1].replace(" ", "").equals("false")) {
                    Boolean grad = (str[1].replace(" ", "").equals("true")) ? true: false;
                        Student student = new Student(str[0], grad);
                        students[numStudents] = student;
                        numStudents++;
                    }
                    else {
                      
                        String objName = str[0];
                        int objBirthYear = Integer.parseInt(str[1].replace(" ", ""));
                        Boolean objIsGraduate = (str[3].replace(" ", "").equals("true"))? true:false;
                        Student student = new Student(str[0], objBirthYear, str[2].replace(" ", ""), objIsGraduate);
                        students[numStudents] = student;
                        numStudents++;
                    }
                }
                else {
                 
                    Student student = new Student();
                    students[numStudents] = student;
                    numStudents++;
                }
            }


        }
        try (BufferedReader br = new BufferedReader(new FileReader("SchoolDB_Initial.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

      String course = "";
      String faculty= "";
      String generalStaff = "";
      String student = "";
      
        if (numCourses > 0) {
            
        	for (int i = 0; i < numCourses - 1; i++) {
                
        		course = course + courses[i].toString() + "\n";
            
        	}
        
        	course = course + courses[numCourses - 1].toString();
          
        }
      
        if (numFaculty > 0) {
            
        	for (int k = 0; k < numFaculty-1; k++) {
                
        		faculty = faculty + faculties[k].toString() + "\n";
            
        	}
       
        	faculty = faculty + faculties[numFaculty -1 ].toString();
    
        }
          
       
        if (numGStaff > 0) {
            
        	for (int j = 0; j < numGStaff - 1; j++) {
               
        		generalStaff = generalStaff + gStaff[j].toString() + "\n";
            
        	} 
        
        	generalStaff = generalStaff + gStaff[numGStaff - 1].toString();
         
        }
         
        if (numStudents > 0) {
            
        	for (int l = 0; l < numStudents - 1; l++) {
               
        		student = student + students[l].toString()+"\n";
            
        	}
          
        	student = student + students[numStudents-1].toString();
           
        }
           
      System.out.println("\n**************************************************************\nSCHOOL DATABASE INFO:\n\n************************************************\nCOURSES:");
      System.out.println(course);
      System.out.println("************************************************\n************************************************\nPERSONS:\n************************************************\n************************************************\nEMPLOYEES:\n************************************************\n************************************************\nGENERAL STAFF:");
      System.out.println(generalStaff); 
      System.out.println("************************************************\n************************************************\nFACULTY:");
      System.out.println(faculty);
      System.out.println("************************************************\n************************************************\nSTUDENTS:");   
      System.out.println(student);
      System.out.println("************************************************\n**************************************************************\n");
         
}
}
