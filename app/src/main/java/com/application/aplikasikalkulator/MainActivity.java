package com.application.aplikasikalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView input1,input2,operator,result,notif;
    Button btHitung,btJumlah,btKurang,btBagi,btKali;

    private int operation= 0;
    private double HasilAkhir =0;
    private String Cek1 = "";
    private String Cek2 = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = (TextView) findViewById(R.id.editText);
        input2 = (TextView) findViewById(R.id.editText2);
        operator = (TextView) findViewById(R.id.operator);
        result = (TextView) findViewById(R.id.tampil_hasil);
        notif = (TextView) findViewById(R.id.notifikasi);



        btHitung = (Button) findViewById(R.id.btn_hitung);
        btJumlah = (Button) findViewById(R.id.btn_tambah);
        btKurang = (Button) findViewById(R.id.btn_kurang);
        btKali = (Button) findViewById(R.id.btn_kali);
        btBagi = (Button) findViewById(R.id.btn_bagi);
    }
public void  klikTambah(View view){
        operation = 1 ;
        operator.setText("+");
}
    public void  klikKurang(View view){
        operation = 2 ;
        operator.setText("-");
    }
    public void  klikBagi(View view){
        operation = 3 ;
        operator.setText(":");
    }
    public void  klikKali(View view){
        operation = 4 ;
        operator.setText("x");
    }

    public void KlikHasil (View view){
        Cek1 = input1.getText().toString();
        Cek2 = input2.getText().toString();

        if ((Cek1. equalsIgnoreCase(""))||(Cek2.equalsIgnoreCase("" ))){
            notif.setText("Masukkan angka");
        }
        else {
            double inputA = Double.parseDouble(input1.getText().toString());
            double inputB = Double.parseDouble(input2.getText().toString());

            switch (operation){
                case 1 :
                    HasilAkhir = inputA + inputB;
                    break;
                case 2 :
                    HasilAkhir = inputA - inputB;
                    break;
                case 3 :
                    HasilAkhir = inputA + inputB;
                    break;
                case 4 :
                    HasilAkhir = inputA / inputB;
                    break;

                case 0:
                    notif.setText("Pilih operasi perhitungan dahulu!");
                    break;

            }
            if(operation < 1){
                result.setText("0");
            }

            else{
                String hasilString = String.valueOf(HasilAkhir);
                result.setText(hasilString);
                notif.setText("Hasil :");
            }
        }


    }
    public void clear (View V){
        input1.setText("");
        input2.setText("");
        operator.setText("");
        result.setText("");
        notif.setText("");
        operation = 0;
    }

}