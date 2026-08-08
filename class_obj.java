class calculator {
    public int add(int a, int b) {
        return a + b;
    }
}
public class class_obj {
    public static void main(String[] args) {
        int num1=2;
        int num2=3;
        
        calculator calc=new calculator();
        int result=calc.add(num1,num2);
        System.out.println("Result: " + result);
    }
}
