package com.eomcs.net.ex12.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChatClient extends Frame {

  public ChatClient() {
    super("계산기");
    this.addWindowListener(new WindowAdapter() {

      @Override
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });

    this.setSize(400, 300);

    Panel topPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
    TextField addressTF = new TextField(30);
    topPanel.add(addressTF);

    TextField portTF = new TextField(4);
    topPanel.add(portTF);

    Button connetbtn = new Button("연결");
    topPanel.add(connetbtn);

    add(topPanel, BorderLayout.NORTH);

    TextArea messageListTa = new TextArea();
    add(messageListTa, BorderLayout.CENTER);

    Panel bottomPanel = new Panel();

    TextField messageTf = new TextField(40);
    bottomPanel.add(messageTf);

    Button sendBtn = new Button("보내기");
    bottomPanel.add(sendBtn);

    add(bottomPanel, BorderLayout.SOUTH);

    setVisible(true);
  }

  public static void main(String[] args) {
    new ChatClient();
  }
}
