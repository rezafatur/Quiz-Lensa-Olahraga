// Muhammad Reza Faturrahman - 25019776262
// BINUS University
// Admin Quiz Lensa Olahraga

import java.util.Scanner;
import java.util.*;

class SoalQuiz{
    private int no_soal;
    private String nama_soal;
    private String jawaban_soal_a;
    private String jawaban_soal_b;
    private String jawaban_soal_c;
    private String jawaban_soal_d;
    private String jawaban_soal_benar;
    
    SoalQuiz(int no_soal, String nama_soal, String jawaban_soal_a, String jawaban_soal_b, String jawaban_soal_c, String jawaban_soal_d, String jawaban_soal_benar){
        this.no_soal = no_soal;
        this.nama_soal = nama_soal;
        this.jawaban_soal_a = jawaban_soal_a;
        this.jawaban_soal_b = jawaban_soal_b;
        this.jawaban_soal_c = jawaban_soal_c;
        this.jawaban_soal_d = jawaban_soal_d;
        this.jawaban_soal_benar = jawaban_soal_benar;
    }
    
    public int getNo_soal(){
        return no_soal;
    }
    public String getNama_soal(){
        return nama_soal;
    }
    public String getJawaban_soal_a(){
        return jawaban_soal_a;
    }
    public String getJawaban_soal_b(){
        return jawaban_soal_b;
    }
    public String getJawaban_soal_c(){
        return jawaban_soal_c;
    }
    public String getJawaban_soal_d(){
        return jawaban_soal_d;
    }
    public String getJawaban_soal_benar(){
        return jawaban_soal_benar;
    }
    
    public String toString(){
        return no_soal + " " + nama_soal + " " + jawaban_soal_a + " " + jawaban_soal_b + " " + jawaban_soal_c + " " + jawaban_soal_d + " " + jawaban_soal_benar;
    }
}

public class QuizLensaOlahraga{
    public static void main(String[] args){
        List<SoalQuiz> input_soal = new ArrayList<SoalQuiz>();
        Scanner input_int = new Scanner(System.in);
        Scanner input_string = new Scanner(System.in);
        int pilihan;
        int nomor = 0;
        
        do{
            System.out.println("=======================");
            System.out.println("| QUIZ LENSA OLAHRAGA |");
            System.out.println("=======================\n");
            System.out.println("========= MENU QUIZ ==========");
            System.out.println("| 1. Mulai Quiz              |");
            System.out.println("| 2. Tambah Soal Quiz        |");
            System.out.println("| 3. Hapus Soal Quiz         |");
            System.out.println("| 4. Update Soal Quiz        |");
            System.out.println("| 5. Tampilkan Soal Quiz     |");
            System.out.println("| 6. Kunci Jawaban Soal Quiz |");
            System.out.println("| 7. Keluar Program          |");
            System.out.println("==============================");
            System.out.print("Masukkan Pilihan Anda: ");
            pilihan = input_int.nextInt();
            
            System.out.print("\n");
            switch(pilihan){
                case 1: // Mulai Quiz
                    System.out.println("===== QUIZ LENSA OLAHRAGA =====");
                    if(nomor == 0){
                        System.out.println("|            EMPTY            |");
                    }
                    else{
                        float benar = 0;
                        float salah = 0;
                        float skor = 0;
                        String[] jawabanUser = new String[(int) nomor];
                        
                        for(int i = 0; i < nomor; i++){
                            System.out.println((i+1) + ". " + input_soal.get(i).getNama_soal() + "\n" + 
                            "   A. " + input_soal.get(i).getJawaban_soal_a() + "\n   B. " + input_soal.get(i).getJawaban_soal_b() + "\n" + 
                            "   C. " + input_soal.get(i).getJawaban_soal_c() + "\n   D. " + input_soal.get(i).getJawaban_soal_d());
                            System.out.print("Masukkan Jawaban Anda (A s/d D): ");
                            jawabanUser[i] = input_string.nextLine();
                            
                            if(input_soal.get(i).getJawaban_soal_benar().equals((jawabanUser[i].toUpperCase()))){
                                System.out.println("\nJawaban Anda benar!");
                                benar++;
                            }
                            else{
                                System.out.println("\nSalah. Jawaban yang benar adalah " + input_soal.get(i).getJawaban_soal_benar());
                                salah++;
                            }
                            System.out.print("\n");
                        }
                        System.out.print("====== JAWABAN & HASIL ======\n");

                        for(int j = 0; j < nomor; j++){
                            System.out.print((j+1) + ". " + jawabanUser[j].toUpperCase() + " -> ");
                                if(input_soal.get(j).getJawaban_soal_benar().equals((jawabanUser[j].toUpperCase()))){
                                    System.out.print("Benar");
                                }
                                else{
                                    System.out.print("Salah");
                                }
                                System.out.print("\n");
                            }
                        System.out.println("\nJawaban yang benar: " + String.format("%.0f", benar));
                        System.out.println("Jawaban yang salah: " + String.format("%.0f", salah));
                        System.out.println("Hasil: " + String.format("%.0f", ((benar/nomor) * 100)));
                    }
                    System.out.println("===============================");
                    break;
                case 2: // Tambah Soal Quiz
                    System.out.println("===== TAMBAH SOAL QUIZ =====");
                    nomor++;
                    System.out.println("Soal Quiz Nomor      : " + nomor);
                    System.out.print("Soal Quiz            : ");
                    String nama_soal = input_string.nextLine();
                    System.out.print("Pilihan Jawaban A    : ");
                    String pilihan_a = input_string.nextLine();
                    System.out.print("Pilihan Jawaban B    : ");
                    String pilihan_b = input_string.nextLine();
                    System.out.print("Pilihan Jawaban C    : ");
                    String pilihan_c = input_string.nextLine();
                    System.out.print("Pilihan Jawaban D    : ");
                    String pilihan_d = input_string.nextLine();
                    System.out.print("Pilihan Jawaban Benar: ");
                    String pilihan_benar = input_string.nextLine();
                    System.out.println("============================");
                    
                    input_soal.add(new SoalQuiz(nomor, nama_soal, pilihan_a, pilihan_b, pilihan_c, pilihan_d, pilihan_benar));
                    break;
                case 3: // Hapus Soal Quiz
                    boolean found = false;
                    System.out.println("===== HAPUS SOAL QUIZ =====");
                    System.out.println("| 1. Hapus Nomor Soal     |");
                    System.out.println("| 2. Hapus Semua          |");
                    System.out.println("===========================");
                    System.out.print("Masukkan Pilihan Anda: ");
                    int pilihan_hapus = input_int.nextInt();
                    
                    if(pilihan_hapus == 1){
                        System.out.print("Masukkan Nomor Soal Quiz: ");
                        int no_soal = input_int.nextInt();
                        
                        if(no_soal <= nomor && no_soal != 0){
                            input_soal.remove(no_soal - 1);
                            nomor--;
                            found = true;
                        }
                        
                        if(!found){
                            System.out.println("Nomor Soal " + no_soal + " Tidak Ditemukan");
                        }
                        else{
                            System.out.println("Nomor Soal " + no_soal + " Berhasil Dihapus");
                        }
                    }
                    else if(pilihan_hapus == 2){
                        if(nomor == 0){
                            System.out.println("Soal Quiz Belum Dibuat");
                        }
                        else{
                            input_soal.removeAll(input_soal);
                            System.out.println("Soal Quiz Berhasil Dihapus");
                            nomor = 0;
                        }
                    }
                    else{
                        System.out.println("Pilihan " + pilihan_hapus + " Tidak Tersedia");
                    }
                    break;
                case 4: // Update Soal Quiz
                    found = false;
                    System.out.println("===== UPDATE SOAL QUIZ =====");
                    System.out.print("Masukkan Nomor Soal Quiz: ");
                    int no_soal = input_int.nextInt();
                        
                    if(no_soal <= nomor && no_soal != 0){
                        System.out.println("Soal Quiz Nomor      : " + no_soal);
                        System.out.print("Soal Quiz            : ");
                        nama_soal = input_string.nextLine();
                        System.out.print("Pilihan Jawaban A    : ");
                        pilihan_a = input_string.nextLine();
                        System.out.print("Pilihan Jawaban B    : ");
                        pilihan_b = input_string.nextLine();
                        System.out.print("Pilihan Jawaban C    : ");
                        pilihan_c = input_string.nextLine();
                        System.out.print("Pilihan Jawaban D    : ");
                        pilihan_d = input_string.nextLine();
                        System.out.print("Pilihan Jawaban Benar: ");
                        pilihan_benar = input_string.nextLine();
                        
                        input_soal.set(no_soal - 1, new SoalQuiz(no_soal, nama_soal, pilihan_a, pilihan_b, pilihan_c, pilihan_d, pilihan_benar));
                        found = true;
                    }
                    
                    if(!found){
                        System.out.println("\nNomor Soal " + no_soal + " Tidak Ditemukan");
                    }
                    else{
                        System.out.println("\nNomor Soal " + no_soal + " Berhasil Diperbarui");
                    }
                    System.out.println("============================");
                    break;
                case 5: // Tampilkan Soal Quiz
                    System.out.println("===== SOAL QUIZ =====");
                    if(nomor == 0){
                        System.out.println("|       EMPTY       |");
                    }
                    else{
                        for(int i = 0; i < nomor; i++){
                            if(i == 0){
                                System.out.println((i+1) + ". " + input_soal.get(i).getNama_soal() + "\n" + 
                                    "   A. " + input_soal.get(i).getJawaban_soal_a() + "\n   B. " + input_soal.get(i).getJawaban_soal_b() + "\n" + 
                                    "   C. " + input_soal.get(i).getJawaban_soal_c() + "\n   D. " + input_soal.get(i).getJawaban_soal_d());
                            }
                            else if(nomor - i == 1){
                                System.out.println("\n" + (i+1) + ". " + input_soal.get(i).getNama_soal() + "\n" + 
                                    "   A. " + input_soal.get(i).getJawaban_soal_a() + "\n   B. " + input_soal.get(i).getJawaban_soal_b() + "\n" + 
                                    "   C. " + input_soal.get(i).getJawaban_soal_c() + "\n   D. " + input_soal.get(i).getJawaban_soal_d());
                            }
                            else{
                                System.out.println("\n" + (i+1) + ". " + input_soal.get(i).getNama_soal() + "\n" + 
                                    "   A. " + input_soal.get(i).getJawaban_soal_a() + "\n   B. " + input_soal.get(i).getJawaban_soal_b() + "\n" + 
                                    "   C. " + input_soal.get(i).getJawaban_soal_c() + "\n   D. " + input_soal.get(i).getJawaban_soal_d());
                            }
                        }
                    }
                    System.out.println("=====================");
                    break;
                case 6: // Kunci Jawaban Soal Quiz
                    System.out.println("===== KUNCI JAWABAN SOAL QUIZ =====");
                    if(nomor == 0){
                        System.out.println("|              EMPTY              |");
                    }
                    else{
                        for(int i = 0; i < nomor; i++){
                            System.out.print((i+1) + ". " + input_soal.get(i).getJawaban_soal_benar() + "\n");
                        }
                    }
                    System.out.println("===================================");
                    break;
            }
            System.out.print("\n");
        }while(pilihan != 7);
    }
}