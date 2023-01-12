public class User {
  private String name;
  private String accountType;
  private Discipline favDiscipline;

  public User(String name, String accountType, Discipline favDiscipline){
    this.name = name;
    this.accountType = accountType;
    this.favDiscipline = favDiscipline;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getAccountType() {
    return accountType;
  }
  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }
  public Discipline getFavDiscipline() {
    return favDiscipline;
  }
  public void setFavDiscipline(Discipline favDiscipline) {
    this.favDiscipline = favDiscipline;
  }
}
