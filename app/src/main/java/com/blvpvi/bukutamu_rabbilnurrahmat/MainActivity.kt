package com.blvpvi.bukutamu_rabbilnurrahmat

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nama = findViewById<EditText>(R.id.et_nama)
        val alamat = findViewById<EditText>(R.id.et_alamat)
        val kodePos = findViewById<EditText>(R.id.et_kodePos)
        val nomorTelepon = findViewById<EditText>(R.id.et_nomorTelepon)
        val jenisKelamin = findViewById<Spinner>(R.id.sp_jenisKelamin)
        val komentar = findViewById<EditText>(R.id.et_komentar)
        val simpan = findViewById<Button>(R.id.btn_simpan)
        val reset = findViewById<Button>(R.id.btn_reset)

        simpan.setOnClickListener {
            if (nama.text.toString().trim() == "" || alamat.text.toString()
                    .trim() == "" || kodePos.text.toString()
                    .trim() == "" || nomorTelepon.text.toString()
                    .trim() == "" || jenisKelamin.selectedItem.toString() == "" || komentar.text.toString()
                    .trim() == ""
            ) {
                Toast.makeText(applicationContext, "Semua Kolom Harus Diisi", Toast.LENGTH_SHORT)
                    .show()

            } else {
                Toast.makeText(applicationContext, "Semua Data Sudah Diisi", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        reset.setOnClickListener {
            nama.setText("")
            alamat.setText("")
            kodePos.setText("")
            nomorTelepon.setText("")
            komentar.setText("")
            jenisKelamin.setSelection(0)
        }
    }
}