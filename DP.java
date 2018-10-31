/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author velma
 */
public class DP {
  static private Connection connection;
  public static Connection getConnection() throws Exception{
   
      if (connection == null){
      Class.forName("com.mysql.cj.jdbc.Driver");
      connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dorianproject","root","");
      }
      return connection;
  }
    private static void sleepThread(){
    try{
    
    Thread.sleep(5000);
    }
    catch(InterruptedException ex){
    System.out.println(ex.toString());
    }
    }
    
    
    public static void main(String[] args) {
        sleepThread();
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                loginform l=new loginform();
             l.setVisible(true);
             l.pack();
             l.setLocationRelativeTo(null);
             l.setDefaultCloseOperation(l.EXIT_ON_CLOSE);
            }
        });
         
    }
    
}
