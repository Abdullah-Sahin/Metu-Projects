import java.util.Scanner;
/**
 * Main class for applicaiton (Assignment 4)
 */
public class Driver
{
    /**
     * Main method that runs all application
     */
    public static void main(String[] params)
    {
        int question;
        while(true)
        {
            java.lang.Object System;
            java.lang.System.out.println("Press 1 for Question1");
            java.lang.System.out.println("Press 2 for Question2");
            java.lang.System.out.println("Press 3 for Question3");
            java.lang.System.out.println("Press 0 for exit. \n ");
            Scanner scan = new Scanner(java.lang.System.in);
            question = scan.nextInt();
            scan.nextLine();
            if(question == 0)
                break;
            switch(question){

                case 1:{
                    Person person = new Person("Ali");
                    java.lang.System.out.println(person.toString());
                    Employee employee = new Employee("Ali",8000);
                    java.lang.System.out.println(employee.toString());
                    Manager manager = new Manager("Mahmut",18000,"Finance");
                    java.lang.System.out.println(manager.toString());
                    Executive executive = new Executive("Huma",28000,"ProductSupply","Agean01");
                    java.lang.System.out.println(executive.toString());
                    break;
                }
                case 2:{
                    String answer;
                    java.lang.System.out.println("Do you want to add a person?(Y/N)");
                    answer=scan.nextLine();
                    int count=0;
                    Person minP = null, maxP = null;
                    try{
                        while(answer.toUpperCase().equals("Y")){
                            count += 1;
                            java.lang.System.out.println("Enter the name of the person!");
                            String name = scan.nextLine();
                            Person person = new Person(name);
                            if(count==1){
                                minP=person;
                                maxP=person;
                            }
                            else{
                                if(person.compareTo(minP)<0){
                                    minP = person;
                                }
                                if(person.compareTo(maxP)>=0){
                                    maxP = person;
                                }
                            }
                            java.lang.System.out.println("Do you want to add a person?(Y/N)");
                            answer=scan.nextLine();
                        }
                    }
                    catch(Exception e){
                        java.lang.System.out.println("**Invalid Input**");
                    }

                    java.lang.System.out.println("Firstname: " + minP.getName() + "\n");
                    java.lang.System.out.println("Lastname: " + maxP.getName() + "\n");
                    break;
                }
                case 3:{
                    Population population = new Population();
                    java.lang.System.out.println("Do you want to add a person?(Y/N)");
                    String answer = scan.nextLine();
                    int count = 0;
                    while(answer.toUpperCase().equals("Y")){
                        count += 1;
                        java.lang.System.out.println("Enter the name of the person!");
                        String name = scan.nextLine();
                        Person person = new Person(name);
                        population.addPerson(person);
                        java.lang.System.out.println("Do you want to add a person?(Y/N)");
                        answer = scan.nextLine();
                        if(count >= 2){
                            population.sortByName();
                        }
                    }
                    PopulationViewer pv = new PopulationViewer();
                    pv.viewNames(population);
                }
            }
        }
    }
}