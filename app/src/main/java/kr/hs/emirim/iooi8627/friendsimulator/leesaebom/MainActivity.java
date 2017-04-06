package kr.hs.emirim.iooi8627.friendsimulator.leesaebom;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static String TAG = "이새봄: Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate 메소드 호출");
        setContentView(R.layout.activity_main);
        Log.d(TAG, "activity_main 레이아웃 세팅");
    }

    void onClick (View view) {
        Log.d(TAG, "onClick 메소드 호출");
        Log.d(TAG, "클릭된 뷰 id:" + view.getId());
        switch (view.getId()) {
            case R.id.button1:
                Log.d(TAG, "버튼1 클릭");
                Toast.makeText(this, "너무 맛있어!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Log.d(TAG, "버튼2 클릭");
                Toast.makeText(this, "자퇴할 거야", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Log.d(TAG, "버튼3 클릭");
                Toast.makeText(this, "집 언제 가지", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Log.d(TAG, "버튼4 클릭");
                Toast.makeText(this, "너무 좋아!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                Log.d(TAG, "버튼5 클릭");
                Toast.makeText(this, "침착해!", Toast.LENGTH_SHORT).show();
                break;
            default:
                Log.d(TAG, "? 클릭");
                Toast.makeText(this, "다시 선택해 주세요", Toast.LENGTH_SHORT).show();
                break;
        }

        if (view.getId() == R.id.button1) {
            Toast.makeText(this, "작동해요", Toast.LENGTH_SHORT).show();
        }
        Log.d(TAG, "onClick 메소드 무사히 종료");
    }

}
