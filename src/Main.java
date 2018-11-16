import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int className;
        System.out.println("Введите код класса: 1 для строителя, 2 для кровельщика, 3 для машиностроителя");
        Scanner sc = new Scanner(System.in);
        className=sc.nextInt();
        if (className==1){
            Stro man = new Stro("Олег строитель",24,2);
            System.out.println(man.toString()+man.build()+man.destroy()+man.found());
        } else if (className==2){
            Krow man = new Krow("Игорь кровельщик", 48,25);
            System.out.println(man.toString()+man.build()+man.destroy()+man.found());
        } else if (className==3) {
            Masch man = new Masch("Николай машиностроитель", 36,13,"красная машина", "левый бренд","большая");
            System.out.println(man.toString()+man.build()+man.destroy()+man.found()+man.painting()+man.purchase()+man.grinding());
        }
    }
}
