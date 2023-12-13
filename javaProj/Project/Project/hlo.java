package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
abstract class ticket1 {
    abstract void q();
    abstract void SelectSeats();
}
class hlo extends ticket1 implements ActionListener{
    JFrame timing_frame =new JFrame();
    JFrame seats = new JFrame("Seats");
    JFrame homepage_frame =new JFrame();
    String selected_city,selected;
    JLabel movie1_label,l2,l3,l4,homepage_title;
    JRadioButton r1,r2,r3,today_rb,tomorrow_rb,dtomorrow_rb, timing2_rb, timing3_rb, timing4_rb,timing1_rb;
    JButton next,movie1_button,movie2_button,movie3_button,movie4_button,timing_previous_b,seats_previous_b,seats_homepage_b;
    String[] City = {"Select Your City","Chandigarh", "Mohali", "Patiala","Panchkula","Rajpura"};
    JComboBox<String> cities = new JComboBox<>(City);
    //Cinema Radio button Group

    String Location, Cinema, Time, Day;

    ButtonGroup movie_bg,day_bg,timing_bg;
    Font font3=new Font(" ",Font.BOLD,40);
    Font font1=new Font(" ",Font.BOLD,22);
    Font font2=new Font(" ",Font.ITALIC,16);
    //Movie posters------------------------------
    ImageIcon image=new ImageIcon("icon.jpg");
    ImageIcon tiger3image=new ImageIcon("Tiger3.png");
    ImageIcon HGimage=new ImageIcon("HungerGames.png");
    ImageIcon Failimage=new ImageIcon("12thFail.png");
    ImageIcon movie_4=new ImageIcon("12thFail.png");
    //Seating Panels-------------------
    JPanel silver = new JPanel();
    JPanel Gold = new JPanel();
    JPanel Platinum = new JPanel();
    //Silver Buttons
    JButton S1 = new JButton("S1");
    JButton S2 = new JButton("S2");
    JButton S3 = new JButton("S3");
    JButton S4 = new JButton("S4");
    JButton S5 = new JButton("S5");
    JButton S6 = new JButton("S6");
    JButton S7 = new JButton("S7");
    JButton S8 = new JButton("S8");
    //Gold Buttons
    JButton G1 = new JButton("G1");
    JButton G2 = new JButton("G2");
    JButton G3 = new JButton("G3");
    JButton G4 = new JButton("G4");
    JButton G5 = new JButton("G5");
    JButton G6 = new JButton("G6");
    JButton G7 = new JButton("G7");
    JButton G8 = new JButton("G8");
    //Platinum Buttons
    JButton P1 = new JButton("P1");
    JButton P2 = new JButton("P2");
    JButton P3 = new JButton("P3");
    JButton P4 = new JButton("P4");
    JButton P5 = new JButton("P5");
    JButton P6 = new JButton("P6");
    JButton P7 = new JButton("P7");
    JButton P8 = new JButton("P8");

    //----------ActionButtons--------
    JButton Reset = new JButton("Reset");
    JButton Confirm = new JButton("Confirm");
    JTextField selectedSeats = new JTextField();

    JPanel Screen = new JPanel();
    JLabel ScreenText = new JLabel("Screen");
    @Override
    void q() {
        //homepage frame
        homepage_frame.setVisible(true);
        homepage_frame.setSize(1920,1080);
        homepage_frame.setLayout(null);
        homepage_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        homepage_frame.setTitle("Home Page");
        homepage_frame.setIconImage(image.getImage());
        homepage_frame.getContentPane().setBackground(new Color(21, 21, 21));

        homepage_title=new JLabel("BOOK MY SHOW");
        homepage_title.setFont(font3);
        homepage_title.setBounds(30,20,400,80);
        homepage_title.setForeground(Color.white);

        movie1_button =new JButton(tiger3image);
        movie1_button.setBounds(30,200,300,500);
        movie1_button.addActionListener(this::First_Frame);
        movie2_button =new JButton(HGimage);
        movie2_button.setBounds(415,200,300,500);
        movie2_button.addActionListener(this::First_Frame);
        movie3_button=new JButton(Failimage);
        movie3_button.setBounds(800,200,300,500);
        movie3_button.addActionListener(this::First_Frame);
        movie4_button=new JButton(movie_4);
        movie4_button.setBounds(1185,200,300,500);
        movie4_button.addActionListener(this::First_Frame);

        homepage_frame.add(movie1_button);
        homepage_frame.add(movie2_button);
        homepage_frame.add(movie3_button);
        homepage_frame.add(movie4_button);
        homepage_frame.add(homepage_title);

        //timing frame
        timing_frame.setSize(450,650);
        timing_frame.setLayout(null);
        timing_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        timing_frame.setTitle("Timings");
        timing_frame.setIconImage(image.getImage());
        timing_frame.getContentPane().setBackground(new Color(248, 143, 143));

        movie1_label =new JLabel("TIGER 3-HINDI");
        movie1_label.setBounds(10,30,350,30);
        movie1_label.setFont(font1);

        cities.setBounds(30,80,120,30);
        cities.addActionListener(this::errors);

        l3=new JLabel("Select Cinema for the Show");
        l3.setFont(font2);
        l3.setBounds(10,125,250,50);
        r1=new JRadioButton("X Cinema");
        r1.setBackground(new Color(248, 143, 143));
        r1.setBounds(10,170,120,50);
        r1.addActionListener(this::recipt_action);
        r2=new JRadioButton("Y Cinema");
        r2.setBackground(new Color(248, 143, 143));
        r2.setBounds(127,170,120,50);
        r2.addActionListener(this::recipt_action);
        r3=new JRadioButton("Z Cinema");
        r3.setBackground(new Color(248, 143, 143));
        r3.setBounds(243,170,120,50);
        r3.addActionListener(this::recipt_action);
        movie_bg =new ButtonGroup();
        movie_bg.add(r1);
        movie_bg.add(r2);
        movie_bg.add(r3);

        l2=new JLabel("Select Day for the Show");
        l2.setBounds(10,235,190,50);
        l2.setFont(font2);
        today_rb= new JRadioButton("Today");
        today_rb.setBounds(10,280,70,30);
        today_rb.setBackground(new Color(248, 143, 143));
        today_rb.addActionListener(this::First_Frame);
        tomorrow_rb= new JRadioButton("Tomorrow");
        tomorrow_rb.setBounds(90,280,100,30);
        tomorrow_rb.setBackground(new Color(248, 143, 143));
        tomorrow_rb.addActionListener(this::First_Frame);
        dtomorrow_rb= new JRadioButton("Day After Tomorrow");
        dtomorrow_rb.setBounds(200,280,160,30);
        dtomorrow_rb.setBackground(new Color(248, 143, 143));
        dtomorrow_rb.addActionListener(this::First_Frame);

        day_bg=new ButtonGroup();
        day_bg.add(today_rb);
        day_bg.add(tomorrow_rb);
        day_bg.add(dtomorrow_rb);

        l4=new JLabel("Select Timing for the Show");
        l4.setBounds(10,345,210,50);
        l4.setFont(font2);
        timing1_rb= new JRadioButton("11:00 AM");
        timing1_rb.setBounds(10,390,100,30);
        timing1_rb.setBackground(new Color(248, 143, 143));
        timing1_rb.addActionListener(this::First_Frame);
        timing2_rb = new JRadioButton("3:00 PM");
        timing2_rb.setBounds(130,390,100,30);
        timing2_rb.setBackground(new Color(248, 143, 143));
        timing2_rb.addActionListener(this::First_Frame);
        timing3_rb = new JRadioButton("7:00 PM");
        timing3_rb.setBounds(10,430,100,30);
        timing3_rb.setBackground(new Color(248, 143, 143));
        timing3_rb.addActionListener(this::First_Frame);
        timing4_rb = new JRadioButton("10:30 PM");
        timing4_rb.setBounds(130,430,100,30);
        timing4_rb.setBackground(new Color(248, 143, 143));
        timing4_rb.addActionListener(this::First_Frame);

        timing_bg=new ButtonGroup();
        timing_bg.add(timing1_rb);
        timing_bg.add(timing2_rb);
        timing_bg.add(timing3_rb);
        timing_bg.add(timing4_rb);

        timing_previous_b =new JButton("Previous");
        timing_previous_b.setBounds(80,490,100,40);
        timing_previous_b.addActionListener(this::restartApplication);

        next=new JButton("Next");
        next.setBounds(210,490,80,40);
        next.addActionListener(this::errors);

        timing_frame.add(r1);
        timing_frame.add(r2);
        timing_frame.add(r3);
        timing_frame.add(cities);
        timing_frame.add(l3);
        timing_frame.add(l4);
        timing_frame.add(timing1_rb);
        timing_frame.add(timing2_rb);
        timing_frame.add(timing3_rb);
        timing_frame.add(timing4_rb);
        timing_frame.add(next);
        timing_frame.add(l2);
        timing_frame.add(today_rb);
        timing_frame.add(tomorrow_rb);
        timing_frame.add(dtomorrow_rb);
        timing_frame.add(timing_previous_b);
        timing_frame.add(movie1_label);
    }
    @Override
    void SelectSeats(){
        //Seating Arrangement Frame
        seats.setLayout(null);
        seats.setSize(700,600);
//        Seats.setVisible(false);
        seats.getContentPane().setBackground(Color.WHITE);
        S1.setBounds(60,30,50,50);
        S2.setBounds(120,30,50,50);
        S3.setBounds(180,30,50,50);
        S4.setBounds(240,30,50,50);
        S5.setBounds(300,30,50,50);
        S6.setBounds(360,30,50,50);
        S7.setBounds(420,30,50,50);
        S8.setBounds(480,30,50,50);

        G1.setBounds(60,30,50,50);
        G2.setBounds(120,30,50,50);
        G3.setBounds(180,30,50,50);
        G4.setBounds(240,30,50,50);
        G5.setBounds(300,30,50,50);
        G6.setBounds(360,30,50,50);
        G7.setBounds(420,30,50,50);
        G8.setBounds(480,30,50,50);

        P1.setBounds(60, 30, 50, 50);
        P2.setBounds(120, 30, 50, 50);
        P3.setBounds(180, 30, 50, 50);
        P4.setBounds(240, 30, 50, 50);
        P5.setBounds(300, 30, 50, 50);
        P6.setBounds(360, 30, 50, 50);
        P7.setBounds(420, 30, 50, 50);
        P8.setBounds(480, 30, 50, 50);

        ScreenText.setForeground(Color.WHITE);
        Screen.add(ScreenText);
        Screen.setBackground(new Color(0, 162, 35, 255));
        Screen.setBounds(90,10,500,30);

        Reset.setBounds(40,400,90,40);
        selectedSeats.setBounds(180,400,320,40);
        selectedSeats.setEditable(false);
        Confirm.setBounds(550,400,90,40);
        Confirm.addActionListener(this::ConfirmButton);

        seats_previous_b=new JButton("Previous");
        seats_previous_b.setBounds(200,470,90,40);
        seats_previous_b.addActionListener(this::restartApplication);
        seats_homepage_b=new JButton("Home Page");
        seats_homepage_b.setBounds(310,470,110,40);
        seats_homepage_b.addActionListener(this::restartApplication);

        silver.setBackground(new Color(80, 85, 89));
        silver.setLayout(null);
        silver.setBounds(40,40,600,100);
        S1.addActionListener(this);
        S2.addActionListener(this);
        S3.addActionListener(this);
        S4.addActionListener(this);
        S5.addActionListener(this);
        S6.addActionListener(this);
        S7.addActionListener(this);
        S8.addActionListener(this);
        G1.addActionListener(this);
        G2.addActionListener(this);
        G3.addActionListener(this);
        G4.addActionListener(this);
        G5.addActionListener(this);
        G6.addActionListener(this);
        G7.addActionListener(this);
        G8.addActionListener(this);
        P1.addActionListener(this);
        P2.addActionListener(this);
        P3.addActionListener(this);
        P4.addActionListener(this);
        P5.addActionListener(this);
        P6.addActionListener(this);
        P7.addActionListener(this);
        P8.addActionListener(this);

        Reset.addActionListener(this::ResetButton);
        silver.add(S1);
        silver.add(S2);
        silver.add(S3);
        silver.add(S4);
        silver.add(S5);
        silver.add(S6);
        silver.add(S7);
        silver.add(S8);

        Gold.setBackground(new Color(245, 221, 98));
        Gold.setLayout(null);
        Gold.setBounds(40,160,600,100);
        Gold.add(G1);
        Gold.add(G2);
        Gold.add(G3);
        Gold.add(G4);
        Gold.add(G5);
        Gold.add(G6);
        Gold.add(G7);
        Gold.add(G8);

        Platinum.setBackground(new Color(183, 183, 183));
        Platinum.setLayout(null);
        Platinum.setBounds(40,280,600,100);
        Platinum.add(P1);
        Platinum.add(P2);
        Platinum.add(P3);
        Platinum.add(P4);
        Platinum.add(P5);
        Platinum.add(P6);
        Platinum.add(P7);
        Platinum.add(P8);

        seats.add(silver);
        seats.add(Gold);
        seats.add(Platinum);
        seats.add(Reset);
        seats.add(selectedSeats);
        seats.add(Confirm);
        seats.add(Screen);
        seats.add(seats_homepage_b);
        seats.add(seats_previous_b);
        seats.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == S1) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected+" "+"S1");
            S1.setEnabled(false);
        }
        else if (e.getSource() == S2) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected+" "+"S2");
            S2.setEnabled(false);
        }
        else if (e.getSource() == S3) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected+" "+"S3");
            S3.setEnabled(false);
        }
        else if (e.getSource() == S4) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected+" "+"S4");
            S4.setEnabled(false);
        }
        else if (e.getSource() == S5) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected+" "+"S5");
            S5.setEnabled(false);
        }
        else if (e.getSource() == S6) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected+" "+"S6");
            S6.setEnabled(false);
        }
        else if (e.getSource() == S7) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected+" "+"S7");
            S7.setEnabled(false);
        }
        else if (e.getSource() == S8) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected+" "+"S8");
            S8.setEnabled(false);
        }
        else if (e.getSource() == G1) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected + " " + "G1");
            G1.setEnabled(false);
        } else if (e.getSource() == G2) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected + " " + "G2");
            G2.setEnabled(false);
        } else if (e.getSource() == G3) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected + " " + "G3");
            G3.setEnabled(false);
        } else if (e.getSource() == G4) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected + " " + "G4");
            G4.setEnabled(false);
        } else if (e.getSource() == G5) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected + " " + "G5");
            G5.setEnabled(false);
        } else if (e.getSource() == G6) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected + " " + "G6");
            G6.setEnabled(false);
        } else if (e.getSource() == G7) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected + " " + "G7");
            G7.setEnabled(false);
        } else if (e.getSource() == G8) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected + " " + "G8");
            G8.setEnabled(false);
        }
        else if (e.getSource() == P1) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected + " " + "P1");
            P1.setEnabled(false);
        } else if (e.getSource() == P2) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected + " " + "P2");
            P2.setEnabled(false);
        } else if (e.getSource() == P3) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected + " " + "P3");
            P3.setEnabled(false);
        } else if (e.getSource() == P4) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected + " " + "P4");
            P4.setEnabled(false);
        } else if (e.getSource() == P5) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected + " " + "P5");
            P5.setEnabled(false);
        } else if (e.getSource() == P6) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected + " " + "P6");
            P6.setEnabled(false);
        } else if (e.getSource() == P7) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected + " " + "P7");
            P7.setEnabled(false);
        } else if (e.getSource() == P8) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected + " " + "P8");
            P8.setEnabled(false);
        }
    }
    public void ResetButton(ActionEvent e){
        if (e.getSource()==Reset){
            selectedSeats.setText(null);
            S1.setEnabled(true);
            S2.setEnabled(true);
            S3.setEnabled(true);
            S4.setEnabled(true);
            S5.setEnabled(true);
            S6.setEnabled(true);
            S7.setEnabled(true);
            S8.setEnabled(true);
            G1.setEnabled(true);
            G2.setEnabled(true);
            G3.setEnabled(true);
            G4.setEnabled(true);
            G5.setEnabled(true);
            G6.setEnabled(true);
            G7.setEnabled(true);
            G8.setEnabled(true);
            P1.setEnabled(true);
            P2.setEnabled(true);
            P3.setEnabled(true);
            P4.setEnabled(true);
            P5.setEnabled(true);
            P6.setEnabled(true);
            P7.setEnabled(true);
            P8.setEnabled(true);
        }
    }

    public void ConfirmButton (ActionEvent e){
        if (selectedSeats.getText().isEmpty()){
            JOptionPane.showMessageDialog(seats, "Please Select a Seat !!!",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
    public void First_Frame(ActionEvent e) {
//        Image Poster 1 | Tiger3
        if (e.getSource()== movie1_button) {
            timing_frame.setVisible(true);
            homepage_frame.dispose();
        }
//        Image Poster 2 | Hunger games
        else if (e.getSource()== movie2_button) {
            timing_frame.setVisible(true);
            homepage_frame.dispose();
            movie1_label.setText("THE HUNGER GAMES-ENGLISH");
        }
//        Image poster 3 | 12th Fail
        else if (e.getSource()==movie3_button) {
            timing_frame.setVisible(true);
            homepage_frame.dispose();
            movie1_label.setText("12TH FAIL-HINDI");

        }
//        Image poster 4
        else if (e.getSource()==movie4_button) {
            timing_frame.setVisible(true);
            homepage_frame.dispose();
            movie1_label.setText("MOVIE 4");
        }
    }
    public void errors(ActionEvent e) {
        if (e.getSource()== next) {
            selected_city=(String) cities.getSelectedItem();
            if (selected_city.equals("Select Your City")) {
                JOptionPane.showMessageDialog(timing_frame, "Please Select your City",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (!r1.isSelected() && !r2.isSelected() && !r3.isSelected()) {
                JOptionPane.showMessageDialog(timing_frame, "Please Select Cinema for the show",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (!today_rb.isSelected() && !tomorrow_rb.isSelected() && !dtomorrow_rb.isSelected())
            {
                JOptionPane.showMessageDialog(timing_frame, "Please Select Day for the show",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (!timing1_rb.isSelected() && !timing2_rb.isSelected() && !timing3_rb.isSelected() && !timing4_rb.isSelected())
            {
                JOptionPane.showMessageDialog(timing_frame, "Please Select Timing for the show",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(!selected_city.equals("Select Your City")&&!(!r1.isSelected() && !r2.isSelected() && !r3.isSelected())&& !(!today_rb.isSelected() && !tomorrow_rb.isSelected() && !dtomorrow_rb.isSelected())
            ) {
                seats.setVisible(true);
                timing_frame.dispose();
            }
        }
    }

 public void recipt_action(ActionEvent e)
 {
    if (e.getSource() == r1) {
        Cinema = "X Cinema";
    }
    else if (e.getSource() == r2) {
        Cinema = "Y Cinema";
    }
    else  if (e.getSource() == r3) {
        Cinema = "Z Cinema";
    }
 }

    private void restartApplication(ActionEvent e) {
        if (e.getSource()== timing_previous_b) {
            timing_frame.dispose();
            homepage_frame.dispose();
            seats.dispose();
            hlo newApp = new hlo();
            newApp.q();
            newApp.SelectSeats();
        }
        else if (e.getSource()== seats_homepage_b) {
            seats.dispose();
            timing_frame.dispose();
            homepage_frame.dispose();
            hlo newApp = new hlo();
            newApp.q();
            newApp.SelectSeats();
        }
        else if (e.getSource()== seats_previous_b) {
            seats.dispose();
            timing_frame.setVisible(true);
        }
    }

    public static void main(String[] args) {
        hlo a=new hlo();
        a.q();
        a.SelectSeats();
    }
}