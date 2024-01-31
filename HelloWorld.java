import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        double height = 0;
        double points_per_meter = 0;
        double par = 0; //Naming variables
        System.out.println("This program will give you a score and rating for your ski jump"); //Purpose of program
        Scanner scan = new Scanner(System.in);
        System.out.println("What was the jumper's speed at the end of the ramp in m/s?");
        double speed = scan.nextInt(); //Storing user input
        System.out.println("What type of hill was it? [Normal/Large]");
        scan.nextLine();
        String hill = scan.nextLine(); //Storing user input

        if(hill.equals("normal")){
            height = 46;
            points_per_meter = 2;
            par = 90;
        } else {
            height = 70;
            points_per_meter = 1.8;
            par = 120;
        } //Setting values according to hill type
        double time = Math.sqrt((2 * height) / 9.8);
        double distance = speed * time;
        double points = (60 + (distance - par) * points_per_meter);
        //Performing calculations based on input
        if (points>=61){
            System.out.println("Great job for doing better than par!");
        }
        else if(points < 10){
            System.out.println("What happened");
        }
        else{
            System.out.println("Sorry, you didn't go very far.");
        }
        //Outputs different outcomes based on point result.
        System.out.print("You had a distance of " + distance + " meters and earned " + points + " points. ");
        //Outputs distance traveled and points
    }
}
