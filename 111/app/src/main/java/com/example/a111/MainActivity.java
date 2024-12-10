package com.example.a111;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yourapp.BlurView;

public class MainActivity extends AppCompatActivity {

    // Добавляем массив предсказаний
    private String[] thePredictionsthemselves = new String[]{
            "Ваша энергия привлечет новых друзей, и каждый из них станет источником вдохновения.",
            "Готовьтесь к увлекательным приключениям в компании единомышленников!",
            "Скоро вы столкнетесь с приятным сюрпризом, который заставит вас улыбнуться. ",
            "Не упустите возможность поделиться радостью с окружающими!",
            "Удача сейчас на вашей стороне, и она приведет к захватывающим возможностям.",
            "Открывайте новые горизонты и смело двигайтесь вперед!",
            "Ваша креативность засияет, и вы найдете оригинальное решение для старой задачи. Это откроет двери к новым перспективам и успехам!",
            "Время, проведенное с близкими, наполнит ваше сердце теплом и радостью. Долгожданные встречи создадут незабываемые моменты.",
            "Сегодня вы сможете увидеть красоту в простых вещах, и это принесет вам глубокое удовлетворение. Наполнитесь вдохновением и делитесь своим светом с окружающими!",
            "Простой жест доброты изменит чью-то жизнь к лучшему. Ваша щедрость вернется к вам, преумноженной в самых неожиданных формах!",
            "Вас ждет радостное событие, которое сблизит вас с важными людьми. Примите его с открытым сердцем и наслаждайтесь каждым мгновением!",
            "На горизонте замаячит новая возможность, которая потрясет ваши ожидания. Действуйте смело, и вы будете вознаграждены!",
            "Ваша уверенность в себе возрастет, и вы сможете преодолеть любые преграды. Никакие сомнения не смогут остановить ваш успех!",
            "В ближайшие дни вы получите приятные новости, которые поднимут вам настроение. Делитесь радостью с друзьями, и она увеличится еще больше!",
            "Ваши мечты начинают воплощаться в реальность, и это захватывающе. Позвольте своему воображению вести вас к новым высотам!",
            "Ваша доброта и забота о других станут залогом гармонии в жизни. Давайте вместе создавать мир, полный любви и поддержки!",
            "События недавнего времени расставят все по своим местам и принесут ясность. Используйте это понимание для дальнейших шагов к успеху!",
            "Новые знакомства подарят вам неожиданные перспективы и идеи. Не бойтесь открываться и делиться мыслями!",
            "Внутренний покой станет вашим спутником на этом пути. Слушайте свое сердце и следуйте за ним, счастье не заставит себя ждать.",
            "Ваша способность видеть лучшее в людях будет вознаграждена. Окружите себя позитивными людьми и умножайте эту искреннюю атмосферу!",
            "Предстоит возможность путешествий или новых открытий, которые обогатят ваш опыт. Позвольте себе исследовать неизведанное!",
            "Ожидайте момент, когда ваша работа будет оценена по достоинству. Ваши усилия наконец окупятся, и вы это заслужили!",
            "Ваша интуиция подскажет вам правильный путь, доверяйте ей. Открывшись новым возможностям, вы найдете свое истинное призвание!",
            "В ближайшие дни ваши усилия начнут приносить заметные результаты. Следите за новыми возможностями, которые откроются благодаря вашему трудолюбию!",
            "Встретите человека, который станет для вас важным наставником. Его советы откроют новые горизонты и вдохновят на свершения!",
            "Ваше открытое сердце привлечет в жизнь настоящую любовь. Позвольте себе счастье и наслаждайтесь взаимопониманием!",
            "Неожиданная встреча в знакомом месте может изменить ваш день к лучшему.",
            "Будьте готовы к приятным разговорам и новым идеям!",
            "Вы найдете баланс между работой и отдыхом, что подарит вам новые силы. Берите паузу и радуйтесь мелочам!",
            "Ожидайте волнение, связанное с осуществлением давней мечты. Верьте в себя, и вы добьетесь своего!",
            "Ваша способность к эмпатии создаст теплую атмосферу вокруг вас. Люди будут тянуться к вашей искренности и доброте!",
            "Скоро вы получите возможность улучшить свои навыки или изучить что-то новое. Позвольте знаниям обогатить вашу жизнь!",
            "Ваш оптимизм заразителен и вдохновляет окружающих. Делитесь позитивом и будьте примером для подражания!",
            "Предстоит легкое и веселое событие, которое добавит ярких красок в ваши будни. Не упустите возможность насладиться моментом!",
            "Принятие себя таким, какой вы есть, станет вашим сильным козырем. Эта новая уверенность откроет перед вами двери успеха!",
            "Готовьтесь к интересным предложениям, которые могут изменить ваше положение. Будьте настойчивы и не бойтесь наставить свои границы!",
            "Ваша позитивная энергия сделает серые будни более яркими. Направьте этот поток на создание чего-то удивительного!",
            "Ожидайте креативного прорыва, который сделает вашу работу более увлекательной. Позвольте своим идеям свободно развиваться!",
            "Приятные мелочи будут наполнять каждый ваш день, поднимая настроение. Замечайте детали, которые делают жизнь ярче!",
            "Ваша душевная мудрость поможет вам стать надежным другом. Поддержите близкого человека в трудный момент, и эта связь станет еще крепче.",
            "Встреча с давним другом напомнит о лучших моментах. Разговоры о прошлом вдохнут в вас новые идеи!",
            "Удача улыбнется вам в финансовых вопросах, принося неожиданные бонусы. Верьте в свои возможности и действенно двигайтесь к цели.",
            "Разрешите себе мечтать и строить планы на будущее. С каждым днем у вас будет всё больше оснований верить в свои стремления!",
            "Ваша приверженность здоровому образу жизни принесет не только физическую силу, но и внутреннее спокойствие. Заботьтесь о себе, и вы увидите плоды своего труда!"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Добавляем обработчик нажатия на кнопку
        Button getPredictionButton = findViewById(R.id.get_prediction);
        getPredictionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Выбираем случайное предсказание
                int randomIndex = (int) (Math.random() * thePredictionsthemselves.length);
                String theMagicBall = thePredictionsthemselves[randomIndex];
                Intent intent = new Intent(MainActivity.this, PredictionActivity.class);
                intent.putExtra("prediction", theMagicBall);
                startActivity(intent);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Создаем размытое изображение
        BlurView blurView = findViewById(R.id.blurView);
        ImageView blurImageView = findViewById(R.id.blurImageView);
        Bitmap bitmap = blurView.getBitmap();

        // Применяем размытие вручную
        Bitmap blurredBitmap = applyGaussianBlur(bitmap, 25);
        blurImageView.setImageBitmap(blurredBitmap);
    }

    private Bitmap applyGaussianBlur(Bitmap src, int radius) {
        if (src == null) return null;

        int width = src.getWidth();
        int height = src.getHeight();
        Bitmap output = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(output);
        Paint paint = new Paint();
        paint.setFlags(Paint.FILTER_BITMAP_FLAG);

        // Gaussian kernel
        float[] kernel = createGaussianKernel(radius);

        // Apply horizontal blur
        Bitmap tempBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas tempCanvas = new Canvas(tempBitmap);
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                float r = 0, g = 0, b = 0, a = 0;
                for (int i = -radius; i <= radius; i++) {
                    int pixelX = Math.min(Math.max(x + i, 0), width - 1);
                    int pixel = src.getPixel(pixelX, y);
                    float weight = kernel[i + radius];
                    r += Color.red(pixel) * weight;
                    g += Color.green(pixel) * weight;
                    b += Color.blue(pixel) * weight;
                    a += Color.alpha(pixel) * weight;
                }
                tempCanvas.drawPoint(x, y, new Paint(Color.argb((int) a, (int) r, (int) g, (int) b)));
            }
        }

        // Apply vertical blur
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                float r = 0, g = 0, b = 0, a = 0;
                for (int i = -radius; i <= radius; i++) {
                    int pixelY = Math.min(Math.max(y + i, 0), height - 1);
                    int pixel = tempBitmap.getPixel(x, pixelY);
                    float weight = kernel[i + radius];
                    r += Color.red(pixel) * weight;
                    g += Color.green(pixel) * weight;
                    b += Color.blue(pixel) * weight;
                    a += Color.alpha(pixel) * weight;
                }
                canvas.drawPoint(x, y, new Paint(Color.argb((int) a, (int) r, (int) g, (int) b)));
            }
        }

        return output;
    }

    private float[] createGaussianKernel(int radius) {
        int size = radius * 2 + 1;
        float[] kernel = new float[size];
        float sigma = radius / 3.0f;
        float twoSigmaSquare = 2.0f * sigma * sigma;
        float sigmaRoot = (float) Math.sqrt(twoSigmaSquare * Math.PI);
        float sum = 0;

        for (int i = -radius; i <= radius; i++) {
            float distance = i * i;
            int index = i + radius;
            kernel[index] = (float) Math.exp(-distance / twoSigmaSquare) / sigmaRoot;
            sum += kernel[index];
        }

        for (int i = 0; i < size; i++) {
            kernel[i] /= sum;
        }

        return kernel;
    }
}