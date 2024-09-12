package creational.prototype.Approach1;

public class Sparrow extends Bird {

    private String legSize;

    public void setLegSize(String legSize) {
        this.legSize = legSize;
    }

    public Sparrow(){

    }
    public Sparrow(Sparrow old){
        super(old);
        this.legSize = old.legSize;
    }
    @Override
    public Sparrow clone() {
        //Parentd attribute are not copied
//        Sparrow copy = new Sparrow();
//        copy.legSize = this.legSize;
        return new Sparrow(this);
    }
}
