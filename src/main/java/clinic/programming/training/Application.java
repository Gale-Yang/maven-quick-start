package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {
	
	public int countWords(String words) {
		String[] separatedWords = StringUtils.split(words,' ');
		return (separatedWords == null) ? 0 : separatedWords.length;
	}
	
	public void greet() {
			List<String> greetings = new ArrayList<>();
			greetings.add("Hello");
			greetings.add("Good Morning");
			greetings.add("Have a nice Day");
			
			for (String greeting: greetings ) {
				System.out.println("greeting: " + greeting);
			}
	}
    
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.greet();
		int count = app.countWords(" I have four words");
		System.out.println ("word count: " + count);	
    }
}