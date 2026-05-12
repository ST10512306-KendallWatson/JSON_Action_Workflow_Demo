
package com.mycompany.json_action_demo;

import java.util.Scanner;
import org.json.JSONObject; //JSON dependancy has to be in pom.xml fle 
public class JSON_Action_Demo {

    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        //create a JSON object from the JSONObject class dependancy 
        JSONObject person = new JSONObject();
        
        System.out.println("====User Registration System====");
        //Validate name
        String name;
        while(true){
            
            System.out.println("Enter Name:");
            name = scanner.nextLine().trim();
            if(!name.isEmpty())
            {
                break;
            }
            System.out.println("Name cannot be empty");
        }
        
        //Vaildate Age 
        int age;
        while(true){
            System.out.println("Enter age:");
            if(scanner.hasNextInt())
            {
                age = scanner.nextInt();
                if(age>0 && age<99)
                {
                    
            }
        }
    }
}
