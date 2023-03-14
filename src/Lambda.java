@FunctionalInterface
interface Lambda {
    void printName(String fname, String lname);
//    String printAge(int age); //Generate compile time error as Functional interface can only have one Abstract Method
}
