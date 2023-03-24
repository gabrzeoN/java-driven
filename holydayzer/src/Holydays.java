import java.util.HashMap;

public class Holydays {
  private HashMap<String, String> holydays = new HashMap<>();
  
  public Holydays(){
    this.holydays.put("01/01/2023", "Confraternização mundial");
    this.holydays.put("21/02/2023", "Carnaval");
    this.holydays.put("17/04/2023", "Páscoa");
    this.holydays.put("21/04/2023", "Tiradentes");
    this.holydays.put("01/05/2023", "Dia do trabalho");
    this.holydays.put("08/06/2023", "Corpus Christi");
    this.holydays.put("07/09/2023", "Independência do Brasil");
    this.holydays.put("12/10/2023", "Nossa Senhora Aparecida");
    this.holydays.put("02/11/2023", "Finados");
    this.holydays.put("15/11/2023", "Proclamação da República");
    this.holydays.put("25/12/2023", "Natal");
  }

  public String checkHolyday(String date) {
    if(!this.holydays.containsKey(date)){
      return "Não há feriado no dia " + date + "!";
    } 
    return "A data " + date + " refere-se ao " + this.holydays.get(date) + "!";
  }

  public HashMap<String, String> checkAll() {
    return this.holydays;
  }

}
