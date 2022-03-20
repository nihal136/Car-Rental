import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.awt.Image;
class CarRents extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4,l5,l6,i1,i2,i3,i4,i5,i6,i7,i8,i9,i10;
    JTextField t1, t2, t3, t4,t5,t6;
    JTextArea ta1;
    JButton b,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
    JPanel p1;
    ImageIcon c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
    Image cc1,cc2,cc3,cc4,cc5,cc6,cc7,cc8,cc9,cc10,ccc1,ccc2,ccc3,ccc4,ccc5,ccc6,ccc7,ccc8,ccc9,ccc10;
    JFrame f1,f;
    int flag = 0, flag1 = 0, flag2 = 0, flag3 = 0, i;
    Font font1 = new Font("SansSerif", Font.BOLD, 13);
    CarRents() {
        f = new JFrame("Car Rentals By Nihal");
        Image icon = Toolkit.getDefaultToolkit().getImage("D:\\na.png");
        f.setIconImage(icon);
        l1 = new JLabel("Enter name:");
        l1.setBounds(50, 50, 100, 30);
        l1.setFont(font1);
        t1 = new JTextField(15);
        t1.setBounds(230, 50, 140, 25);
        l2 = new JLabel("Enter Pan number:");
        l2.setBounds(50, 100, 150, 30);
        l2.setFont(font1);
        t2 = new JTextField(15);
        t2.setBounds(230, 100, 140, 25);
        l3 = new JLabel("Enter Aadhar Card Number:");
        l3.setBounds(50, 150, 180, 30);l3.setFont(font1);
        t3 = new JTextField(15);
        t3.setBounds(230, 150, 140, 25);
        l4 = new JLabel("Enter Driving License ID:");
        l4.setBounds(50, 200, 180, 30);l4.setFont(font1);
        t4 = new JTextField(15);
        t4.setBounds(230, 200, 140, 25);
        b = new JButton("Submit");
        b.setBounds(118, 250, 120, 30);
        f.getContentPane().setBackground(Color.PINK);
        t1.addActionListener(this);
        t2.addActionListener(this);
        t3.addActionListener(this);
        t4.addActionListener(this);
        b.addActionListener(this);
        f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(t1);f.add(t2);f.add(t3);f.add(t4);f.add(b);
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
        p1=new JPanel();
        p1.setLayout(new FlowLayout(FlowLayout.CENTER));
        f1=new JFrame();
        p1.setBackground(Color.PINK);
        b1=new JButton("Book");
        b1.setBounds(160,220,120,30);
        f1.add(b1);
        b2=new JButton("Book");
        b2.setBounds(420,220,120,30);
        f1.add(b2);
        b3=new JButton("Book");
        b3.setBounds(680,220,120,30);
        f1.add(b3);
        b4=new JButton("Book");
        b4.setBounds(940,220,120,30);
        f1.add(b4);
        b5=new JButton("Book");
        b5.setBounds(1200,220,120,30);
        f1.add(b5);
        b6=new JButton("Book");
        b6.setBounds(160,470,120,30);
        f1.add(b6);
        b7=new JButton("Book");
        b7.setBounds(420,470,120,30);
        f1.add(b7);
        b8=new JButton("Book");
        b8.setBounds(680,470,120,30);
        f1.add(b8);
        b9=new JButton("Book");
        b9.setBounds(940,470,120,30);
        f1.add(b9);
        b10=new JButton("Book");
        b10.setBounds(1200,470,120,30);
        f1.add(b10);
        ta1=new JTextArea(250,200);
        ta1.setBounds(160,550,250,200);
        ta1.setFont(font1);
        l5=new JLabel("Enter number of days you want:");
        l5.setBounds(450,600,250,30);l5.setFont(font1);
        t5=new JTextField(15);
        t5.setBounds(710,600,140,25);
        l6=new JLabel("Total Amount:");
        l6.setBounds(450,700,180,30);l6.setFont(font1);
        t6=new JTextField(15);
        t6.setBounds(710,700,140,25);
        b11 = new JButton("CLOSE");
        b11.setBounds(550,750,100,30);
        f1.add(b11);

        c1=new ImageIcon("D:\\java codes\\project oops\\car1.jpg");
        cc1=c1.getImage();
        ccc1=cc1.getScaledInstance(250,250, Image.SCALE_SMOOTH);
        c1=new ImageIcon(ccc1);
        i1=new JLabel(c1);
        p1.add(i1, BorderLayout.NORTH);
        p1.add(i1);

        c2=new ImageIcon("D:\\java codes\\project oops\\car2.jpg");
        cc2=c2.getImage();
        ccc2=cc2.getScaledInstance(250,250, Image.SCALE_SMOOTH);
        c2=new ImageIcon(ccc2);
        i2=new JLabel(c2);
        p1.add(i2, BorderLayout.NORTH);
        p1.add(i2);

        c3=new ImageIcon("D:\\java codes\\project oops\\car3.jpg");
        cc3=c3.getImage();
        ccc3=cc3.getScaledInstance(250,250, Image.SCALE_SMOOTH);
        c3=new ImageIcon(ccc3);
        i3=new JLabel(c3);
        p1.add(i3, BorderLayout.NORTH);
        p1.add(i3);

        c4=new ImageIcon("D:\\java codes\\project oops\\car4.jpg");
        cc4=c4.getImage();
        ccc4=cc4.getScaledInstance(250,250, Image.SCALE_SMOOTH);
        c4=new ImageIcon(ccc4);
        i4=new JLabel(c4);
        p1.add(i4, BorderLayout.NORTH);
        p1.add(i4);

        c5=new ImageIcon("D:\\java codes\\project oops\\car5.jpg");
        cc5=c5.getImage();
        ccc5=cc5.getScaledInstance(250,250, Image.SCALE_SMOOTH);
        c5=new ImageIcon(ccc5);
        i5=new JLabel(c5);
        p1.add(i5, BorderLayout.NORTH);
        p1.add(i5);

        c6=new ImageIcon("D:\\java codes\\project oops\\car6.jpg");
        cc6=c6.getImage();
        ccc6=cc6.getScaledInstance(250,250, Image.SCALE_SMOOTH);
        c6=new ImageIcon(ccc6);
        i6=new JLabel(c6);
        p1.add(i6, BorderLayout.NORTH);
        p1.add(i6);

        c7=new ImageIcon("D:\\java codes\\project oops\\car7.jpg");
        cc7=c7.getImage();
        ccc7=cc7.getScaledInstance(250,250, Image.SCALE_SMOOTH);
        c7=new ImageIcon(ccc7);
        i7=new JLabel(c7);
        p1.add(i7, BorderLayout.NORTH);
        p1.add(i7);

        c8=new ImageIcon("D:\\java codes\\project oops\\car8.jpg");
        cc8=c8.getImage();
        ccc8=cc8.getScaledInstance(250,250, Image.SCALE_SMOOTH);
        c8=new ImageIcon(ccc8);
        i8=new JLabel(c8);
        p1.add(i8, BorderLayout.NORTH);
        p1.add(i8);

        c9=new ImageIcon("D:\\java codes\\project oops\\car9.jpg");
        cc9=c9.getImage();
        ccc9=cc9.getScaledInstance(250,250, Image.SCALE_SMOOTH);
        c9=new ImageIcon(ccc9);
        i9=new JLabel(c9);
        p1.add(i9, BorderLayout.NORTH);
        p1.add(i9);

        c10=new ImageIcon("D:\\java codes\\project oops\\car10.jpg");
        cc10=c10.getImage();
        ccc10=cc10.getScaledInstance(250,250, Image.SCALE_SMOOTH);
        c10=new ImageIcon(ccc10);
        i10=new JLabel(c10);
        p1.add(i10, BorderLayout.NORTH);
        p1.add(i10);
        t5.addActionListener(this);
        t6.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        f1.add(ta1);f1.add(t5);f1.add(t6);f1.add(l5);f1.add(l6);
        f1.add(p1);
        f1.setSize(1500,1500);


    }

    public void actionPerformed(ActionEvent e)
    {
        flag = 0; flag1 = 0; flag2 = 0; flag3 = 0;
        String name = t1.getText();
        String p = t2.getText();
        String a = t3.getText();
        String l = t4.getText();
        int k;
        String car;

        if(e.getSource() == b) {
            a = t3.getText();l = t4.getText();p = t2.getText();
            /* checking condition for pan card */
            String str;
            str = p.substring(0, 5);
            String str1;
            str1 = p.substring(5, 9);
            char[] ch = new char[str.length()];
            char[] ch1 = new char[str1.length()];
            int d = 0;
            for (i = 0; i < str.length(); i++) {
                ch[i] = str.charAt(i);
            }
            for (i = 0; i < str.length(); i++) {
                if (ch[i] >= 65 && ch[i] <= 90) {
                    d++;
                }
            }
            for (i = 0; i < str1.length(); i++) {
                ch1[i] = str1.charAt(i);
            }
            int c = 0;
            for (i = 0; i < str1.length(); i++) {
                if (ch1[i] >= 48 && ch1[i] <= 57) {
                    c++;
                }
            }

            if (!((c == 4) && (d == 5) && (p.charAt(9) >= 65 && p.charAt(9) <= 90) && p.length() == 10)) {
                flag = 1;
            }
            if (flag == 0) {
                t2.setText(p);
            } else {
                t2.setText(" ");
            }
            /* condition checked */

            /* checking condition for aadhar card */
            for (int i = 0; i < a.length(); i++) {
                if (!(a.charAt(i) >= 48 && a.charAt(i) <= 57 && a.length()==12)) {
                    flag1 = 1;
                    break;
                }
            }
            if (flag1 == 0)
                t3.setText(a);
            else
                t3.setText(" ");
            /* condition checked */

            /* checking condition for driving license */

            String q = l.substring(0, 2);
            String m = l.substring(2);
            for (int i = 0; i < m.length(); i++) {
                flag2 = 0;
                if (!(m.charAt(i) >= 48 && m.charAt(i) <= 57 && l.length() == 15) ) {
                    flag2 = 1;
                    break;
                }
            }
            if (q.equals("AN") || q.equals("AP") || q.equals("AR") || q.equals("AS") ||
                    q.equals("BR") || q.equals("CD") || q.equals("PB") || q.equals("CG") ||
                    q.equals("DD") || q.equals("DL") || q.equals("GA") || q.equals("GJ") ||
                    q.equals("HR") || q.equals("HP") || q.equals("JK") || q.equals("JH") ||
                    q.equals("KA") || q.equals("KL") || q.equals("LA") || q.equals("LD") ||
                    q.equals("MP") || q.equals("MH") || q.equals("MN") || q.equals("NL") ||
                    q.equals("OD") || q.equals("PY") || q.equals("RJ") || q.equals("TN") ||
                    q.equals("TS") || q.equals("TR") || q.equals("UP") || q.equals("UK") ||
                    q.equals("WB") && l.length() != 15) {
                flag3 = 1;
            }
            if (flag2 == 0 && flag3 == 1 ) {
                t4.setText(l);
            } else {
                t4.setText(" ");
            }
            /* condition checked */
            if (flag == 0 && flag1 == 0 && flag2 == 0 && flag3 == 1) {
                f1.setVisible(true);
                try {
                    BufferedReader br = new BufferedReader(new FileReader("D:\\java codes\\project oops\\cars.txt"));
                    String s1 = "", s2 = "";
                    while ((s1 = br.readLine()) != null) {
                        s2 += s1 + "\n";
                    }
                    ta1.setText(s2);
                    br.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(this, "invalid login");
            }
        }
             if(e.getSource()==b1)
            {
                k=Integer.parseInt(t5.getText());
                t6.setText(String.valueOf(950*k));
                car= "Swift Dzire";
                try {
                    FileWriter f = new FileWriter("D:\\java codes\\project oops\\f.txt");
                    BufferedWriter out = new BufferedWriter(f);
                    out.write("NAME: "+name + "\n" +"PAN CARD: "+p + "\n" + "AADHAR CARD: "+a + "\n" + "LICENSE :"+l + "\n" + "CAR BOOKED: "+car + "\n" + "NUMBER OF DAYS:"+k +"\n"+"AMOUNT: "+t6.getText());
                    t1.setText(" ");
                    t2.setText(" ");
                    out.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
            else if(e.getSource()==b2)
            {
                k=Integer.parseInt(t5.getText());
                t6.setText(String.valueOf(1000*k));
                car= "Tata Hexa";
                try {
                    FileWriter f = new FileWriter("D:\\java codes\\project oops\\f.txt");
                    BufferedWriter out = new BufferedWriter(f);
                    out.write("NAME: "+name + "\n" +"PAN CARD: "+p + "\n" + "AADHAR CARD: "+a + "\n" + "LICENSE :"+l + "\n" + "CAR BOOKED: "+car + "\n" + "NUMBER OF DAYS:"+k +"\n"+"AMOUNT: "+t6.getText());
                    t1.setText(" ");
                    t2.setText(" ");
                    out.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
            else if(e.getSource()==b3)
            {
                k=Integer.parseInt(t5.getText());
                t6.setText(String.valueOf(1050*k));
                car= "Hyundai i10 ";
                try {
                    FileWriter f = new FileWriter("D:\\java codes\\project oops\\f.txt");
                    BufferedWriter out = new BufferedWriter(f);
                    out.write("NAME: "+name + "\n" +"PAN CARD: "+p + "\n" + "AADHAR CARD: "+a + "\n" + "LICENSE :"+l + "\n" + "CAR BOOKED: "+car + "\n" + "NUMBER OF DAYS:"+k +"\n"+"AMOUNT: "+t6.getText());
                    t1.setText(" ");
                    t2.setText(" ");
                    out.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
            else if(e.getSource()==b4)
            {
                k=Integer.parseInt(t5.getText());
                t6.setText(String.valueOf(1100*k));
                car= "Hyundai Creta";
                try {
                    FileWriter f = new FileWriter("D:\\java codes\\project oops\\f.txt");
                    BufferedWriter out = new BufferedWriter(f);
                    out.write("NAME: "+name + "\n" +"PAN CARD: "+p + "\n" + "AADHAR CARD: "+a + "\n" + "LICENSE :"+l + "\n" + "CAR BOOKED: "+car + "\n" + "NUMBER OF DAYS:"+k +"\n"+"AMOUNT: "+t6.getText());
                    t1.setText(" ");
                    t2.setText(" ");
                    out.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
            else if(e.getSource()==b5)
            {
                k=Integer.parseInt(t5.getText());
                t6.setText(String.valueOf(1150*k));
                car= "Maruti Suzuki Ertiga";
                try {
                    FileWriter f = new FileWriter("D:\\java codes\\project oops\\f.txt");
                    BufferedWriter out = new BufferedWriter(f);
                    out.write("NAME: "+name + "\n" +"PAN CARD: "+p + "\n" + "AADHAR CARD: "+a + "\n" + "LICENSE :"+l + "\n" + "CAR BOOKED: "+car + "\n" + "NUMBER OF DAYS:"+k +"\n"+"AMOUNT: "+t6.getText());
                    t1.setText(" ");
                    t2.setText(" ");
                    out.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
            else if(e.getSource()==b6)
            {
                k=Integer.parseInt(t5.getText());
                t6.setText(String.valueOf(1200*k));
                car= "Renault Duster ";
                try {
                    FileWriter f = new FileWriter("D:\\java codes\\project oops\\f.txt");
                    BufferedWriter out = new BufferedWriter(f);
                    out.write("NAME: "+name + "\n" +"PAN CARD: "+p + "\n" + "AADHAR CARD: "+a + "\n" + "LICENSE :"+l + "\n" + "CAR BOOKED: "+car + "\n" + "NUMBER OF DAYS:"+k +"\n"+"AMOUNT: "+t6.getText());
                    t1.setText(" ");
                    t2.setText(" ");
                    out.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
            else if(e.getSource()==b7)
            {
                k=Integer.parseInt(t5.getText());
                t6.setText(String.valueOf(1250*k));
                car= "Toyota Innova Crysta ";
                try {
                    FileWriter f = new FileWriter("D:\\java codes\\project oops\\f.txt");
                    BufferedWriter out = new BufferedWriter(f);
                    out.write("NAME: "+name + "\n" +"PAN CARD: "+p + "\n" + "AADHAR CARD: "+a + "\n" + "LICENSE :"+l + "\n" + "CAR BOOKED: "+car + "\n" + "NUMBER OF DAYS:"+k +"\n"+"AMOUNT: "+t6.getText());
                    t1.setText(" ");
                    t2.setText(" ");
                    out.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
            else if(e.getSource()==b8)
            {
                k=Integer.parseInt(t5.getText());
                t6.setText(String.valueOf(1300*k));
                car= "Ford EcoSport ";
                try {
                    FileWriter f = new FileWriter("D:\\java codes\\project oops\\f.txt");
                    BufferedWriter out = new BufferedWriter(f);
                    out.write("NAME: "+name + "\n" +"PAN CARD: "+p + "\n" + "AADHAR CARD: "+a + "\n" + "LICENSE :"+l + "\n" + "CAR BOOKED: "+car + "\n" + "NUMBER OF DAYS:"+k +"\n"+"AMOUNT: "+t6.getText());
                    t1.setText(" ");
                    t2.setText(" ");
                    out.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
            else if(e.getSource()==b9)
            {
                k=Integer.parseInt(t5.getText());
                t6.setText(String.valueOf(1350*k));
                car= "Toyota Fortuner";
                try {
                    FileWriter f = new FileWriter("D:\\java codes\\project oops\\f.txt");
                    BufferedWriter out = new BufferedWriter(f);
                    out.write("NAME: "+name + "\n" +"PAN CARD: "+p + "\n" + "AADHAR CARD: "+a + "\n" + "LICENSE :"+l + "\n" + "CAR BOOKED: "+car + "\n" + "NUMBER OF DAYS:"+k +"\n"+"AMOUNT: "+t6.getText());
                    t1.setText(" ");
                    t2.setText(" ");
                    out.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
            else if(e.getSource()==b10)
            {
                k=Integer.parseInt(t5.getText());
                t6.setText(String.valueOf(1400*k));
                car= "Hyundai Venue";
                try {
                    FileWriter f = new FileWriter("D:\\java codes\\project oops\\f.txt");
                    BufferedWriter out = new BufferedWriter(f);
                    out.write("NAME: "+name + "\n" +"PAN CARD: "+p + "\n" + "AADHAR CARD: "+a + "\n" + "LICENSE :"+l + "\n" + "CAR BOOKED: "+car + "\n" + "NUMBER OF DAYS:"+k +"\n"+"AMOUNT: "+t6.getText());
                    t1.setText(" ");
                    t2.setText(" ");
                    out.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
            else if(e.getSource()==b11)
            {
                f1.dispose();
                f.dispose();
            }

        }


    }

public class CarRental{
    public static void main(String[] args) {
        new CarRents();
    }
}