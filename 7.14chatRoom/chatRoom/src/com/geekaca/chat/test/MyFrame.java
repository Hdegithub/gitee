package com.geekaca.chat.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;

/**
 * 窗体
 */
public class MyFrame extends JFrame {

    public MyFrame() {
        File f = new File(getClass().getResource("/").getPath());
        System.out.println(f);
        URL imgUrl = MyFrame.class.getResource("/Snipaste_2023-07-13_14-27-53.png");
        ImageIcon imageIcon = new ImageIcon(imgUrl);
        JLabel label = new JLabel("确认");
        label.setIcon(imageIcon);
        label.setHorizontalAlignment(SwingConstants.HORIZONTAL);
        //文本输入框  显示
        JTextField textField = new JTextField("hello");
        JPasswordField passwordField = new JPasswordField();
        //输入密码时候显示的字符
        passwordField.setEchoChar('*');
        JButton btn = new JButton("确认");

        Container container = getContentPane();

        container.add(textField, BorderLayout.NORTH);
        btn.setIcon(imageIcon);
        container.add(passwordField);
        container.add(btn, BorderLayout.SOUTH);
        //设置按钮的点击响应   匿名内部类
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //按钮被点击，此函数会被调用，回调函数
                //获取文本框的输入的内容
                String text = textField.getText();
                System.out.println("输入内容是：" + text);
                System.out.println(passwordField.getPassword());
            }
        });

        setVisible(true);
        setBounds(277, 277, 500, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
