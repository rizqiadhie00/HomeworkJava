public class StudyCase {
    public static void main(String[] args) {
        //Pembuatan var temporer untuk penampung perkalian argumen
        int temp = 1;
        for (int i = 0; i < args.length; i++) {
            //Kita ubah string menjadi Integer kemudian kali sejumlah panjang argumen
            temp = Integer.parseInt(args[i]) * temp;
        }
        //Cetak hasil perkalian dan cek apakah dia ganjil atau genap
        if((temp % 2) == 0)
        {
            System.out.println(temp + " - " + "Genap");
        }
        else
        {
            System.out.println(temp + " - " + "Ganjil");
        }      
      }
      }