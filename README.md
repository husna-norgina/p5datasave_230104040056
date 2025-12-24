# 📱 Praktikum 5 — Menyimpan Data Sederhana (SharedPreferences & File Handling)

Praktikum ini membahas **penyimpanan data sederhana pada aplikasi Android** menggunakan **SharedPreferences (key–value)** dan **File Handling (internal storage)**. Fokus utama praktikum adalah memahami **persistensi data**, **penyimpanan preferensi pengguna**, **manajemen file (create, read, update, delete)**, serta **penerapan tema Dark Mode** yang tersimpan dan diterapkan ulang saat aplikasi dijalankan kembali.
Aplikasi dikembangkan menggunakan **Jetpack Compose** dengan pendekatan **Material Design 3 (MD3)**.

**Topik:** SharedPreferences, File Handling (Internal Storage), Data Persistence, Jetpack Compose, Material Design 3

---

## 🧑‍🎓 Informasi Mahasiswa

| Informasi          | Data                                                     |
| ------------------ |----------------------------------------------------------|
| Mata Kuliah        | Pemrograman Mobile                                       |
| Dosen Pengampu     | Muhayat, M.IT                                            |
| Praktikum / Proyek | P5 – Menyimpan Data Sederhana                            |
| Nama Mahasiswa     | Husna Norgina                                            |
| NIM                | 230104040056                                             |
| Kelas              | TI23B                                                    |
| Repo GitHub        | https://github.com/husna-norgina/p5datasave_230104040056 |
| Tanggal Praktikum  | 22-10-2025                                               |

---

## 🎯 Tujuan Praktikum

1. Memahami konsep **penyimpanan data sederhana** di Android.
2. Menggunakan **SharedPreferences** untuk menyimpan data **Name, NIM, Remember Me, dan Dark Mode**.
3. Melakukan operasi **save, load, dan clear data**.
4. Menerapkan **validasi input dasar** sebelum penyimpanan data.
5. Mengelola data menggunakan **File Handling** di internal storage.
6. Melakukan operasi **create, read, update, delete (CRUD)** pada file.
7. Menampilkan **daftar file tersimpan** dan memilih file untuk proses baca atau hapus.
8. Menangani error input dan file dengan feedback yang jelas.
9. Mendesain UI menggunakan **Jetpack Compose & Material Design 3**.
10. Memastikan **data tetap tersimpan** saat aplikasi ditutup, dibuka ulang, atau rotasi layar.

---

## 🛠 Tools & Environment

* Android Studio (Narwhal | 2025.1.1)
* Android SDK (compileSdk 35, targetSdk 35, minSdk 24)
* Bahasa pemrograman Kotlin
* Jetpack Compose & Material 3
* SharedPreferences (key–value storage)
* Android Emulator / Real Device
* Git & GitHub

---

## 🧱 Struktur Aplikasi

Aplikasi dikembangkan menggunakan **Jetpack Compose**, dengan struktur utama sebagai berikut:

* **Homescreen.kt** — Halaman utama aplikasi
* **SharedPreferenceScreen.kt** — Demo penyimpanan data SharedPreferences
* **FileHandlingScreen.kt** — Demo File Handling (CRUD file)
* **AboutScreen.kt** — Informasi aplikasi
* **Repository** — Pengelolaan SharedPreferences & File Handling
* **Theme (MD3)** — Light Mode & Dark Mode tersimpan
* **Bottom Navigation** — Navigasi antar halaman

---

## 🧩 Implementasi Praktikum

### 🔹 SharedPreferences

Digunakan untuk menyimpan data **Name, NIM, Remember Me**, serta **preferensi Dark Mode**.
Data dapat disimpan, dibaca kembali, dan dihapus melalui tombol **SAVE, READ, dan CLEAR**.

### 🔹 File Handling

Digunakan untuk menyimpan data ke **internal storage** dalam bentuk file teks.
Aplikasi mendukung operasi **create/update, read, delete**, serta menampilkan **daftar file tersimpan**.

### 🔹 Dark Mode Preference

Preferensi tema **Dark Mode** disimpan dan diterapkan ulang secara otomatis saat aplikasi dibuka kembali.

---

## 📸 Screenshot Praktikum

Berikut merupakan hasil implementasi aplikasi **Keva** pada **Praktikum 5 – Menyimpan Data Sederhana**:

**Gambar 1.** Screen Utama (Homescreen.kt)
![Screen Utama](evidence/1.%20Screen%20Utama%20(Homescreen.kt).jpg)

**Gambar 2.** SharedPreference Demo
![SharedPreference Demo](evidence/2.%20SharedPreference%20Demo.jpg)

**Gambar 3.** File Handling Demo
![File Handling Demo](evidence/3.%20File%20Handling%20Demo.jpg)

**Gambar 4.** About App
![About App](evidence/4.%20About%20App.jpg)

---

## 📄 Laporan Praktikum 5

[230104040056_Husna Norgina_P5.pdf](evidence/230104040056_Husna%20Norgina_P5.pdf)

> Semua screenshot dan laporan praktikum disimpan pada folder:  
> 📂 `./evidence/`

---

## 📊 Analisis Praktikum

* Penyimpanan data menggunakan SharedPreferences berjalan dengan baik.
* Data tetap tersimpan meskipun aplikasi ditutup atau perangkat dirotasi.
* File Handling berhasil mengelola file di internal storage.
* Validasi input mencegah data tidak valid tersimpan.
* Dark Mode tersimpan dan diterapkan secara konsisten.
* UI responsif dan sesuai Material Design 3.
* Aplikasi berjalan stabil pada emulator dan perangkat fisik.

---

## ✅ Kesimpulan

Berdasarkan hasil **Praktikum 5 – Menyimpan Data Sederhana**, dapat disimpulkan bahwa **SharedPreferences dan File Handling** merupakan solusi efektif untuk menyimpan data sederhana dan file pada aplikasi Android. Dengan dukungan **Jetpack Compose dan Material Design 3**, aplikasi memiliki tampilan yang modern, konsisten, serta mampu menjaga **persistensi data dan preferensi pengguna** secara optimal.

---

## 📌 Catatan

* Praktikum dikerjakan sesuai modul pembelajaran.
* Seluruh fitur berhasil diimplementasikan.
* Dokumentasi dilakukan secara sistematis melalui screenshot.
* Proyek ini dibuat untuk keperluan pembelajaran.

---

📝 *Disusun oleh Husna Norgina (230104040056) — Praktikum 5 Pemrograman Mobile*
