import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<String> name = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        boolean isContinue = true;
        String pilihanUser;

        name.add("A");
        name.add("M");
        name.add("I");
        name.add("R");
        
        while(isContinue){
            System.out.println("\n===================");
            System.out.println("\tARRAY");
            System.out.println("===================");
            System.out.println("1. Tampilkan array");
            System.out.println("2. isEmpty() => Cek apakah array kosong ");
            System.out.println("3. size()    => Cek size/ukuran elemen array");
            System.out.println("4. get()     => Mengambil nilai array");
            System.out.println("5. indexOf() => Menampilkan indeks elemen");
            System.out.println("6. remove()  => Menghapus elemen ke-");
            System.out.println("7. Add()  => Menambah elemen array");

            System.out.print("\nPilihan anda (1/2/3/4/5/6/7): ");
				pilihanUser = input.next();
				
				switch (pilihanUser) {
				case "1":
                    System.out.println(name);
					break;
				case "2":
                    System.out.println(name.isEmpty());
					break;
				case "3":
                    System.out.println(name);
                    System.out.println("Size array : " + name.size());
					break;
				case "4":
                    System.out.println(name.get(0));
                    System.out.println(name.get(2));
                    System.out.println(name.get(6));
                    System.out.println(name.get(-3)); 
                   
					break;
				case "5":
                    System.out.println(name.indexOf("a"));
                    System.out.println(name.indexOf("c"));
                    System.out.println(name.indexOf("q"));
					break;
                case "6":
                    System.out.println(name.remove(0));
                    System.out.println(name.remove(3));
                    System.out.println(name.remove(2));
                    System.out.println(name);
                    break;
                case "7":
                    name.add(0,"e");
                    name.add(2,"f");
                    name.add(3,"g");
                    name.add(4,"h");
                    name.add(6,"i");
                    name.add(-3,"j");
                    System.out.println(name);
                    break;
				default:
					System.out.println("\nInput anda tidak ditemukan\nSilakan pilih [1-7]");
				}
                
				System.out.print("\nApakah Anda ingin melanjutkan [y/n]? ");
				pilihanUser = input.next();
				isContinue = pilihanUser.equalsIgnoreCase("y");
			}
				
        }
      

}

