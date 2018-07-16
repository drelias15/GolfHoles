import java.util.Scanner;

public class GolfHoles {

    public static void main (String[] args){

        Scanner keyboard = new Scanner(System.in);
        String code;
        String priceDesc;

        System.out.println("Please enter your Code here.");
        code = keyboard.next().toUpperCase(); // if user input is not change to upper case, the default will always be executed for user values in lower case.

        switch(code){
            case "BALL": priceDesc = "Golf Balls (1 dozen) for $38.0";
                       break;
            case "DRV01": priceDesc = "Big Bertha Driver for $449.95";
                break;
            case "DRV02": priceDesc = "Vaporizer Driver for $375.00";
                break;
            case "DRV03": priceDesc = "Fly-Z Driver for $179.00";
                break;
            case "SET01": priceDesc = "Project Manager Gold Club Set for \t$179.00";
                break;
            case "SET02": priceDesc = "Junior VP Golf Club Set for $225.00";
                break;
            case "SET03": priceDesc = "Executive Golf Club Set for $299.95";
                break;
            case "SET04": priceDesc = "CEO Golf Club Set (1 dozen) for $374.95";
                break;
            case "SET05": priceDesc = "Chairman of the Board Club Set for $495.00";
                break;
            default: priceDesc = "Invalid code";
                     break;

        }
        System.out.println(priceDesc);
    }
}
