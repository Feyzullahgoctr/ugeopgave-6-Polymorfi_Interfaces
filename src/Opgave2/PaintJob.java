package Opgave2;

import java.util.ArrayList;

public class PaintJob {

    protected String name;

    // Fordelen er, at PaintJob kan arbejde med flere forskellige former, ikke kun rektangler.
    // Dette giver polymorfi og mere fleksibel kode
    protected ArrayList<Shape> surfaces;
    protected ArrayList<Shape> deductions;
    protected PaintCalculator paintCalculator;

    public PaintJob(String name) {
        this.name = name;
        this.surfaces = new ArrayList<>();
        this.deductions = new ArrayList<>();
        this.paintCalculator = new PaintCalculator();
    }

    public void addSurface(Shape shape) {
        surfaces.add(shape);
    }

    public void addDeduction(Shape shape) {
        deductions.add(shape);
    }

    public double getTotalSurface() {
        double totalArea = 0;
        for (Shape s : surfaces) {
            totalArea += s.getArea();
        }
        return totalArea;
    }

    public double getTotalDeductions() {
        double totalArea = 0;
        for (Shape s : deductions) {
            totalArea += s.getArea();
        }
        return totalArea;
    }

    public double getPaintableArea() {
        return getTotalSurface() - getTotalDeductions();
    }

    public void printSummary() {
        System.out.println();
        printTitle();
        // ===================================================================
        System.out.println("=== Overflader ===");
        for (Shape s : surfaces) {
            if (s instanceof Rectangle) {
                System.out.println(s.getName() + ": " + s.getShapeName() + " " + ((Rectangle) s).weight + " X " + ((Rectangle) s).height + " = " + s.getArea() + " m²");
            } else if (s instanceof Circle) {
                System.out.println(s.getName() + ": " + s.getShapeName() + " radius " + ((Circle) s).radius + " = " + s.getArea()+ " m²");
            } else if (s instanceof Triangle) {
                System.out.println(s.getName() + ": sides of the " + s.getShapeName() + " " + ((Triangle) s).a + "," + ((Triangle) s).b + "," + ((Triangle) s).c + " = " + s.getArea()+ " m²");
            } else {
                System.out.println("Invalid");
            }
        }
        System.out.println("Total :" + getTotalSurface() + " m²");

        // ===================================================================
        System.out.println("===========================================");
        System.out.println("=== Fradrag === ");
        for (Shape s : deductions) {
            if (s instanceof Rectangle) {
                System.out.println(s.getName() + ": " + s.getShapeName() + " " + ((Rectangle) s).weight + " X " + ((Rectangle) s).height + " = " + s.getArea()+ " m²");
            } else if (s instanceof Circle) {
                System.out.println(s.getName() + ": " + s.getShapeName() + " radius " + ((Circle) s).radius + " = " + s.getArea()+ " m²");
            } else if (s instanceof Triangle) {
                System.out.println(s.getName() + ": sides of the " + s.getShapeName() + " " + ((Triangle) s).a + "," + ((Triangle) s).b + "," + ((Triangle) s).c + " = " + s.getArea()+ " m²");
            } else {
                System.out.println("Invalid");
            }
        }
        System.out.println("Total: " + getTotalDeductions() + " m²");

        System.out.println("===========================================");
        System.out.println("Skal males: " + getPaintableArea() + " m²");

        System.out.println("===========================================");
        printTotalLitre();

    }

    public void printTitle() {
        System.out.println("=== Malerberegner: " + name + " ===\n");
    }

    public void printTotalLitre() {
        System.out.println("Antal nødvendige malinger :" + paintCalculator.calculatePaint(getPaintableArea(), 12));
    }

}
