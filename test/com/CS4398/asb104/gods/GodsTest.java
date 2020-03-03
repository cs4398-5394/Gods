package com.CS4398.asb104.gods;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.event.player.PlayerJoinEvent;

import com.CS4398.spc51.gods.CommandManager;
import com.CS4398.spc51.gods.Gods;

import java.util.ArrayList;

import junit.framework.TestCase;
import org.bukkit.Server;
import org.junit.runner.RunWith;

import org.mockito.*;
import org.mockito.stubbing.Answer;


public class GodsTest {

	
	@Test
    public void MockitoandServerTest() throws Exception {
		boolean flag = false;
		try {
		System.out.println("* MockitoandServerTest: test()");

        Plugin plugin = Mockito.mock(Plugin.class);
        PluginManager pManager = Mockito.mock(PluginManager.class);

        Server server = Mockito.mock(Server.class);
        Mockito.when(server.getPluginManager()).thenReturn(pManager);

        Mockito.when(plugin.getServer()).thenReturn(server);
        flag = true;
		}
		
		 finally {assertEquals(true, flag);}
		
        
   }

	@Test
    public void JoinServerEventTest() throws Exception {
		
		System.out.println("* JoinServerEventTest: test()");
		 Plugin plugin = Mockito.mock(Plugin.class);
	        PluginManager pManager = Mockito.mock(PluginManager.class);

	        Server server = Mockito.mock(Server.class);
	        Mockito.when(server.getPluginManager()).thenReturn(pManager);

	        Mockito.when(plugin.getServer()).thenReturn(server);
	        
	        Player player = Mockito.mock(Player.class); // Create a Player stub
	        Mockito.when(player.getName()).thenReturn("asb104");
	       
	        PlayerJoinEvent playerJoinEvent = Mockito.mock(PlayerJoinEvent.class);
	       
	        System.out.println("These are player currently on server " + playerJoinEvent.getPlayer());
	        System.out.println(player.getName() + " will attempt to join the server");
	        playerJoinEvent.setJoinMessage("A new Player has Joined");
	        System.out.println(playerJoinEvent.getJoinMessage());
	        System.out.println("These are player currently on server " + playerJoinEvent.getPlayer());

	        
	}
}
