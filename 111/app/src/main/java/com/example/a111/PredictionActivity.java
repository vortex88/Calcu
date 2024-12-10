package com.example.a111;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PredictionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prediction);

        // Находим TextView по его ID
        TextView predictionTextView = findViewById(R.id.predictionTextView);

        // Получаем предсказание из Intent
        String prediction = getIntent().getStringExtra("prediction");

        // Устанавливаем текст для TextView
        predictionTextView.setText(prediction);

        // Находим кнопку "Return" по её ID
        Button buttonReturn = findViewById(R.id.button_return);

        // Добавляем обработчик нажатия на кнопку "Return"
        buttonReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Возвращаемся на MainActivity
                Intent intent = new Intent(PredictionActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // Очищаем стек активностей
                startActivity(intent);
            }
        });

        // Находим кнопку "Exit" по её ID
        Button buttonExit = findViewById(R.id.button_exit);

        // Добавляем обработчик нажатия на кнопку "Exit"
        buttonExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Выходим из приложения
                finishAffinity();
            }
        });
    }
}