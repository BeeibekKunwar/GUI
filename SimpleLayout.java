import javax.swing.*;
class SimpleLayout{
public SimpleLayout(){
JFrame f=new JFrame("Software");
f.setSize(400,500);
JLabel l=new JLabel("Name");
l.setBounds(25,30,150,14);
JTextField t=new JTextField();
t.setBounds(250,30,30,15);
JButton b=new JButton("Submit");
t.setBounds(200,400,20,15);
f.add(l);
f.add(t);
f.add(b);
f.setLayout(null);
f.setVisible(true);
}
public static void main(String []args){
new SimpleLayout();
}
}