public class Discipline {
  private String name;
  private String scope;
  private int classCount;

  public Discipline(String name, String scope, int classCount){
    this.name = name;
    this.scope = scope;
    this.classCount = classCount;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getScope() {
    return scope;
  }
  public void setScope(String scope) {
    this.scope = scope;
  }
  public int getClassCount() {
    return classCount;
  }
  public void setClassCount(int classCount) {
    this.classCount = classCount;
  }
  
}
