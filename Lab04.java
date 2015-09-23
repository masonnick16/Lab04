
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
/**
 *
 * @author Nick
 */
public class Lab04 {
    
    public static double computeMean(Scanner inFile){
        double sum=0;
        int count=0;
        while(inFile.hasNext()){
            double num=inFile.nextDouble();
            sum+=num;
            count++;
        }
        return (sum/count);
        
    }
    public static double computeStandardDeviation(Scanner inFile, double mean){
        mean= computeMean(inFile);
        int count=0;
        int sum=0;
        while(inFile.hasNextDouble()){
            sum+=Math.pow(inFile.nextDouble()-mean, 2);
            count++;
        }
        return (Math.sqrt(sum/count));
    }        

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        Scanner inFile = new Scanner(new FileReader("input.txt"));
        System.out.print("Input: ");
        while(inFile.hasNext()){
            int input=inFile.nextInt();
            System.out.print(input+" ");
        }
        System.out.println(" ");
        System.out.printf("Mean: %,.2f%n",computeMean(inFile));
        System.out.printf("StdDev: %,.2f%n", computeStandardDeviation(inFile, computeMean(inFile)));

    }
    
}
