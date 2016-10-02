package cz.projectTriad.stargate;

import cz.projectTriad.stargate.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = PTSG.MODID, name = PTSG.MODNAME, version = PTSG.VERSION)
public class PTSG {
	
	public static final String MODID = "ProjT_SGC";
	public static final String MODNAME = "ProjectTriad - StarGateCore";
	public static final String VERSION = "0.0.1";

	@SidedProxy(clientSide="cz.projectTriad.stargate.proxy.ClientProxy", serverSide="cz.projectTriad.stargate.proxy.ServerProxy")
	public static CommonProxy proxy;
	
	@Instance
	public static PTSG instace = new PTSG();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) 
	{
		
	}
	@EventHandler
	public void Init(FMLInitializationEvent e) 
	{
		
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) 
	{
		
	}
}
