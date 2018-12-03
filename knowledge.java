public class Case {
  int identifier; //tidak artinya, cuma buat identifikasi case nya aja.
  String jenis_depresi;
  String gejala;
  //misal String durasi gejala;

  public Case() {

  }

  @Override
  public String() { //kalau banyak pilihan nya, ntar pake String toString
    String result = "";
    if (this.identifier > 0) //kalau case nya banyak, pake ">"
    result += "identifier : " + this.identifier + "\n";
    result += "jenis_depresi : " + this.identifier + "\n";
    result += "gejala : " + this.identifier + "\n";

    return result;

  }

}
