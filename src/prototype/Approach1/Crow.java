package prototype.Approach1;

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
        return new Crow(this);
    }
}
