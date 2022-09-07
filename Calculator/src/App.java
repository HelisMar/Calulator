public class App {
    public static void main(String[] args) throws Exception {
        
        int num1;
        int num2;
        String operation;

try{
    System.out.println("Sisest esimene number:");
        num1 = Integer.parseInt(System.console().readLine());

    System.out.println("Sisesta teine number");
        num2 = Integer.parseInt(System.console().readLine());
       
    System.out.println("Vali tegevus (+ , - , / , * )");
       operation = System.console().readLine();

       if (operation.equals("+")) {
           System.out.println("Teie vastus on: " + (num1 + num2));
       }
       else if (operation.equals("-")) {
           System.out.println("Teie vastus on: " + (num1 - num2));
       }
       else if (operation.equals("/")) {
           System.out.println("Teie vastus on: " + (num1 / num2));
       }
       else if (operation.equals("*")) {
           System.out.println("Teie vastus on: " + (num1 * num2));
       }
       else {
           System.out.println("Valesti valitud tegevus");
   } 
}   
   catch(Exception e) {
    System.out.println("Midagi läks valesti");}       
    }   
}
