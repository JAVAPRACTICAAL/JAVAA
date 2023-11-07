import javax.swing.*;

import java.awt.event.*;

public class NestedPopupMenu {

    JPopupMenu popupMenu;

    JMenuItem menuItem;



    public static void main(String[] args) {

        NestedPopupMenu nestedPopupMenu = new NestedPopupMenu();

    }



    public NestedPopupMenu() {

        JFrame frame = new JFrame("Creating a Popup Menu with Nested Menus");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");

        JMenu editMenu = new JMenu("Edit");



        JMenuItem fileItem1 = new JMenuItem("New");

        JMenuItem fileItem2 = new JMenuItem("Open");

        JMenuItem fileItem3 = new JMenuItem("Close");

        JMenuItem fileItem4 = new JMenuItem("Save");



        JMenuItem editItem1 = new JMenuItem("Cut");

        JMenuItem editItem2 = new JMenuItem("Copy");

        JMenuItem editItem3 = new JMenuItem("Paste");

        JMenuItem editItem4 = new JMenuItem("Insert");



        fileMenu.add(fileItem1);

        fileMenu.add(fileItem2);

        fileMenu.add(fileItem3);

        fileMenu.add(fileItem4);



        editMenu.add(editItem1);

        editMenu.add(editItem2);

        editMenu.add(editItem3);

        editMenu.add(editItem4);



        menuBar.add(fileMenu);

        menuBar.add(editMenu);



        frame.setJMenuBar(menuBar);



        popupMenu = new JPopupMenu();



        menuItem = new JMenuItem("Line up Icon");

        popupMenu.add(menuItem);



        menuItem = new JMenuItem("Refresh");

        popupMenu.add(menuItem);



        menuItem = new JMenuItem("Properties");

        popupMenu.add(menuItem);



        popupMenu.add(createSubMenu("New"));



        frame.addMouseListener(new MouseAdapter() {

            public void mouseReleased(MouseEvent mouseEvent) {

                if(mouseEvent.isPopupTrigger()) {

                    popupMenu.show(mouseEvent.getComponent(), mouseEvent.getX(), mouseEvent.getY());

                }

            }

        });



        frame.setSize(500, 500);

        frame.setVisible(true);

    }



    public JMenu createSubMenu(String title) {

        JMenu subMenu = new JMenu(title);



        subMenu.add("Folder");

        subMenu.add("Text Document");

        subMenu.add("Shortcut");



        return subMenu;

    }

}

