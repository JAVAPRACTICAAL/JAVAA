import java.awt.*;

import java.awt.event.*;

import java.applet.*;



public class ListDemo extends Applet implements ActionListener {

    List operatingSystem, browser;

    String message = "";



    public void init() {

        operatingSystem = new List(4, true);

        browser = new List(4, false);



        operatingSystem.add("WINDOWS 98/XP");

        operatingSystem.add("WINDOWS NT/2000");

        operatingSystem.add("SOLARIS");

        operatingSystem.add("MACOS");



        browser.add("NETSCAPE 3.X");

        browser.add("NETSCAPE 4.X");

        browser.add("NETSCAPE 5.X");

        browser.add("NETSCAPE 6.X");

        browser.add("INTERNET EXPLORER 4.0");

        browser.add("INTERNET EXPLORER 5.0");

        browser.add("INTERNET EXPLORER 6.0");

        browser.add("LYNX 2.4");



        browser.select(1);



        add(operatingSystem);

        add(browser);



        operatingSystem.addActionListener(this);

        browser.addActionListener(this);

    }



    public void actionPerformed(ActionEvent oc) {

        repaint();

    }



    public void paint(Graphics g) {

        int[] indexes;

        message = "CURRENT OS: ";



        indexes = operatingSystem.getSelectedIndexes();



        for(int i = 0; i < indexes.length; i++) {

            message += operatingSystem.getItem(indexes[i]) + " ";

        }



        g.drawString(message, 6, 120);



        message = "CURRENT BROWSER: ";



        message += browser.getSelectedItem();



        g.drawString(message, 6, 100);

    }

}

/*<applet code="ListDemo.class" width="375" height="200">

</applet>*/