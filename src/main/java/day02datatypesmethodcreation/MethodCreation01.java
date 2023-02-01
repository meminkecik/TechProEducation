package day02datatypesmethodcreation;

public class MethodCreation01 {
    public static void main(String[] args) {
        System.out.println(plus(3,5));
        System.out.println(multiply(3,5));
        int a = makeSomething(3,5,8);
        System.out.println(a);
        long b = getCube(3);
        System.out.println(b);
        String city = "Ankara";
        prnt(city);
    }
    public static int plus(int a, int b){
        return a+b;
    }
    protected static int multiply(int a, int b){
        return a*b;
    }
    private static int makeSomething(int a, int b, int c){
        return (a*b) +c;
    }
    static long getCube(int a){
        return a*a*a;
    }
    public static void prnt(String word){
        System.out.println(word);
    }
}
