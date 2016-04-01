import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Monil on 3/30/16.
 */
public class ExtractDomainNames {

    public static void main(String[] args) {
        getDomainNames();
    }

    static void getDomainNames() {
        int lines = 1;
        List<String> domains = new ArrayList<>();
        for (int i = 0; i < lines; i++) {

            String line = "asjfklaflkj(http://test.xyz.com/)asfsdaf";
            String domainPattern = "[a-z0-9\\-\\.]+\\.(com|org|net|gov|mil|edu|(co\\.[a-z].))";
            Pattern p = Pattern.compile(domainPattern,Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(line);
            while (m.find()) {
                domains.add(line.substring(m.start(0),m.end(0)).replaceAll("www.|ww2.|web.",""));
            }
            System.out.println(domains);


        }

    }
}
