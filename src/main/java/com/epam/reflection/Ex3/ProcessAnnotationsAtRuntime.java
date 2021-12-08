package com.epam.reflection.Ex3;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class ProcessAnnotationsAtRuntime extends JFrame {

    JComponent cp = (JComponent) getContentPane();

    @Assign(to = "cp")
    JPanel p1 = new JPanel();
    @Assign(to = "cp")
    JPanel p2 = new JPanel();

    @Assign(to = "p1")
    JButton b1 = new JButton("Button 1");
    @Assign(to = "p2")
    JButton b2 = new JButton("Button 2");
    @Assign(to = "p1")
    JButton b3 = new JButton("Button 3");
    @Assign(to = "p2")
    JButton b4 = new JButton("Button 4");
    @Assign(to = "p2")
    JButton b5 = new JButton("Button 5");

    public ProcessAnnotationsAtRuntime() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cp.setLayout(new BoxLayout(cp, BoxLayout.Y_AXIS));
        try {
            locateComponents();
        } catch (Exception exc) {
            exc.printStackTrace();
        }
        this.pack();
        this.setVisible(true);
    }

    private void locateComponents() throws Exception {
        Class<? extends ProcessAnnotationsAtRuntime> clazz = this.getClass();
        for (Field f : clazz.getDeclaredFields()) {
            Assign annot = f.getAnnotation(Assign.class);
            if (annot == null) continue;

            System.out.println(annot);

            String contName = annot.to();
            Field contField = clazz.getDeclaredField(contName);
            Object outObject = contField.get(this);
            Method m = outObject.getClass().getMethod("add", Component.class);
            m.invoke(outObject, f.get(this));
        }
    }

    public static void main(String[] args) {
        new ProcessAnnotationsAtRuntime();
    }
}