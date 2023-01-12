public class App {
  public static void main(String[] args) throws Exception {
    Discipline calculus = new Discipline("Calculus", "Math", 324);
    User user = new User("Gabriel", "premium", calculus);
    String txt = "My name is " + user.getName() + " and my favorite discipline is " + user.getFavDiscipline().getName() + "!";
    System.out.println(txt);
    }
}
