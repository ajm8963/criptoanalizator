import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word =  scanner.nextLine(); 
        int key = scanner.nextInt();
        chipnet tom = new chipnet();
        System.out.println(tom.decrypt(word, key));
        System.out.println(tom.encrypt(word,key));
        }
    }
