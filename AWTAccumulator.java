import java.awt.*;        // Sử dụng các kho chứa AWT và các thành phần 
import java.awt.event.*;  // Sử dụng các lớp sự kiện AWT và giao diện người nghe
 

public class AWTAccumulator extends Frame implements ActionListener {
   private Label lblInput;     // Khai báo đầu vào Labe
   private Label lblOutput;   // Khai báo đầu ra Nhãn 
   private TextField tfInput;  
   private TextField tfOutput; 
   private int sum = 0;        
 
   
   public AWTAccumulator() {
      setLayout(new FlowLayout());
         
 
      lblInput = new Label("Enter an Integer: "); 
      add(lblInput);              
 
      tfInput = new TextField(10); 
      add(tfInput);               
 
      tfInput.addActionListener(this);
         
 
      lblOutput = new Label("The Accumulated Sum is: ");  
      add(lblOutput);              
 
      tfOutput = new TextField(10); 
      tfOutput.setEditable(false);  
      add(tfOutput);                
 
      setTitle("AWT Accumulator");  
      setSize(350, 120);  
      setVisible(true);  
   }
 
  
   public static void main(String[] args) {
      
      new AWTAccumulator();
   }
 
   // ActionEvent handler - Called back upon hitting "enter" key on TextField
   @Override
   public void actionPerformed(ActionEvent evt) {
     
      int numberIn = Integer.parseInt(tfInput.getText());
      sum += numberIn;      
      tfInput.setText("");  
      tfOutput.setText(sum + ""); 
                                  
   }
}