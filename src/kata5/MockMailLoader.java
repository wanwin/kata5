/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5;

/**
 *
 * @author usuario
 */
public class MockMailLoader implements MailLoader{
    
    @Override
    public Mail[] load(){
        Mail[] mails = new Mail[5];
        mails[0] = new Mail("prueba@hotmail.com");
        mails[1] = new Mail("prueba@yahoo.com");
        mails[2] = new Mail("prueba@yahoo.com");
        mails[3] = new Mail("prueba@gmail.com");
        mails[4] = new Mail("prueba@hotmail.com");
        return mails;
    }
    
    
}
