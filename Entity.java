public abstract class Entity {
    
    static int id_counter = 0;

    private String name;
    private int id;

    Entity(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public int getId()
    {
        return id;
    }

}
