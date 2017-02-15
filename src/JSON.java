
import java.io.File;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */
public class JSON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //prompt for information in order to store in JSON
        System.out.print("Enter Student name: ");
        
        String name= input.nextLine();
        
                
       //Create new JSON object 
        JSONObject root = new JSONObject();
        
        // put name into the name value
        root.put("name", name);
        
        //declare array
        JSONArray courses = new JSONArray();
        
        while(true) {
            
        // get course name    
        System.out.println("Enter course name: ");
        String course = input.nextLine();
        
        //check if entry is null
        if (course.length() == 0){
            break;
        }
        
        //get grade
        System.out.println("Enter grade: ");
        int grade = input.nextInt();
        
        if(input.hasNextLine()){
            input.nextLine();
        }
        
                // create a JSON object and array and store a class object into it
        JSONObject courseObject = new JSONObject();
        
        courseObject.put("grade", grade);
        courseObject.put("name", course);
        //add course to the arry
        courses.add(courseObject);
        }
        
        //add array to the root object
        root.put("courses", courses);
        
        System.out.println(root.toJSONString());
        
        File file = new File("StudentGrades.json");
        
    }
    
}
