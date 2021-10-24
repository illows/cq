package duoduo70.chunqiu.event;

import net.minecraft.item.Item;

import duoduo70.chunqiu.API.item.ItemBase;
import net.minecraft.creativetab.CreativeTabs;
import java.util.ArrayList;
import java.util.List;

/**
 * @author duoduo70
 */
public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<Item>();
    public static final Item PEBBLE = new ItemBase("pebble",64,CreativeTabs.MATERIALS);
}
