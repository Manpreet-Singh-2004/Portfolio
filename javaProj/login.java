import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

abstract class Login_mainPage {
    abstract void q();
}
class Login_Page extends Login_mainPage implements ActionListener{
    JFrame loginFrame = new JFrame();
    char c;
    JLabel loginTitle, loginPhoneNumberLabel, loginOTPLabel, loginERR;
    JButton loginSendOTPButton, loginButton, loginResendOTP, loginChangeNumber;
    JTextField Phone_number, loginOTPInput;
    int loginOTP, loginINTOTPInput = 0, k = 0;
    Random r = new Random(9999);


    @Override
    void q()
    {
        loginFrame.setVisible(true);
        loginFrame.setSize(360, 550);
        loginFrame.setLayout(null);
        loginFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        loginFrame.setTitle("Login Page");
//        loginF1.setIconImage(image.getImage());
        loginFrame.getContentPane().setBackground(new Color(255, 255, 255));

        Phone_number = new JTextField(12);
        loginOTPInput = new JTextField(7);

        loginSendOTPButton = new JButton("Send OTP");
        loginSendOTPButton.addActionListener(this::actionPerformed);
        loginButton = new JButton("Login");
        loginButton.addActionListener(this::actionPerformed);
        loginResendOTP = new JButton("Resend OTP");
        loginResendOTP.addActionListener(this::actionPerformed);
        loginChangeNumber = new JButton("Change Number");
        loginChangeNumber.addActionListener(this::actionPerformed);

        loginTitle = new JLabel("Welcome to BookMyShow!");
        loginPhoneNumberLabel = new JLabel("Phone Number: ");
        loginOTPLabel = new JLabel("Enter OTP: ");
        loginERR = new JLabel(" ");

        loginOTPLabel.setVisible(false);
        loginButton.setVisible(false);
        loginOTPInput.setVisible(false);
        loginResendOTP.setVisible(false);
        loginChangeNumber.setVisible(false);




        loginSendOTPButton.setBounds(100, 200, 150, 25);
        loginButton.setBounds(100, 300, 150, 25);
        loginResendOTP.setBounds(25, 200, 150, 25);
        loginChangeNumber.setBounds(175, 200, 150, 25);
        loginTitle.setBounds(100, 50, 150, 25);
        loginPhoneNumberLabel.setBounds(25, 150, 150, 25);
        loginOTPLabel.setBounds(25, 250, 150, 25);
        loginERR.setBounds(25, 350, 200, 25);
        Phone_number.setBounds(125, 150, 200, 25);
        loginOTPInput.setBounds(125, 250, 150, 25);

        loginFrame.add(loginSendOTPButton);
        loginFrame.add(loginButton);
        loginFrame.add(loginResendOTP);
        loginFrame.add(loginChangeNumber);
        loginFrame.add(loginTitle);
        loginFrame.add(loginPhoneNumberLabel);
        loginFrame.add(loginOTPLabel);
        loginFrame.add(loginERR);
        loginFrame.add(Phone_number);
        loginFrame.add(loginOTPInput);
    }

    @Override
    public void actionPerformed(ActionEvent loginAE)
    {
        if(loginAE.getSource() == loginSendOTPButton)
        {
            if (Phone_number.getText().length() == 10)
            {
                try
                {
                    for (int i = 0; i < 10 ; i++) {
                        String str = Phone_number.getText().toLowerCase();
                        c = str.charAt(i);

                        for (char j = 'a'; j <='z' ; j++) {
                            if (c==j || c==' '){
                                loginERR.setText("Please Enter a Valid Number");
                                loginSendOTPButton.setVisible(true);
                                loginButton.setVisible(false);
                                loginResendOTP.setVisible(false);
                                loginChangeNumber.setVisible(false);
                                loginOTPInput.setVisible(false);
                                loginOTPLabel.setVisible(false);
                                Phone_number.setEnabled(true);
                                Phone_number.setEditable(true);
                                Phone_number.setText("");
                                loginOTPInput.setText("");
                                k = 1;
                            }
                        }
                    }
                }
                catch (Exception e)
                {
                    System.out.print("");
                    loginERR.setText("Please Enter a Valid Number");
                }
                if (k == 0)
                {
                    loginOTP = r.nextInt(100000, 999999);
                    System.out.println("OTP is: " + loginOTP);
                    loginERR.setText("Please enter the OTP recieved.");
                    Phone_number.setEditable(false);
                    Phone_number.setEnabled(false);
                    loginSendOTPButton.setVisible(false);
                    loginResendOTP.setVisible(true);
                    loginOTPLabel.setVisible(true);
                    loginButton.setVisible(true);
                    loginOTPInput.setVisible(true);
                    loginChangeNumber.setVisible(true);
                }
            }
            else
            {
                loginERR.setText("Please Enter a Valid Number");
            }
            k = 0;
        }
        else if (loginAE.getSource() == loginButton)
        {
            try {
                loginINTOTPInput = Integer.parseInt(loginOTPInput.getText());
            }
            catch (Exception loginE)
            {
                loginERR.setText("Incorrect OTP");
                loginOTPInput.setText("");
            }

            if (loginINTOTPInput == loginOTP)
            {
                loginERR.setText("Logged in");
            }
            else
            {
                loginERR.setText("Incorrect OTP");
                loginOTPInput.setText("");
            }
        }
        else if (loginAE.getSource() == loginResendOTP)
        {
            System.out.println("OTP is: " + loginOTP);
            loginERR.setText("The OTP has been resent.");
        }

        else if (loginAE.getSource() == loginChangeNumber)
        {
            loginERR.setText("Please enter the contact number.");
            loginSendOTPButton.setVisible(true);
            loginButton.setVisible(false);
            loginResendOTP.setVisible(false);
            loginChangeNumber.setVisible(false);
            loginOTPInput.setVisible(false);
            loginOTPLabel.setVisible(false);
            Phone_number.setEnabled(true);
            Phone_number.setEditable(true);
            Phone_number.setText("");
            loginOTPInput.setText("");
            k = 0;
        }
    }

    public static void main(String[] args) {
        Login_Page a=new Login_Page();
        a.q();
    }
}
