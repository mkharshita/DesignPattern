package creational.prototype.Approach1;

public class Crow extends Bird {

    private String sound = "Kaw";

    public Crow() {
    }

    public Crow(Crow old) {
        super(old);
        this.sound = old.sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public Crow clone() {
        //Parentd attribute are not copied
//        Crow copy = new Crow();
//        copy.sound = this.sound;

        // 2.
//        Bird cloneParent = super.clone();

        // So used the parameterized constructor
        return new Crow(this);
    }
}
