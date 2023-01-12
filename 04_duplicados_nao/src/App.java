public class App {
  public static void main(String[] args) throws Exception {
    String[] frutas1 = {"Morango", "Uva", "Acerola", "Manga"};
    String[] frutas2 = {"Pera", "Caju", "Morango", "Kiwi"};
    for(int i = 0; i < frutas1.length; i++){
      for(int j = 0; j < frutas1.length; j++){
        if(frutas1[i] == frutas2[j]) System.out.println(frutas1[i]);
      }
    }
  }
}
