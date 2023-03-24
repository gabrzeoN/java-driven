public class App {
    public static void main(String[] args) throws Exception {

        Holydays holydays = new Holydays();
        System.out.println(holydays.checkHolyday("21/02/2023"));
        System.out.println(holydays.checkHolyday("02/02/2023"));
        System.out.println(holydays.checkHolyday("21/05/2023"));
        System.out.println(holydays.checkAll());
    }
}
