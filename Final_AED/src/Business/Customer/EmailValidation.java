
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
    private static String emailFromAdd = "poojari12345678901@gmail.com";
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
     
     
     
     
     
       public static void send(String to, String sub,String msg, final String user, final String pass) 
    {
        Properties props = new Properties();

        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");	
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        
        Session session = Session.getDefaultInstance(props,new Authenticator() 
        {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() 
            {
                return new PasswordAuthentication(user, pass);
            }
        });

        try 
        {
            Message message = new MimeMessage(session);
            
            message.setFrom(new InternetAddress(user));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(sub);
            message.setText(msg);

            Transport.send(message);
            
            JOptionPane.showMessageDialog(null,"Your request has been successfully raised and repesctive personnel has been notified via email");
            
        } catch (MessagingException e) 
        {
            JOptionPane.showMessageDialog(null,"Something happened! Please recheck your email address and request again.");
            
            throw new RuntimeException(e);
        }
        
    }
}
     
     
     
     
     
     
     
     
     
     
     
     


  