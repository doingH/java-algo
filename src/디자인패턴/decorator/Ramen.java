package 디자인패턴.decorator;

public class Ramen implements Noodle {

    @Override
    public void assemble() {
        System.out.print("면이 들어간다. ");
    }
    
}