import java.util.Scanner;

public class TimeConverter {
	public static int totalTime;
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        totalTime = sc.nextInt();
        System.out.println(totalTime + " seconds = " + (totalTime/3600) + " hours " + ((totalTime%3600)/60) + " minutes " + ((totalTime%3600)%60) + " seconds ");
    }
}
