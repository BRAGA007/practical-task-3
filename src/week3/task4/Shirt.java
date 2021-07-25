package week3.task4;

public class Shirt {
    private String id;
    private String specification;
    private String colour;
    private String size;

    public Shirt(String id, String specification, String colour, String size) {
        this.id = id;
        this.specification =specification;
        this.colour = colour;
        this.size = size;
    }


    public static Shirt getShirt(String shirt){
        String[] array= shirt.split(","); // separating a string by comma
        String id = array[0]; // assigning an id
        String specification = array[1]; // assigning a specification
        String colour = array[2]; // assigning a colour
        String size = array[3]; // assigning a size
        return new Shirt(id,specification,colour,size);
    }

    public static Shirt[] getShirts(String[] shirts){
        int amount = shirts.length;
        Shirt[] sh = new Shirt[amount];
        for(int i=0;i<amount;i++){
            sh[i] = getShirt(shirts[i]);
        }
        return sh;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "id='" + id + '\'' +
                ", specification='" + specification + '\'' +
                ", color='" + colour + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}