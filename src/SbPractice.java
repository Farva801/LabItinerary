import java.util.Arrays;
import java.util.List;

/**
 * Created by John on 2/16/14.
 */
public class SbPractice {
    public static void main(String[] args) {
        List<String> carList = Arrays.asList("ford", "chevy", "Mazda");
        System.out.println(addSeperater(carList));
    }

    public static String addSeperater(List<String> ls) {
        StringBuilder sb = new StringBuilder(32);
        String separator = ", ";

        for (int i = 0; i < ls.size(); i++) {
            sb.append(ls.get(i));
            if (i < ls.size() - 1) {
                sb.append(separator);
            }
        }
        return sb.toString();
    }
}
