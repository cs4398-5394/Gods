/*
 * 
 */
package com.CS4398.spc51.gods.alter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Location;

import com.CS4398.spc51.gods.gods.God;


// TODO: Auto-generated Javadoc
/**
 * @author Shaun Coyne (spc51)
 * The Class Alter.
 */
public class Alter {
	
	/** The god. */
	private God god;
	
	/** The creater UUID. */
	private UUID createrUUID;
	
	/** The random phrases the god may say. */
	private HashMap phrases; 
	
	/** The responses specific responses the god says on certain interactions. */
	private HashMap responses;

	/** The alter blocks. */
	private ArrayList<ArrayList<AlterBlock>> alterBlocks; 
	
	/**
	 * Instantiates a new alter.
	 *
	 * @param createrUUID the creater UUID
	 * @param god the god
	 * @param alterBlocks the alter blocks
	 */
	public Alter(UUID createrUUID, God god, ArrayList alterBlocks) {
		this.god = god;
		this.createrUUID = createrUUID;
		this.alterBlocks = alterBlocks;
		
	}

	/**
	 * Near.
	 *
	 * @param location the location
	 * @return true, if successful
	 */
	public boolean near(Location location) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Gets the god.
	 *
	 * @return the god
	 */
	public God getGod() {
		// TODO Auto-generated method stub
		return null;
	}



}
