# 🚀 Keva Application

Aplikasi ini dibuat untuk **Praktikum P5 – Menyimpan Data Sederhana (SharedPreferences & File Handling)** pada mata kuliah **Pemrograman Mobile**, di bawah bimbingan **Bapak Muhayat, M.IT**.  
Tujuan utama proyek ini adalah mempraktikkan konsep **persistensi data sederhana** di Android menggunakan **SharedPreferences** dan **File Handling**, sekaligus membangun UI rapi dengan **Jetpack Compose + Material 3 (MD3)**.

---

## 👩‍💻 Identitas Mahasiswa
- **Nama:** Husna Norgina  
- **NIM:** 230104040056  
- **Kelas:** TI23B  
- **Tanggal Praktikum:** 22 Oktober 2025  

---

## 🎯 Tujuan Praktikum
1. Memahami konsep penyimpanan data sederhana di Android: SharedPreferences dan File Handling.  
2. Menggunakan SharedPreferences untuk save/load/clear data (Name, NIM, Remember, Dark Mode).  
3. Membangun Repository terstruktur agar SharedPreferences & File mudah dipakai dan diuji.  
4. Mengaitkan preferensi Dark Mode dengan Material 3 sehingga tersimpan dan diterapkan ulang saat app dibuka.  
5. Menerapkan validasi input dasar (wajib isi, NIM numerik) sebelum penyimpanan.  
6. Mengelola file di internal storage: create/update, read, delete, list file yang tersimpan.  
7. Menyediakan UI pemilihan file untuk aksi READ dan DELETE.  
8. Menangani error I/O (file tidak ada, format/izin) dan memberi feedback ke pengguna.  
9. Mendesain UI dengan Jetpack Compose (MD3) rapi, tombol jelas, Saved Data Preview, TopAppBar konsisten.  
10. Menguji persistensi & stabilitas state (restart app/rotasi) dan memastikan alur navigasi lancar.  

---

## 🧰 Alat & Bahan

### 🖥️ Perangkat Keras (Hardware)
- Laptop x64 (RAM ≥ 8 GB disarankan)  
- Smartphone Android (USB Debug aktif) atau Emulator Android  

### ⚙️ Perangkat Lunak (Software)
- Android Studio **Narwhal | 2025.1.1**  
- **JDK 17** (bawaan Android Studio)  
- Android SDK: `compileSdk = 35`, `targetSdk = 35`, `minSdk = 24`  
- Android Emulator (API 34/35) atau perangkat fisik  
- Git (opsional)  

### 📚 Library & Tools Pendukung
- **Jetpack Compose + Material 3**  
  - androidx.compose:compose-bom:2024.10.01  
  - androidx.activity:activity-compose:1.9.3  
  - androidx.compose.material3:material3  
  - androidx.compose.material:material-icons-extended  
- **Navigation Compose** → androidx.navigation:navigation-compose:2.8.3  
- **Lifecycle** → androidx.lifecycle:lifecycle-runtime-compose:2.8.6  
- **DataStore (Preferences)** → androidx.datastore:datastore-preferences:1.1.1  
- **Tooling (Debug)** → ui-tooling, ui-test-manifest  
- **Kompiler Compose:** `kotlinCompilerExtensionVersion = 1.5.14`  
- Build Features: `compose true`  

---

## 🗂️ Struktur Proyek
- Semua UI dibuat dengan **Jetpack Compose** (folder `layout/` tidak digunakan).  
- Fitur utama mencakup:  
  - **SharedPreferences Demo** → save/load/clear data (Name, NIM, Remember, Dark Mode)  
  - **File Handling Demo** → create/update, read, delete, list file  
  - **TopAppBar & About App** → UI konsisten dan rapi  
- State persisten via **SharedPreferences/DataStore**  
- Tema adaptif Light/Dark/System menggunakan Material 3  

---

## 🧠 Konsep yang Dipelajari
- SharedPreferences (key–value storage)  
- File Handling (I/O) di internal storage  
- Validasi input dasar (wajib isi, NIM numerik)  
- Dark Mode persistence  
- Jetpack Compose + Material 3 Implementation  
- Error handling & feedback pengguna  

---

## 🧩 Kesimpulan
1. Penyimpanan data sederhana di Android dapat dilakukan menggunakan **SharedPreferences** untuk data key–value seperti Name, NIM, Remember, dan Dark Mode.  
2. **File Handling** memungkinkan membuat, membaca, memperbarui, menghapus, dan menampilkan daftar file secara aman di internal storage.  
3. Validasi input sebelum penyimpanan penting untuk menjaga data valid.  
4. Preferensi seperti Dark Mode tersimpan dan diterapkan ulang saat app dibuka, meningkatkan pengalaman konsisten pengguna.  
5. UI dengan Jetpack Compose + Material 3 membuat aplikasi rapi, interaktif, adaptif, responsif, dan jelas dalam Saved Data Preview.  
6. Praktikum ini memperkuat pemahaman tentang **persistensi data dan manajemen file di Android secara modular, efisien, aman, stabil, dan sesuai praktik pengembangan terbaru**.  

---

📅 *Dibuat oleh Husna Norgina – Praktikum Pemrograman Mobile P5 (Keva Application)*
