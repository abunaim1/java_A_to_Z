public class variableArgs {
    public static void main(String[] args) {
        num(1, 2, 3, 4);
    }
    // ... called elipsis
    static void num(int... a){
        for(int x: a){
            System.out.println(x);
        }
    }
}
