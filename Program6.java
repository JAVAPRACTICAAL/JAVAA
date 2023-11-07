import java.awt.*;

import java.awt.event.*;



public class Program6 {

    public static void main(String args[]) {

        Frame f = new Frame("TEXT");

        Label l1, l2, l3, l4, l5;

        TextField t1, t2, t3, t4, t5;



        l1 = new Label("NAME:");

        l1.setBounds(40, 60, 65, 10);

        t1 = new TextField();

        t1.setBounds(110, 60, 300, 20);



        l2 = new Label("CITY:");

        l2.setBounds(45, 90, 60, 10);

        t2 = new TextField();

        t2.setBounds(110, 90, 300, 20);



        l3 = new Label("STREET:");

        l3.setBounds(25, 120, 65, 20);

        t3 = new TextField();

        t3.setBounds(110, 120, 300, 20);



        l4 = new Label("PIN CODE:");

        l4.setBounds(15, 150, 65, 20);

        t4 = new TextField();

        t4.setBounds(110, 150, 300, 20);



        l5 = new Label("PH.NO:");

        l5.setBounds(35 ,180 ,65 ,10);

        t5 = new TextField();

        t5.setBounds(110 ,180 ,300 ,20);



        Button b = new Button("GO");

        b.setBounds(70 ,210 ,170 ,30);



        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                t1.setText("praveenbabu");

                t2.setText("coimbatore");

                t3.setText("5a mainroad");

                t4.setText("641110");

            }

        });



        f.add(l1);

        f.add(t1);

        f.add(l2);

        f.add(t2);

        f.add(l3);

        f.add(t3);

        f.add(l4);

        f.add(t4);

        f.add(l5);

        f.add(t5);



  f.add(b);

  f.setSize(500 ,500);

  f.setLayout(null);

  f.setVisible(true);

    }

}