package ColourGame;

public class NormalItem implements Item{

    String name;

    public NormalItem(String name){
        this.name = name;
    }
    @Override
    public void intro(String colour) {
        System.out.println("I am "+ this.name +"! I am sometimes "+colour );
    }
}
