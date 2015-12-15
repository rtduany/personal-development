//write a program that validates car license plate user input. The //plates are made of 3 letters (case-insensitive); an optional white //space; and 1 letter (case-insensitive). Use regex for validation

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinRegex {
	private String pin;
	Pattern p = Pattern.compile("^[A-Z]{3}|[a-z]{3}\s*[1-9]\d{2}[a-zA-Z]{1}$");

	//define a validate_Pin method that takes 1 string parameter
	public void validate_Pin(String pin){
		this.pin = pin;
		// Now create matcher object.
		Matcher m = p.matcher(pin);
		if (m.find()){
			System.out.println("The license plate matches!")
		}else {
			System.out.println("Wrong format!")
		}
	}
}
