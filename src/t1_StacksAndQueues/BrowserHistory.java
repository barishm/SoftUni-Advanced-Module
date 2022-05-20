package t1_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String URL = scan.nextLine();
        ArrayDeque<String> history = new ArrayDeque<>();
        while(!URL.equals("Home")){

            if(URL.equals("back")){
                if(history.size() > 1){
                    history.pop();
                    System.out.println(history.peek());

                }else{
                    System.out.println("no previous URLs");
                }

            }else{
                System.out.println(URL);
                history.push(URL);
            }
            URL = scan.nextLine();
        }
    }
}
