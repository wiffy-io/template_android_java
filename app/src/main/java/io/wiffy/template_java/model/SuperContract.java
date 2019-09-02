package io.wiffy.template_java.model;

import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

interface SuperContract {

    interface WiffyObject{
        int console(String str);
        int console(String tag, String str);
    }

    abstract class SuperActivity extends AppCompatActivity implements WiffyObject {
        void toast(String str) {
            Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
        }

        void toast(int id) {
            Toast.makeText(getApplicationContext(), id, Toast.LENGTH_SHORT).show();
        }

        void toastLong(String str) {
            Toast.makeText(getApplicationContext(), str, Toast.LENGTH_LONG).show();
        }

        void toastLong(int id) {
            Toast.makeText(getApplicationContext(), id, Toast.LENGTH_LONG).show();
        }

        @Override
        public int console(String str) {
            return Log.d("'asdf", str);
        }

        @Override
        public int console(String tag, String str) {
            return Log.d(tag, str);
        }
    }
}
