import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class appdriver {

	public static void main(String[] args) throws FileNotFoundException {
		final String fileName = "res/data.csv";
		
		ArrayList<ExcelData> theData = readData(fileName);
		
		int totalOrderAmount = 0;
		int totalItems = 0;
		
		for (int i = 0; i < theData.size(); i++)
		{
			totalOrderAmount += theData.get(i).getOrderAmount();
			totalItems += theData.get(i).getTotalItems();
			System.out.println(theData.get(i).getTotalItems());
		}
		
		System.out.println("Total order amount is: " + totalOrderAmount + "\n" + "Total items is: " + totalItems);
		
		double totalCalc = totalOrderAmount / totalItems;
		
		double testCalc = totalOrderAmount / theData.size();
		System.out.println("AOV " + totalCalc + " " + testCalc + " " + theData.size());
		

	}

	
	
	public static ArrayList<ExcelData> readData(String filename) throws FileNotFoundException
	{
		
		ArrayList<ExcelData> dataArray = new ArrayList<ExcelData>();
		
		int orderid = 0;
		int shopid = 0;
		int userid = 0;
		int orderAmount = 0;
		int totalItems = 0;
		String payment = "";
		String createdAt = "";
		
		Scanner inFile = new Scanner(new File(filename));
		inFile.nextLine();
		while (inFile.hasNext()) {
			// Creates String named line.
			String line = inFile.nextLine();
			// Makes an array of line parts and creates delimiter ","
			String[] lineParts = line.split(",");
			orderid = Integer.parseInt(lineParts[0]);
			shopid = Integer.parseInt(lineParts[1]);
			userid = Integer.parseInt(lineParts[2]);
			orderAmount = Integer.parseInt(lineParts[3]);
			totalItems = Integer.parseInt(lineParts[4]);
			payment = lineParts[5];
			createdAt = lineParts[6];
			
			ExcelData dataInfo = new ExcelData(orderid, shopid, userid, orderAmount, totalItems, payment, createdAt); 
			dataArray.add(dataInfo);
			}

		

		inFile.close();
		
		return dataArray;
	}
}
