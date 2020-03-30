package main;

import domein.DomeinController;
import ui.SpelApplicatie;

public class StartUp {
	
	public static void main(String[] arg) {
		
		new SpelApplicatie(new DomeinController()).spelen();
	}

}
