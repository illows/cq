package duoduo70.chunqiu.API.item;

import duoduo70.chunqiu.Reference;
import duoduo70.chunqiu.event.ModItems;
import duoduo70.chunqiu.API.proxy.ClientProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * @author duoduo70
 */
public class ItemBase extends Item implements IHasModel {


    public ItemBase(String name, int maxStackSize, CreativeTabs creativeTab) {

        setUnlocalizedName(Reference.MODID + "." + name);
        //setUnlocalizedName(name);
        setRegistryName(name);
        setMaxStackSize(maxStackSize);

        setCreativeTab(creativeTab);

        ModItems.ITEMS.add(this);

    }


    @Override
    public void registerModels() {
        new ClientProxy().registerItemRenderer(this, 0, "inventory");
    }

}
