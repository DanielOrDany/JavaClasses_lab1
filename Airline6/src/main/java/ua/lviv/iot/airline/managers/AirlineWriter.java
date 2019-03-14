package ua.lviv.iot.airline.managers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import ua.lviv.iot.airline.models.Airplane;

public class AirlineWriter {
	
	public static void writeToFile(List<Airplane> listOfAirplanes) {
		try (PrintWriter writer = new PrintWriter(
				new File("D:\\Java\\Eclipse\\projects_java_eclipse\\Airline6\\airplanes.csv"))) {
			
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < listOfAirplanes.size(); i++) {
				Airplane element = listOfAirplanes.get(i);
				sb.append(element.getHeaders());
				sb.append("\n");
			    sb.append(element.toCSV());
			    sb.append("\n-------------------------------------------------------------------------\n");
			}
			
			writer.write(sb.toString());

			System.out.println("done!");

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
