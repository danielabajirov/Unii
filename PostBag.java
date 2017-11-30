package de.unistuttgart.iaas.pse.ex04.p3;

import java.util.ArrayList;



public class PostBag  {
	
	ArrayList<Letter> postbag = new ArrayList<Letter>();

	/**
	 * returns all letters contained in the postbag
	 * 
	 * @return all letters contained in the postbag
	 */
	public ArrayList<Letter> getLetters() {
		for ( Letter x : this.postbag)
			System.out.println(x.recipient+ " 		" +x.sender);
		return postbag;
	}

	/**
	 * adds letters to the postbag
	 * 
	 * @param letters
	 *            the letters to add
	 */
	public void addLetter(Letter... letters) {
		
		for(int i = 0; i< letters.length; i++){
	           this.postbag.add(letters[i]);
	       }
		
	}
	
}
