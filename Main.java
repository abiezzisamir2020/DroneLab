public class Main {

    public static void main(String[] args) {

        double x1 = 5;
        double x2 = 4;
        double x3 = -3;

        double y1 = 2;
        double y2 = 9;
        double y3 = 2;

        double z1 = -5;
        double z2 = 2;
        double z3 = 6;

        double distance1 = Math.sqrt(Math.pow(x1 - x2,2)+ Math.pow(y1 - y2,2)+ Math.pow(z1 - z2,2));
        double distance2 = Math.sqrt(Math.pow(x2 - x3,2)+ Math.pow(y2 - y3,2)+ Math.pow(z2 - z3,2));
        double distance3 = Math.sqrt(Math.pow(x3 - x1,2)+ Math.pow(y3 - y1,2)+ Math.pow(z3 - z1,2));

        System.out.println("The distance between drone a and drone b is "+ distance1 + " meters");
        System.out.println("The distance between drone b and drone c is "+ distance2 + " meters");
        System.out.println("The distance between drone c and drone a is "+ distance3 + " meters");

        double highest = Math.max(distance1,Math.max(distance2,distance3));
        double lowest = Math.min(distance1,Math.min(distance2,distance3));

        System.out.println("The max hight is "+ highest + " meters");
        System.out.println("The min hight is "+ lowest + " meters");
    }
}
