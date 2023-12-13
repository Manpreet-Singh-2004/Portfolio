//package Project;
//
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class Print {
//
//    public static class print extends JFrame implements ActionListener
//    {
//        JFrame print;
//        JLabel Enter_phone, Info, verify;
//        JTextField Input_phone;
//        JButton Check_phone, Download_receipt;
//
//        //Checking if its working
//        int Phone_number = 10;
//        print ()
//        {
//            print = new JFrame();
//            print.setVisible(true);
//            print.setLayout(null);
//            print.setSize(500, 500);
//            print.setDefaultCloseOperation(EXIT_ON_CLOSE);
//            print.setTitle("Recipt");
//
//            Enter_phone = new JLabel("Enter your Phone number: ");
//            Enter_phone.setBounds(10, 10, 200, 50);
//
//            Input_phone = new JTextField();
//            Input_phone.setBounds(230, 10, 90, 40);
//
//            Check_phone = new JButton("Submit");
//            Check_phone.setBounds(180, 70, 100, 40);
//            Check_phone.addActionListener(this::actionPerformed);
//
//            Info = new JLabel(" ");
//            Info.setBounds(10, 100, 400, 300);
//
//            Download_receipt = new JButton("Download receipt");
//            Download_receipt.setBounds(180, 350, 100, 50);
//            Download_receipt.addActionListener(this::actionPerformed);
//
//            verify = new JLabel(" ");
//            verify.setBounds(180, 400, 100, 50);
//
//            print.add(Enter_phone);
//            print.add(Input_phone);
//            print.add(Check_phone);
//            print.add(Info);
//            print.add(Download_receipt);
//            print.add(verify);
//        }
//
//        @Override
//        public void actionPerformed(ActionEvent print) {
//            if (print.getSource() == Check_phone) {
//                int number = Integer.parseInt(Input_phone.getText());
//                if (number == Phone_number) {
////                Phone_number is the number that the user have
//
//                Info.setText("Phone number: "+Phone_number+"\n"+"Total price: "+totalPrice+"\n"+"Total number of total number of seats: "+ totalSeats +"\n"+"Location: "+ Location +"\n"+"Cinema: "+ Cinema);
////                    Info.setText("Info");
//                }
//                else
//                {
//                    Info.setText("Invalid Phone Number");
//                    Input_phone.setText(null);
//                }
//
//                if (print.getSource() == Download_receipt)
//                {
//                    try(BufferedWriter writer = new BufferedWriter(new FileWriter("Receipt.txt"))){
//
////                        Change Accordingly
//
//                        writer.write("Phone number: "+ Phone_number +"\n");
//                        writer.write("Total Cost: "+ totalPrice +"\n");
//                        writer.write("totalSeats: "+ totalSeats +"\n");
//
//                        verify.setText("Output Saved successfully");
//
//                    } catch (IOException ex)
//                    {
//                        verify.setText("Error while generating file!");
//                    }
//                }
//
//            }
//
//        }
//    }
//    public static void main(String[] args) {
//        print a = new print();
//    }
//}
