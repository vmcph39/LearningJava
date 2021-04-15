package mani;

import java.util.Scanner;

public class TriangleCalculator {
  
  
public static void main(String[] args){
   Scanner input = new Scanner(System.in);

//obtain three points for a triangle
System.out.print("Enter first point x-coordinate :");
double x1 = input.nextDouble();
System.out.print("Enter first point y-coordinate :");
double y1 = input.nextDouble();
System.out.print("Enter second point x-coordinate :");
double x2 = input.nextDouble();
System.out.print("Enter second point y-coordinate :");
double y2 = input.nextDouble();
System.out.print("Enter third point x-coordinate :");
double x3 = input.nextDouble();
System.out.print("Enter third point y-coordinate :");
double y3 = input.nextDouble();

   double a = Math.sqrt(
(Math.pow((x2 - x3), 2.0))
+ (Math.pow((y2 - y3), 2.0)));
   double b = Math.sqrt(
(Math.pow((x3 - x1), 2.0))
+ (Math.pow((y3 - y1), 2.0)));
   double c = Math.sqrt(
(Math.pow((x1 - x2), 2.0))
+ (Math.pow((y1 - y2), 2.0)));
   double perimeter=a+b+c;
   double s = (a+b+c)/2.0d;
   double x = (s * (s-a) * (s-b) * (s-c));
   double Area= Math.sqrt(x);
   double A = Math.acos(((b*b) + (c*c) - (a*a))/(2*b*c))*(180/Math.PI);
   double B = Math.acos(((a*a) + (c*c) - (b*b))/(2*a*c))*(180/Math.PI);
   double C = Math.acos(((b*b) + (a*a) - (c*c))/(2*b*a))*(180/Math.PI);
   System.out.println("side a length :"+a);
   System.out.println("side b length :"+b);
   System.out.println("side c length :"+c);
   System.out.println("Angle A: "+A);
   System.out.println("Angle B: "+B);
   System.out.println("Angle C: "+C);
   System.out.println("Perimeter: "+perimeter);
   System.out.println("Area: "+Area);
}

}