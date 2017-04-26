package main;

import javax.json.JsonException;

public class JSONMain2 {

	public static final String JSON_FILE_NAME = "plik.json";
	
	public static void main(String[] args) throws JsonException{
		
		RESTMain2 restMain2 = new RESTMain2();
		System.out.println("WYNIK2" + restMain2.dajJsona());
		
		
		
		
	}

}
