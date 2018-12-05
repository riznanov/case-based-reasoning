import java.io.*;
import java.util.*;
import static java.lang.System.*;

public class Main{
  public static ArrayList<Case> case = new arrayList<>();
  public static HashMap<String, Integer> weights = new HashMap<>();

  //inputan
  public static HashSet<String> jenis_depresi = new HashSet<>();
  public static HashSet<String> gejala = new HashSet<>();

  //fungsi utama
  public static void ConstructCase(){
    try { //gatau ini bener apa engga, bahasa masih ngikut python
      String filename = "your_databas"; //manggil data mu, pake database atau csv
      Scanner s = new Scanner(new file(filename));
      Case c;
      while(s.hasNext()) { //panggil case pertama, identifier

        int num = Integer.parseInt(s.next().trim());
        c.identifier = num;

        while(!(s.next().equals("Jenis Depresi"))); //panggil case kedua
        c.jenis_depresi = s.next().trim();
        jenis_depresi.add(c.jenis_depresi.toLowerCase()); //kalau mau skip ahead ke case selanjutnya

        while(!(s.next().equals("Gejala")));
        c.gejala = s.next().trim();
        gejala.add(c.gejala.toLowerCase());

        case.add(c);

    }

    s.close();

  }

  public static void ConstructWeigth() { //ini yang masih belum aku ketahui, tapi ini itu sebenernya kalau di contoh seperti : misal perusahan X punya aset 10 miliar dengan gejala G1,G5 dst
    int jenis_depresi = 0,25 ;
    int gejala = 0,75;

    weights.put("Jenis Depresi", jenis_depresiWeight);
    weights.put("Gejala", gejalaWeight);
  }

  private static Case obtainWeight() {
    Case user = new Case();
    try {
      System.out.println("----");
      System.out.println("Tekan Enter untuk skip ahead");
      System.out.println("----");

      System.out.println("Jenis depresi apa yang anda alami?"):
      System.out.println("(Opsi:");
      Scanner s = new Scanner(System.in);
      user.jenis_depresi = s.nextline().trim();

      //buat gejala
      System.out.println("Gejala nya apa saja?"):
      System.out.println("(Opsi: 20 opsi bisa)");
      Scanner s = new Scanner(System.in);
      user.gejala = s.nextline().trim();

    }

    return user;
  }

  private static double similarity(Case c, Case user) { //panggil kembali fungsi yang udah dipilih buat dihitung similaritas nya
    double total;

    double jenis_depresi = jenis_depresiSimilarity(c, user);
    double gejala = gejalaSimilarity(c, user);

    int totalWeight =

    int jenis_depresiWeight = weights.get("Jenis Depresi"); //panggil kembali variabel weights tadi
    int gejalaWeight = weights.get("Gejala");

    totalWeight += jenis_depresiWeight;
    totalWeight += gejalaWeight;

    total = (jenis_depresiSimilarity * jenis_depresiWeight + gejalaSimilarity * gejalaWeight) / totalWeight;

    return total;

  }

  //similarity universal
  private static void returnResults(ArrayList<Map.Entry<Double, Case>> topCases) {
        System.out.println();
        System.out.println("-----");
        System.out.println("Similaritas tertinggi " + numTopCases + " gejala: ");
        for (Map.Entry c : topCases) {
            String simString = c.getKey() + "";
            double simDouble = Double.parseDouble(simString);
            System.out.printf("Tingkat Similaritas: %.2f \n", simDouble);
            System.out.println(c.getValue().toString());
        }
    }

  //jenis depresi similarity
  private static double jenis_depresiSimilarity(Case c, Case user) {
    double similarity=0.0

    //mengembalikan nilai 0 jika input tidak valid
    if (user.jenis_depresi.length() == 0)
        return similarity;

    String caseType = c.jenis_depresi.toLowerCase();
    String userType = user.jenis_depresi.toLowerCase();

    if (!jenis_depresi.contains(user.jenis_depresi.toLowerCase())){
          String mostSimilarWord =  findMostSimilarInput(userType, jenis_depresi);
          userType = mostSimilarWord;
        }

    HashMap<String, Integer> typeKeys = constructTypeHashMap();
    double[][] matrix = constructTypeMatrix();

    //ada fungsi yang kurang disini buat jadikan nilai similarity dalam bentuk matriks

    similarity = matrix[][]

    return similarity;
  }


    public static void main(String[] args) {
  	   constructCases();
       constructWeights();

       System.out.println("Aku dapat membantu kamu");
       boolean finish = false;

       while (!finish) {
          Case user = obtainCase();
          ArrayList<Map.Entry<Double, Case>> topCases = retrieveCases(user);
          returnResults(topCases);
          System.out.println("Mau mengecek kembali?");
          System.out.println("(Ya/Tidak)");
          Scanner s = new Scanner(System.in);
          String item = s.next();
