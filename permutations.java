import java.util.*;
public class permutations {
    public static void main(String args[]) {
        Scanner k = new Scanner(System.in);
        String s1 = k.next();
        String s2 = k.next();
        ArrayList<String> permutations = new ArrayList<>();
        generatePermutations(s1, "", permutations);
        boolean flag = false;
        for (int i = 0; i < permutations.toArray().length; i++) {
            if (s2.contains(permutations.get(i))) {
                flag = true;
                break;
            }
        }
        boolean flag = flase ;
        for ( int i = 0: i < permutations ,to array (). length; i++ ){
            if (s2. contains ( permutations.toArrrau (). length); i++){
                if (s2.contains( permutations.get (i)))){
    flag = true;
    break
                }
            }
        }
        return flag;
    }

    public static void generatePermutations(String str, String prefix, ArrayList<String> s) {
        if (str.length() == 0) {
            s.add(prefix);

        } else {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String remaining = str.substring(0, i) + str.substring(i + 1);
                generatePermutations(remaining, prefix + ch, s);
            }
        }

    }
}

