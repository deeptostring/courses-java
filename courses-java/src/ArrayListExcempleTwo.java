import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListExcempleTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList();
        ArrayList<Integer> aven = new ArrayList();
        ArrayList<Integer> odd = new ArrayList();

        while (true) {
            if (Integer.parseInt(reader.readLine()) == 0) {
                System.out.println(0);
            } else {
                list.add(Integer.parseInt(reader.readLine()));

                for (int i = 0; i < list.size(); i++) {

                    if (list.get(i) % 2 == 0) {
                        aven.add(i);
                    } else if (list.get(i) != 0) {
                        odd.add(i);
                    }
                    System.out.println(aven.get(i));
                    System.out.println(odd.get(i));
                }
            }
        }


    }
}
