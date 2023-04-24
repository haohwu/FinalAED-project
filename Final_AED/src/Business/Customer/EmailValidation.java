package Business.Customer;

import java.util.Properties;
import javax.mail.Session;
import javax.mail.internet.*;
import javax.mail.*;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.swing.JOptionPane;

/**
 *
 * @author Pratik Poojari
 */
public class EmailValidation {

    private String to;
    private String from;
    private String textBody;
    private String host = "smtp.gmail.com";
    private String password;
    private String subject;
    private String emailId;

    public EmailValidation(String to, String message, String sub) {
        this.to = to;
        this.from = "bostonhospital1@gmail.com";
        this.textBody = message;
        this.password = "ivlxtxhupzaxvnwv";
        this.subject = sub;

    }

    public void sendEmail() {
        Properties properties = new Properties();
        properties.setProperty("mail.smtp.host", host);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.ssl.trust", "*");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        properties.put("mail.smtp.port", "587");

        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });
        try {
            Message message = new MimeMessage(session);

            message.setFrom(new InternetAddress(from));

            message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(subject);

            message.setContent(textBody, "text/html");

            Transport.send(message);
            System.out.println("Message Sent Successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }

    }
}
