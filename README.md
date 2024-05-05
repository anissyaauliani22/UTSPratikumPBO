# Penjelasan

Program ini merupakan simulasi manajemen karyawan yang memanfaatkan konsep-konsep OOP seperti Encapsulation, Inheritance, Polymorphism, dan Interface.P

Program dimulai dengan mendeklarasikan sebuah list daftarKaryawan yang akan menyimpan objek-objek karyawan.
Kemudian, tiga objek karyawan (dua programmer dan satu manajer) ditambahkan ke dalam list tersebut.
Setelah itu, program menampilkan daftar karyawan beserta informasi gaji pokok mereka.
Pengguna kemudian diminta untuk menghitung gaji karyawan atau tidak.
Jika pengguna memilih untuk menghitung gaji, program akan mengiterasi melalui setiap objek karyawan dan memanggil metode hitungGaji() pada masing-masing objek. Metode hitungGaji() akan menghitung dan menampilkan gaji sesuai dengan tipe karyawan (manager atau programmer).
Jika pengguna tidak ingin menghitung gaji, program akan menampilkan pesan terima kasih dan berakhir.

konsep-konsep dalam program yang telah dibuat:
Encapsulation:
Konsep encapsulation terlihat dalam pembuatan atribut-atribut kelas yang dideklarasikan sebagai private, seperti nama dan gajiPokok pada kelas Manager, serta nama dan gajiPokok pada kelas Programmer. Dengan demikian, atribut-atribut tersebut tidak dapat diakses secara langsung dari luar kelas, namun hanya dapat diakses melalui metode-metode publik yang disediakan.
Contoh: Atribut nama dan gajiPokok pada kelas Manager dan Programmer.


Inheritance:
Konsep inheritance terjadi saat class Manager dan Programmer mewarisi sifat dan perilaku dari interface Karyawan. Dengan demikian, kelas Manager dan Programmer memiliki akses ke metode yang didefinisikan dalam interface Karyawan.
Contoh: Manager dan Programmer mengimplementasikan interface Karyawan.

Polymorphism:
Polymorphism terjadi ketika objek kelas Manager dan Programmer dapat diperlakukan secara polimorfik sebagai objek Karyawan. Ini memungkinkan kita untuk menggunakan objek kelas Manager dan Programmer dengan cara yang sama seperti objek Karyawan.
Contoh: Dalam loop for-each di Main, kita memperlakukan setiap objek Karyawan (yang mungkin adalah objek Manager atau Programmer) secara seragam, menggunakan metode infoKaryawan() dan hitungGaji().

Interface:
Interface Karyawan digunakan untuk menetapkan perilaku yang diharapkan dari kelas-kelas yang menerapkannya. Dalam hal ini, setiap kelas yang mengimplementasikan interface Karyawan diharapkan memiliki metode infoKaryawan() dan hitungGaji().
Contoh: Interface Karyawan digunakan sebagai kontrak untuk kelas-kelas Manager dan Programmer, memastikan bahwa keduanya memiliki metode infoKaryawan() dan hitungGaji() yang sesuai.
