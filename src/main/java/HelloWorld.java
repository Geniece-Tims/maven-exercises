import org.apache.commons.lang3.StringUtils;

public class HelloWorld {
    public static void main(String[] args) {
        String world = "World";
        System.out.println(StringUtils.prependIfMissing(world, "Hello, "));
        System.out.println(world);
    }
}
