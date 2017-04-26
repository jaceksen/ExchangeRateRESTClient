package main;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.StatusType;

/**
 * Calls the RESTful web service at REST_URL defined below.
 * 
 * @author jsen
 *
 */
public class RESTMain2 {

	public static final String REST_URL = "https://currency-api.appspot.com/api/EUR/PLN.json";
	public static final int OK_STATUS = Response.Status.OK.getStatusCode();

	private String wynik;

	public String getWynik() {
		return wynik;
	}

	public void setWynik(String wynik) {
		this.wynik = wynik;
	}

	public String dajJsona() {
		
		// call the service and get the response object
		Response response = ClientBuilder.newClient().target(REST_URL).request(MediaType.APPLICATION_JSON).get();

		// process the response object
		StatusType status = response.getStatusInfo();
		int statusCode = status.getStatusCode();
		if (statusCode == OK_STATUS) {
			// System.out.println(response.readEntity(String.class));
			String wynik1;
			wynik1 = response.readEntity(String.class);
			//RESTMain2 restMain2 = new RESTMain2();
			//restMain2.setWynik(response.readEntity(String.class));
			//System.out.println("WYNIK" + restMain2.getWynik());
			return wynik1;
		} else {
			return null;
		}
	}

	public static void main(String[] args) {

		// call the service and get the response object
		Response response = ClientBuilder.newClient().target(REST_URL).request(MediaType.APPLICATION_JSON).get();

		// process the response object
		StatusType status = response.getStatusInfo();
		int statusCode = status.getStatusCode();
		if (statusCode == OK_STATUS) {
			// System.out.println(response.readEntity(String.class));
			RESTMain2 restMain2 = new RESTMain2();
			restMain2.setWynik(response.readEntity(String.class));
			System.out.println("WYNIK" + restMain2.getWynik());

		} else {
			System.out.printf("Service returned status \"%d %s\"\n", statusCode, status.getReasonPhrase());
		}

	}

}
