package com.my.mod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid=Mymod.MODID,name=Mymod.NAME,version=Mymod.VERSION)

public class Mymod {
	public static final String MODID="MyMod";
	public static final String NAME="my mod";
	public static final String VERSION="1.0";
	
	private static Logger Logger;
	
	@EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        Logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        Logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
    
    
}
