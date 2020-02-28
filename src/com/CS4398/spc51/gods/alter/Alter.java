package com.CS4398.spc51.gods.alter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Location;

import com.CS4398.spc51.gods.gods.God;


/**
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

	private ArrayList<ArrayList<AlterBlock>> alterBlocks; 
	
	/**
	 * Instantiates a new alter.
	 *
	 * @param createrUUID the creater UUID
	 * @param god the god
	 */
	public Alter(UUID createrUUID, God god, ArrayList alterBlocks) {
		this.god = god;
		this.createrUUID = createrUUID;
		this.alterBlocks = alterBlocks;
		
	}

	public boolean near(Location location) {
		// TODO Auto-generated method stub
		return false;
	}

	public God getGod() {
		// TODO Auto-generated method stub
		return null;
	}



}
