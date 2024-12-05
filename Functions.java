/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package functions;

import javax.swing.JOptionPane;

/**
 *
 * @author GERALDINO_COMP111
 */
public class Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

    
   
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius; 
    }

   
    public static double calculateRectangleArea(double length, double width) {
        return length * width; 
    }

   
    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height; 
    }

  
    public static double calculateSphereVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

  
    public static double calculateCylinderVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

   
    public static double calculateTriangleSide(double a, double b, double angleC) {
        double angleInRadians = Math.toRadians(angleC);
        return Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(angleInRadians));
    }

    
    public static double calculateCircleSegmentArea(double radius, double angle) {
        double angleInRadians = Math.toRadians(angle);
        return (Math.pow(radius, 2) / 2) * (angleInRadians - Math.sin(angleInRadians)); 
    }

  
    public static double calculateSphereSurfaceArea(double radius) {
        return 4 * Math.PI * Math.pow(radius, 2); 
    }

    public static void fuction (String[] args) {
        
        String message = "Choose a shape to calculate:\n";
        message += "1. Area of Circle\n";
        message += "2. Area of Rectangle\n";
        message += "3. Area of Triangle\n";
        message += "4. Volume of Sphere\n";
        message += "5. Volume of Cylinder\n";
        message += "6. Calculate Third Side of Triangle (Law of Cosines)\n";
        message += "7. Area of Circle Segment\n";
        message += "8. Surface Area of Sphere\n";
        message += "9. Exit";

        // Ask the user to choose an option
        String input = JOptionPane.showInputDialog(message);
        
        try {
            int choice = Integer.parseInt(input); // Convert the input to an integer

            // Perform the corresponding calculation based on the user's choice
            switch (choice) {
                case 1:
                    double radiusCircle = Double.parseDouble(JOptionPane.showInputDialog("Enter radius of the circle:"));
                    JOptionPane.showMessageDialog(null, "Area of Circle: " + calculateCircleArea(radiusCircle));
                    break;
                case 2:
                    double length = Double.parseDouble(JOptionPane.showInputDialog("Enter length of the rectangle:"));
                    double width = Double.parseDouble(JOptionPane.showInputDialog("Enter width of the rectangle:"));
                    JOptionPane.showMessageDialog(null, "Area of Rectangle: " + calculateRectangleArea(length, width));
                    break;
                case 3:
                    double base = Double.parseDouble(JOptionPane.showInputDialog("Enter base of the triangle:"));
                    double height = Double.parseDouble(JOptionPane.showInputDialog("Enter height of the triangle:"));
                    JOptionPane.showMessageDialog(null, "Area of Triangle: " + calculateTriangleArea(base, height));
                    break;
                case 4:
                    double radiusSphere = Double.parseDouble(JOptionPane.showInputDialog("Enter radius of the sphere:"));
                    JOptionPane.showMessageDialog(null, "Volume of Sphere: " + calculateSphereVolume(radiusSphere));
                    break;
                case 5:
                    double radiusCylinder = Double.parseDouble(JOptionPane.showInputDialog("Enter radius of the cylinder:"));
                    double heightCylinder = Double.parseDouble(JOptionPane.showInputDialog("Enter height of the cylinder:"));
                    JOptionPane.showMessageDialog(null, "Volume of Cylinder: " + calculateCylinderVolume(radiusCylinder, heightCylinder));
                    break;
                case 6:
                    double a = Double.parseDouble(JOptionPane.showInputDialog("Enter side a of the triangle:"));
                    double b = Double.parseDouble(JOptionPane.showInputDialog("Enter side b of the triangle:"));
                    double angleC = Double.parseDouble(JOptionPane.showInputDialog("Enter angle C (in degrees):"));
                    JOptionPane.showMessageDialog(null, "Third side of triangle: " + calculateTriangleSide(a, b, angleC));
                    break;
                case 7:
                    double radiusSegment = Double.parseDouble(JOptionPane.showInputDialog("Enter radius of the circle:"));
                    double angle = Double.parseDouble(JOptionPane.showInputDialog("Enter central angle (in degrees):"));
                    JOptionPane.showMessageDialog(null, "Area of Circle Segment: " + calculateCircleSegmentArea(radiusSegment, angle));
                    break;
                case 8:
                    double radiusSphereSurface = Double.parseDouble(JOptionPane.showInputDialog("Enter radius of the sphere:"));
                    JOptionPane.showMessageDialog(null, "Surface Area of Sphere: " + calculateSphereSurfaceArea(radiusSphereSurface));
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Exiting the program...");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice! Please choose a number between 1 and 9.");
                    break;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid number.");
        }
    }
}