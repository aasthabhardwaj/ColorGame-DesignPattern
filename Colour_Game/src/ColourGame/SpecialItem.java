package ColourGame;

public class SpecialItem implements Item{

    String name;

    public SpecialItem(String name){
        this.name = name;
    }

    @Override
    public void intro(String colour) {
        System.out.println("I am "+ this.name +"! I am  "+colour + " today! \n");
    }
}
