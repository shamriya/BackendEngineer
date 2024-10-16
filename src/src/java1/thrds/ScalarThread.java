package java1.thrds;

import java.util.HashMap;

public class ScalarThread extends Thread {

        public static HashMap<String, String> map = new HashMap<>();
        private String target;

    ScalarThread(Runnable r){
            super(r);
            target = r.getClass().getName();
        }

        @Override
        public void start() {
            super.start();
            map.put(target, this.getName());
        }

}
