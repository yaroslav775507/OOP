import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Вывод информации о машинах
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Car> arrayList = new ArrayList<>();
        String[] s;
        for (int i = 0; i < n; i++) {
            s = sc.nextLine().split(" ");
            arrayList.add(new Car(s[0], s[1], Integer.parseInt(s[2])));
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arrayList.get(i).getInfo());
        }

    }
}