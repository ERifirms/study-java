package com.tutorial;

// Membuat tanpa construktor / class polos
class Polos {
  String dataString;
  int dataIntger;
}

// class dengan contruktor 
class Mahasiswa  {
  String nama;
  String NIM;
  String jurusan;

  // ini adalah cuntruktor dipanggil saat object pertamakali di buat
  // Mahasiswa(){
  //   System.out.println("ini adalah contructor");
  // }

  Mahasiswa(String inputNama, String inputNim, String inputJurusan) {
    nama = inputNama;
    NIM = inputNim;
    jurusan = inputJurusan;

    System.out.println(nama);
    System.out.println(NIM);
    System.out.println(jurusan);
  }

} 

public class Main {
  public static void main(String[] args) {

    Mahasiswa mahasiswa1 = new Mahasiswa("Erik", "3845736459345", "Teknik Peternakan");
    Mahasiswa mahasiswa2 = new Mahasiswa("Otong", "5674936594657", "Teknik Petetambangan");
     
    // Polos objePolos = new Polos();
    // objePolos.dataString = "polos";
    // objePolos.dataIntger = 0;

    // System.out.println(objePolos.dataString);
    // System.out.println(objePolos.dataIntger);

  }
}
