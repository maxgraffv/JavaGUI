import java.util.List;
import java.util.ArrayList;

public class ItemsList {
    
    private List<Item> itemsList = new ArrayList<>();
    private static ItemsList itemsListInstance = null;

    private ItemsList()
    {
        itemsList.add(new Item("chest", ItemType.UTILITY, "items/minecraft_chest.png", 64 ));
        itemsList.add(new Item("crafting table", ItemType.BLOCK, "items/minecraft_crafting_table.png", 64 ));
        itemsList.add(new Item("oak button", ItemType.UTILITY, "items/minecraft_oak_button.png", 64 ));
        itemsList.add(new Item("oak door", ItemType.UTILITY, "items/minecraft_oak_door.png", 64 ));
        itemsList.add(new Item("oak fence", ItemType.UTILITY, "items/minecraft_oak_fence.png", 64 ));
        itemsList.add(new Item("oak gate", ItemType.UTILITY, "items/minecraft_oak_fence_gate.png", 64 ));
        itemsList.add(new Item("oak log", ItemType.BLOCK, "items/minecraft_oak_log.png", 64 ));
        itemsList.add(new Item("oak planks", ItemType.BLOCK, "items/minecraft_oak_planks.png", 64 ));
        itemsList.add(new Item("oak pressure plate", ItemType.UTILITY, "items/minecraft_oak_pressure_plate.png", 64 ));
        itemsList.add(new Item("oak sign", ItemType.UTILITY, "items/minecraft_oak_sign.png", 64 ));
        itemsList.add(new Item("oak slab", ItemType.BLOCK, "items/minecraft_oak_slab.png", 64 ));
        itemsList.add(new Item("oak stairs", ItemType.BLOCK, "items/minecraft_oak_stairs.png", 64 ));
        itemsList.add(new Item("oak trapdoor", ItemType.UTILITY, "items/minecraft_oak_trapdoor.png", 64 ));
        itemsList.add(new Item("stick", ItemType.DECORATION, "items/minecraft_stick.png", 64 ));
        itemsList.add(new Item("wooden axe", ItemType.TOOL, "items/minecraft_wooden_axe.png", 1 ));
        itemsList.add(new Item("wooden hoe", ItemType.TOOL, "items/minecraft_wooden_hoe.png", 1 ));
        itemsList.add(new Item("wooden pickaxe", ItemType.TOOL, "items/minecraft_wooden_pickaxe.png", 1 ));
        itemsList.add(new Item("wooden shovel", ItemType.TOOL, "items/minecraft_wooden_shovel.png", 1 ));
        itemsList.add(new Item("wooden sword", ItemType.TOOL, "items/minecraft_wooden_sword.png", 1 ));
    }

    public static ItemsList getInstance()
    {
        if(itemsListInstance == null)
            itemsListInstance = new ItemsList();
        
        return itemsListInstance;
    }

    public Item getItem(int index)
    {
        return itemsList.get(index);
    }



}
