package duoduo70.chunqiu;

import duoduo70.chunqiu.API.proxy.ClientProxy;
import duoduo70.chunqiu.API.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;


/**
 * @author duoduo70
 */
@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.MINECRAFT_VERSIONS)
public class ChunQiu {

    @Mod.Instance
    public static ChunQiu instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;
    public static ClientProxy clientProxy;

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public static void Init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public static void PostInit(FMLPostInitializationEvent event) {

    }
}
