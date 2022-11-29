public class Main {
    public static void main(String[] args) {
      var manCool=78.2;
      var womanCool=82.7;
      var c=womanCool-manCool;
      System.out.println("разница в весе"+c+"кг");
      var over = (womanCool+manCool)%c;
      System.out.println (over);

    }
}