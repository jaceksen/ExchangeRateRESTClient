package main;

import java.io.FileReader;

import javax.json.Json;
import javax.json.JsonException;
import javax.json.JsonObject;
import javax.json.stream.JsonParser;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONMain2 {

	public static void main(String[] args) throws JsonException{
		
		RESTMain2 restMain2 = new RESTMain2();
		//System.out.println("WYNIK2" + restMain2.dajJsona());
		
		JSONObject obj = new JSONObject(restMain2.dajJsona());
		Double kurs = obj.getDouble("amount");
		System.out.println("Kurs EUR/PLN: " + kurs);
		
		JSONObject obj2 = new JSONObject(restMain2.dajJsona2());
		Double kurs2 = obj2.getDouble("amount");
		System.out.println("Kurs USD/PLN: " + kurs2);
		
		
	}

}
