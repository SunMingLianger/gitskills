import java.nio.charset.StandardCharsets;

public class StringDemo {

    public static void main(String[] args) {
        String s = "孙明亮";

        byte[] bytes = s.getBytes();
        byte[] sBytes = s.getBytes(StandardCharsets.UTF_8);

        for (byte aByte : bytes) {
            System.out.println(aByte);
        }

        System.out.println("======================================");
        for (byte sByte : sBytes) {
            System.out.println(sByte);
        }
//        System.out.println(bytes == sBytes);
//
//
//        System.out.println(System.getProperty("file.encoding"));


    }
}
