abstract class Instrument {
    public Instrument() {
        super();
    }
    public String play() {
        return "";
    }
}
class StringInstrument extends Instrument {
    public StringInstrument() {
        super();
    }
    @Override
    public String play() {
        return super.play() + "Strumming the strings";
    }
}
class Violin extends StringInstrument {
    public Violin() {
        super();
    }
    @Override
    public String play() {
        return super.play() + ", with a bow drawn across four strings";
    }
}
public class Orchestra {
    public static void main(String[] args) {
        StringInstrument s = new StringInstrument();
        Violin v = new Violin();
        System.out.println(s.play());
        System.out.println(v.play());
    }
}