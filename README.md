# ButterknifeEx

[Android & Java] Butterknife - Binding widget library sample source project


[Image1 : Binding with widget & event function]

<div>
<img src="https://github.com/DonggeunJung/ButterknifeEx/blob/master/ButterknifeEx_Capture.png?raw=true width="400px"></img>
</div>


< Used Android API >
1. Butterknife


< Making source project sequence >

# Add library
 = build.gradle (Module : app)

dependencies {
    ~

    implementation 'com.jakewharton:butterknife:8.5.1'
    annotationProcessor 'com.jakewharton:butterknife-compiler:8.5.1'
}

= build.gradle (Project: <Project name>)

buildscript {
    repositories {
        ~
    }
    dependencies {
        ~
        classpath 'com.jakewharton:butterknife-gradle-plugin:8.5.1'
    }
}


# Source code

import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindString;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.textView1) TextView textView1;
    @BindView(R.id.button1) Button button1;
    @BindView(R.id.button2) Button button2;
    @BindString(R.string.message) String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        textView1.setText(message);
    }

    @OnClick({R.id.button1, R.id.button2})
    public void onButtonClick(View v) {
        String strMessage = (v.getId() == R.id.button1) ? "Button-1" : "Button-2";
        Toast.makeText(this, strMessage + " clicked", Toast.LENGTH_SHORT).show();
    }

}



< Additional Infomation >

GitHub Link : https://github.com/DonggeunJung/ButterknifeEx

Download APK file : none

Any question => Email : topsan72@gmail.com / Author : Donggeun Jung (Dennis)




