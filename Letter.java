package de.unistuttgart.iaas.pse.ex04.p3;

import java.io.Serializable;

public class Letter implements Serializable {
	public String sender;
	public String recipient;

	/**
	 * creates a new letter
	 * 
	 * @param sender
	 *            the sender of the letter
	 * @param recipient
	 *            the recipient of the letter
	 */
	public Letter(String sender, String recipient) {
		this.sender = sender;
		this.recipient = recipient;

	}

	/**
	 * returns the sender of the letter
	 * 
	 * @return the sender of the letter
	 */
	public String getSender() {
		return this.sender;
	}

	/**
	 * returns the recipient of the letter
	 * 
	 * @return the recipient of the letter
	 */
	public String getRecipient() {
		return this.recipient;
	}

}
