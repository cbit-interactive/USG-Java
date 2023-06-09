package org.iiab.main;

import net.iiab.lukas.*;

public class Launcher {
    public static void main(String[] args){
        WindowManager windowMan = new WindowManager();
        windowMan.init();
        windowMan.run();
    }

}
