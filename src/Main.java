public class Main {
    public static void main(String[] args) {
//        Anonymous Class
        Lambda l = new Lambda() {
            @Override
            public void printName(String fname, String lname) {
                System.out.println(fname + " " + lname);
            }
        };
        l.printName("Nimit", "MN");

        Lambda l1 = (fname, lname) -> System.out.println(fname + " " + lname);
        l1.printName("Nimit","Mandaviya");
    }
}