

public class authkeyGenerator {
    public static int main(String[] args) {
        int min = 100000, max = 999999;
        int res = min + (int) (Math.random() * ((max - min) + 1));
        return res;
    }
}
