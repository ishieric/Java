  package tongab;

import java.awt.*;        
import java.awt.event.*;

public abstract class tongab extends Frame implements ActionListener{

  Button btnkq;
  TextField txtA,txtB,txtKQ;
  Label lblA,lblB,lblKQ;
  public tongab()
 {
setLayout(new FlowLayout());
lblA=new Label("Nhập số thứ nhất để tính tổng");
this.add(lblA);
txtA=new TextField(30);
this.add(txtA);

lblB=new Label("Nhập số thứ hai để tính tổng");
this.add(lblB);
txtB=new TextField(30);
this.add(txtB);
lblKQ=new Label("Kết quả :");
this.add(lblKQ);
txtKQ=new TextField(30);
this.add(txtKQ);
txtKQ.setEditable(false);
btnkq=new Button("Kết quả");
btnkq.addActionListener(new XLcong());
this.add(btnkq);
 }
   
class XLcong implements ActionListener {
           public void actionPerformed(ActionEvent e)
           {
            int a=Integer.parseInt(txtA.getText());
            int b=Integer.parseInt(txtB.getText());
            int c=a+b;
            txtKQ.setText(c+"");
            }
     
}     
public static void main(String[] args)
{
    tongab test=new tongab() {
        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
   test.setTitle("tính tổng hai số");
    test.setSize(480,200);
    test.setVisible(true);
}
}