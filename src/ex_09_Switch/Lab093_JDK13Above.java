package ex_09_Switch;

public class Lab093_JDK13Above {
    public static void main(String[] args) {
        // in JDK > 13
        int itemCode = 002;
        switch (itemCode){
            case 001 -> System.out.println("Case001");
            case 002 -> System.out.println("Case002");
            case 003 -> System.out.println("Case003");
            default -> System.out.println("Default");
        }

    }
}