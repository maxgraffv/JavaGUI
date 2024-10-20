



public class Item {


    private String name;
    private ItemType type;
    private String imagePath;
    private int maxNum;

    Item(String name, ItemType type, String imagePath, int maxNum)
    {
        this.name = name;
        this.type = type;
        this.imagePath = imagePath;
        this.maxNum = maxNum;
    }

    String getName()
    {
        return name;
    }

    ItemType getType()
    {
        return type;
    }

    String getImagePath()
    {
        return imagePath;
    }

    int getMaxNum()
    {
        return maxNum;
    }

    
}
