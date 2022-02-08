package ColourGame;


public class Game {

    static Item self;

    public Game(String val) {
        if ( val.equalsIgnoreCase( "frog")){
             self = new SpecialItem("frog");
        } else {
            self = new NormalItem(val);
        }
    }
    public  void colour(String colour){
        this.self.intro(colour);
    }




}
