public class Main {
    public static void main(String[] args) {
        try {
            DOMreader reader = new DOMreader("src/test.xml");
            reader.m();
        } catch (Exception e) {
            System.out.println(e);
        }



    }
}
