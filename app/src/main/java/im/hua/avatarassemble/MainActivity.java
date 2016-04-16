package im.hua.avatarassemble;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import im.hua.avatarassemble.library.MultiAvatarView;

public class MainActivity extends AppCompatActivity {
    private List<String> avatarts = new ArrayList<>();

    private MultiAvatarView multiAvatarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        multiAvatarView = (MultiAvatarView) findViewById(R.id.multiAvatarView);


    }

    public void show1(View view) {
        setup(1);
    }

    public void show2(View view) {
        setup(2);
    }

    public void show3(View view) {
        setup(3);
    }

    public void show4(View view) {
        setup(4);
    }

    public void show5(View view) {
        setup(5);
    }

    public void show6(View view) {
        setup(6);
    }

    public void show7(View view) {
        setup(7);
    }

    public void show8(View view) {
        setup(8);
    }

    public void show9(View view) {
        setup(11);
    }

    private void setup(int avatarCounts) {
        avatarts.clear();
        for (int i = 0; i < avatarCounts; i++) {
            avatarts.add("http://imgsrc.baidu.com/forum/pic/item/98de8b0aece41a7f43a75b01.jpg");
        }
        multiAvatarView.setAvatarUrls(avatarts);
    }
}
