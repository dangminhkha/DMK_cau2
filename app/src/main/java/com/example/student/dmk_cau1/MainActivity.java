package com.example.student.dmk_cau1;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edt_TaiKhoan, edt_MatKhau;
    CheckBox check_Luu;
    Button btn_DangNhap,btn_Thoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_TaiKhoan = (EditText) findViewById(R.id.edt_TaiKhoan);
        edt_MatKhau = (EditText) findViewById(R.id.edt_MatKhau);

        check_Luu = (CheckBox) findViewById(R.id.check_Luu);
        btn_DangNhap = (Button) findViewById(R.id.btn_DangNhap);
        btn_Thoat = (Button) findViewById(R.id.btn_Thoat);

        btn_DangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (check_Luu.isChecked()) {
                    Toast.makeText(MainActivity.this, "Chào mừng bạn đã đăng nhập hệ thống, Thông tin của bạn đã được lưu", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Chào mừng bạn đã đăng nhập hệ thống, Thông tin của bạn không được lưu", Toast.LENGTH_SHORT).show();

                }
            }
        });
        btn_Thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mydia = new AlertDialog.Builder(MainActivity.this);
                mydia.setTitle("Thông báo");
                mydia.setMessage("Bạn muốn thoát không?");
                mydia.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                mydia.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                mydia.create().show();
            }
        });
    }
}
