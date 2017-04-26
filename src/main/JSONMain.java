package main;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.json.Json;
import javax.json.stream.JsonParser;

public class JSONMain {

	public static final String JSON_FILE_NAME = "plik.json";
	
	public static void main(String[] args) throws FileNotFoundException {
		
		JsonParser parser = Json.createParser(new FileReader(JSON_FILE_NAME));
		
			while(parser.hasNext()){
				JsonParser.Event event = parser.next();
				
				if(event.equals(JsonParser.Event.KEY_NAME)){
					String KEY_NAME = parser.getString();
					parser.next();
					String VALUE_STRING = parser.getString();
					System.out.printf(">> %s: %s\n", KEY_NAME, VALUE_STRING);
				} //koniec if
			} //koniec while
		
	}

}
