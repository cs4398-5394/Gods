package com.CS4398.spc51.gods;

import org.bukkit.plugin.java.JavaPlugin;

import com.CS4398.spc51.gods.alter.AlterManager;
import com.CS4398.spc51.gods.gods.Atheist;
import com.CS4398.spc51.gods.gods.God;
import com.CS4398.spc51.gods.gods.Hades;
import com.CS4398.spc51.gods.gods.Poseidon;
import com.CS4398.spc51.gods.gods.Zeus;

/**
 * The Class Gods.
 */
public class Gods extends JavaPlugin{
	
	/** The configurator. */
	static Configurator configurator;
	public static Gods gods;
	public static final God[] godsArray = new God[4];
	//public static ArrayList<God> godsList = new ArrayList<God>(Arrays.asList(Atheist atheist = new Atheist(), Obj B, Obj C, ....so on))
	
	/**
	 * On enable it notifies the log/console that it has been called
	 * Instantiates the configurator.
	 * Registers the AlterManager with the server.
	 */
	@Override
    public void onEnable() {
		gods = this;
		godsArray[0] = new Atheist();
		godsArray[1] = new Hades();
		godsArray[2] = new Poseidon();
		godsArray[3] = new Zeus();
        getLogger().info("onEnable is called!");
        configurator = new Configurator();
        //register the AlterManager
        getServer().getPluginManager().registerEvents(new AlterManager(), this);
        //register the Chat Listener
        getServer().getPluginManager().registerEvents(new ChatListener(), this);
        //register Action Listener
        getServer().getPluginManager().registerEvents(new ActionListener(), this);
        // Register Commands
     	this.getCommand("gods").setExecutor(new CommandManager());
    }
    
    /**
     * On disable.
     */
    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
        //TODO Need to unregister the listeners
        
        Believer.saveAll();
    }
}
