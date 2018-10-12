package developersancho.looperandhandler;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Worker worker;
    private SimpleWorker simpleWorker;
    private TextView text_message;
    private Handler handler = new Handler(Looper.getMainLooper()) {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            text_message.setText((String) msg.obj);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text_message = findViewById(R.id.text_message);

        /*simpleWorker = new SimpleWorker();
        simpleWorker.execute(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Message message = Message.obtain();
            message.obj = "Task 1 completed";
            handler.sendMessage(message);
        }).execute(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Message message = Message.obtain();
            message.obj = "Task 2 completed";
            handler.sendMessage(message);
        }).execute(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Message message = Message.obtain();
            message.obj = "Task 3 completed";
            handler.sendMessage(message);
        }).execute(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Message message = Message.obtain();
            message.obj = "Task 4 completed";
            handler.sendMessage(message);
        }).execute(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Message message = Message.obtain();
            message.obj = "Task 5 completed";
            handler.sendMessage(message);
        });*/

        worker = new Worker();
        worker.execute(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Message message = Message.obtain();
            message.obj = "Task 1 completed";
            handler.sendMessage(message);
        }).execute(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Message message = Message.obtain();
            message.obj = "Task 2 completed";
            handler.sendMessage(message);
        }).execute(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Message message = Message.obtain();
            message.obj = "Task 3 completed";
            handler.sendMessage(message);
        }).execute(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Message message = Message.obtain();
            message.obj = "Task 4 completed";
            handler.sendMessage(message);
        }).execute(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Message message = Message.obtain();
            message.obj = "Task 5 completed";
            handler.sendMessage(message);
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //simpleWorker.quit();
    }
}
