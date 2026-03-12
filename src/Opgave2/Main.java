package Opgave2;

public class Main {

    public static void main(String[] args) {


        PaintJob stue = new PaintJob("Stue");

        // Overflader
        stue.addSurface(new Rectangle("Væg nord", 5.0, 2.5));
        stue.addSurface(new Rectangle("Væg syd", 5.0, 2.5));
        stue.addSurface(new Rectangle("Væg vest", 5.0, 2.5));
        stue.addSurface(new Rectangle("Væg øst", 5.0, 2.5));
        stue.addSurface(new Rectangle("Loft syd", 5, 1.5));
        stue.addSurface(new Rectangle("Loft nord", 5, 1.5));
        stue.addSurface(new Triangle("Loft øst", 4.0, 3, 5));
        stue.addSurface(new Triangle("Loft vest", 4.0, 3, 5));

        // Fradrag
        stue.addDeduction(new Rectangle("Dør1",1.1,2));
        stue.addDeduction(new Rectangle("Dør2",1.1,2));
        stue.addDeduction(new Rectangle("Vindue1",0.5,1));
        stue.addDeduction(new Rectangle("Vindue2",0.5,1));
        stue.addDeduction(new Circle("Vindue3", 0.5));

        // print
        stue.printSummary();



    }

}
