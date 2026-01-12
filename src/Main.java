
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
                // question no 1
        Scanner scanner = new Scanner(System.in);
        float obt,perc;
        int total;
        System.out.println("Enter your obtained marks ");
        obt = scanner.nextFloat();
        while (obt <= 0){
            System.out.println("Enter your obtained marks ");
            obt = scanner.nextFloat();
        }
        System.out.print("Enter the total marks");
        total = scanner.nextInt();
        while (total <= 0){
            System.out.print("Enter the total marks");
            total = scanner.nextInt();
        }
         perc = (obt/total)*100;
         System.out.print("you got " + perc + "%" );

                    //question no 2
        Scanner scanner = new Scanner(System.in);
        float rad;
        double cir, area;
         System.out.println("Enter Radius of the circle ");
   rad = scanner.nextFloat();        while(rad <0){
         System.out.println("Enter Radius of the circle ");
         rad = scanner.nextFloat();
        }
        area = ((int)(Math.PI * rad * rad *100))/100; // to avoid large decimal val
        cir = ((int)(Math.PI * 2 * rad*100))/100; // to avoid large decimal val
        System.out.print("The area will be " + area + "\n" +
                        "The circumference will be "+ cir );


                        // question no 3
        Scanner scanner = new Scanner(System.in);
        float price,dis,per;

        System.out.print("Enter original price ");
        price = scanner.nextFloat();
        while(price <= 0){
            System.out.println("negative price not allowed,Renter original price ");
            price = scanner.nextFloat();
        }

        System.out.print("Enter the discount percentage");
        per=  scanner.nextFloat();
        while (per >100 || per < 0){
            System.out.println("the discount range must be in 0-100,Renter the discount percentage");
            per=  scanner.nextFloat();
        }

        dis = price -(price*per/100);
        System.out.println("The discounted price is " + dis);

                            // question no 4
        Scanner scanner = new Scanner(System.in);
        float per2,dis2,price2;

        System.out.print("Enter discounted selling price ");
        dis2 = scanner.nextInt();
        while(dis2 <= 0){
            System.out.println("negative price not allowed,Renter original price ");
            dis2 = scanner.nextInt();
        }

        System.out.print("Enter the discount percentage");
        per2=  scanner.nextFloat();
        while (per2 >100 || per2 < 0){
            System.out.println("the discount range must be in 0-100,Renter the discount percentage");
            per2=  scanner.nextFloat();
        }

        price2 = (dis/per2)*100;
        System.out.println("The discounted price is " + price2);


                       // Question no 5
       Scanner scanner = new Scanner(System.in);
        float volt,amp,watt;
        System.out.print("Enter voltage");
        volt = scanner.nextFloat();
        System.out.print("Enter current ");
        amp = scanner.nextFloat();
        watt = amp*volt;
        System.out.print("power will be " + watt + "watt");

                     // Question no 6
       Scanner scanner = new Scanner(System.in);
        float l1,l2,h,k;
        System.out.print("-------Area of a trapezoid ----------- \n");
        // for parallel line 1
        System.out.print("Enter the length (L1) of parallel side");
        l1 = scanner.nextFloat();
        while (l1 <= 0){
            System.out.print("Enter the length (L1) of parallel side");
            l1 = scanner.nextFloat();
        }

        // for parallel line 2
        System.out.print("Enter the length (L2) of parallel side");
        l2 = scanner.nextFloat();
        while (l2 <= 0){
            System.out.print("Enter the length (L2) of parallel side");
            l2 = scanner.nextFloat();
        }

        //for height
        System.out.print("Enter height of these parallel sides");
        h = scanner.nextFloat();
        while (h <= 0){
            System.out.print("Enter height of these parallel sides");
            h = scanner.nextFloat();
        }

        k = (h*(l1 + l2 )) / 2;
        System.out.print("The area of the trapezoid will be: " + k);

                   // Question no 7
      Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Enter the number");
        num = scanner.nextInt();
        if (num%2 == 0){
            System.out.print("Even");
        }
        else {
            System.out.print("odd");

        }

                // Question no 8
        Scanner scanner = new Scanner(System.in);
        float a,b,c,s,calc;
        double Area;
        // for side a
        System.out.print("Enter the length of side a : ");
        a = scanner.nextFloat();
        while (a <= 0){
            System.out.print("Enter the length of side a : ");
            a = scanner.nextFloat();
        }

        // for side b
        System.out.print("Enter the length of side b : ");
        b = scanner.nextFloat();
        while (b <= 0){
            System.out.print("Enter the length of side b : ");
            b = scanner.nextFloat();
        }

        //for side c
        System.out.print("Enter the length of side c: ");
        c = scanner.nextFloat();
        while (c <= 0){
            System.out.print("Enter the length of side c: ");
            c = scanner.nextFloat();
        }
        s = (a+b+c)/2;
        calc = (s*(s-a)*(s-b)*(s-c));
        Area = Math.sqrt(calc);
        System.out.print("The area of the triangle will be : "+ Area);



    }
}