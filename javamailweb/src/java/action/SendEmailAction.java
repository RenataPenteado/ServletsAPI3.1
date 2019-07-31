package action;

import util.CommonsEmailSender;
import model.SmtpServer;
import util.JavaMailUtil;

public class SendEmailAction {
    public void sendEmail(String smtpHost, int smtpPort,
            String userName, String password, String to, 
            String subject, String message) throws Exception {
        
//        JavaMailUtil javaMailUtil = new JavaMailUtil();
//        javaMailUtil.sendEmail(userName, password, to, subject, message);
       
        
        CommonsEmailSender sender = new CommonsEmailSender();
        SmtpServer smtpServer = new SmtpServer(smtpHost,
                smtpPort, userName, password);
        String[] toEmails = {to};
        sender.sendEmail(smtpServer, userName, 
                toEmails, null, null,
                subject, message);
        
        
    }
}
