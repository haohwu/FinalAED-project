/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Customer;

/**
 *
 * @author whh
 */

import java.util.Properties;
import java.util.Random;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.PasswordAuthentication;
import javax.swing.JOptionPane;

public class EmailValidation {
     private static final String smtpHostName = "smtp.gmail.com"; 
    private static final String smtpPortNo = "587"; 
    private static StringBuilder emailMsgTxt ;
        
    private static String emailSubText = "Thank you!";
    private static String emailFromAdd = "pratik3336@gmail.com";
    private static String pass2="anefxfftsrnencxm";
    
    
      public static String generatePassword(String name)
    {
        try
        {
     StringBuilder sb = new StringBuilder();
     sb.append(name);
     System.out.println(">>>>password>>>>>"+sb.toString());
         return sb.toString();
        }
        catch(Exception e)
        {
          
        }
        return null;
    }
     public static String generateUserName(String name)
    {
        try
        {
         StringBuilder sb = new StringBuilder();
         sb.append(name);
        System.out.println(">>>>username>>>>"+sb.toString());
         return sb.toString();
    }
     catch(Exception e)
        {
            
        }
        return null;
    }
   public static boolean sendEmail(String msg, String emailId, String userName, String password) throws Exception
    {
        System.out.println("Preparing to send email");
      boolean isSent = true;

    try {
     Properties props =new Properties();
     props.put("mail.smtp.user",emailFromAdd );
        props.put("mail.smtp.host", smtpHostName);                                                        
        props.put("mail.smtp.auth", "true");  
        props.put("mail.smtp.starttls.enable","true");
        props.put("mail.smtp.password",password);
        props.put("mail.smtp.port", "465");
        props.setProperty ("mail.smtp.ssl.enable", "true");
        props.setProperty ("mail.smtp.localhost", "localhost"); // added this line
        props.setProperty ("mail.debug", "true"); // added this line

        
   System.out.println("debug 1");
        Session mailSession = Session.getInstance(props,new Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication(emailFromAdd,pass2);
            }
        });
        System.out.println("debug 2");
        Message message = new MimeMessage(mailSession);
        System.out.println("debug 3");
         InternetAddress fromAddress ;
        InternetAddress toAddress;
        try
           {
         fromAddress = new InternetAddress(emailFromAdd);
         toAddress = new InternetAddress(emailId);
         }
        
        catch (AddressException ae) {
            ae.printStackTrace();
         isSent= false;
         System.out.println("catch 1");
         return isSent;
         }
        System.out.println("debug 4");
        
        message.setFrom(fromAddress);
        message.setRecipient(RecipientType.TO, toAddress);
        System.out.println("debug 5");
        message.setSubject(emailSubText);
        message.setText(msg);
System.out.println("debug 6");
        Transport transport =mailSession.getTransport("smtps");
        
       transport.send(message);
       System.out.println("debug 9");
       transport.close();
       System.out.println("Email Sent !");
       isSent=true;
        } 
         catch (MessagingException mex) {
            isSent=false;
            System.out.println("catch 2");
            return isSent;
       }


         return isSent;
     
    }
    
    
    
    
}
