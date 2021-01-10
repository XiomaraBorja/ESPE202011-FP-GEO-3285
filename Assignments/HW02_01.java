 public static void main(String[] args) {
        // TODO code application logic here
         menu();
        
    }
    
    public static void menu(){
        Scanner scan = new Scanner(System.in);
        short side;
        float reply;
        System.out.println("Calculating the area of an octagon");
        System.out.println("Enter the size of the side: ");
        side = scan.nextShort();
        reply = area(side);
        System.out.println("The octagon area on the side = " + Integer.toString(side) + " es: " + Float.toString(reply));
    }
    
    public static float area(short  side){
        float reply;
        int numerator;
        float denominator;
        numerator = (int)(2*Math.pow(side, 2));
        denominator = (float)Math.tan(22.5);
        reply = numerator/denominator;
        return reply;
    }
    
}
