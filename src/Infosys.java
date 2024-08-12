import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Infosys {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        String uuidString = uuid.toString();
        System.out.println(uuidString);
        System.out.println(uuidMatcher(uuidString));
    }
private static int uuidMatcher(String uuidString){

    Pattern pattern = Pattern.compile("-?\\d+");
    Matcher matcher = pattern.matcher(uuidString);
    int sum=0;
    while(matcher.find()){

        int num = Integer.parseInt(matcher.group());
        System.out.println(num);
        sum = sum+num;

    }
return sum;
}

}
