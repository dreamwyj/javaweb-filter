package com.kuang.listener;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestPlan {
    public static void main(String[] args){
        // 新建一个窗体
        Frame frame = new Frame("祝福23岁的你天天快乐");
        // 面板
        Panel panel = new Panel(null);
        // 设置窗体的布局
        panel.setLayout(null);

        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(0,200,255));
        // 设置背景颜色
        panel.setBounds(50,50,300,300);
        panel.setBackground(new Color(200,255,200));

        frame.add(panel);
        frame.setVisible(true);
        // 监听事件，监听关闭事件
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
    }
}
