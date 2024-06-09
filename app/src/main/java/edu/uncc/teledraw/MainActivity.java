package edu.uncc.teledraw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Resources:
            https://www.youtube.com/watch?v=xGrOHLk60q8
            https://github.com/zahid-ali-shah/SignatureView
            https://stackoverflow.com/questions/40885860/how-to-save-bitmap-to-firebase#:~:text=To%20upload%20a%20file%20to,file%2C%20including%20the%20file%20name.&text=Once%20you've%20created%20an,the%20file%20to%20Firebase%20Storage.
            https://firebase.google.com/docs/storage/android/start


        Firebase Requirements:
            Authentication
            Firebase Firestore
                - Chatrooms
                    - (subcollection) Messages
                        - ImageURL
                        - Display Name
                        - Posted ID
                        - Posted Time
                - Users
                    - UID
                    - Display Name
                    - Name Color
                    - Dark/Light Preference????
            Storage (stores images)
                - Get bitmap from SignatureView
                - Convert or Compress in some way to reduce storage taken up
                - Create a folder i guess? idk how this works


         */
    }
}