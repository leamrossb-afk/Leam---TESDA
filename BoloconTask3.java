public class BoloconTask3 {
    public static void main(String[] args) {
        String a = new String("Wow");
        String b = "Wow";
        String c = (a = b);
        String d = (c = b.concat("!"));

        boolean b1 = a == b;
        // System.out.println("b1: " + b1);
        boolean b2 = d.equals(b + "!");
        // System.out.println("b2: " + b2);
        boolean b3 = !c.equals(a);
        // System.out.println("b3: " + b3);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}
