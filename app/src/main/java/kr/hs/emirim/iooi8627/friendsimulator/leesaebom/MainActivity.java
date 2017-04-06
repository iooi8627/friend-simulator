package kr.hs.emirim.iooi8627.friendsimulator.leesaebom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void onClick (View view) {
        switch (view.getId()) {
            case R.id.button1:
                Toast.makeText(this, "너무 맛있어!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(this, "자퇴할 거야", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Toast.makeText(this, "집 언제 가지", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Toast.makeText(this, "너무 좋아!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                Toast.makeText(this, "침착해!", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(this, "다시 선택해 주세요", Toast.LENGTH_SHORT).show();
                break;
        }

        if (view.getId() == R.id.button1) {
            Toast.makeText(this, "작동해요", Toast.LENGTH_SHORT).show();
        }
    }

}
