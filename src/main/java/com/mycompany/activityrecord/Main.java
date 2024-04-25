package com.mycompany.activityrecord;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
      StudentsList t = new StudentsList();
      String pass = JOptionPane.showInputDialog(null,"enter password");
      if (pass.equals("123")){
          t.show();
      }
      else{
          JOptionPane.showMessageDialog(null,"Wrong Password");
      }
    }
}
