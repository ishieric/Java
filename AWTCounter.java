
import java.awt.*;       //Sử dụng các kho chứa AWT và các thành phần 
import java.awt.event.*;  //Sử dụng các lớp sự kiện AWT và các giao diện người nghe 
public class AWTCounter extends Frame implements ActionListener{

	private Label lblCount;    // Khai báo một thành phần Label 
	   private TextField tfCount; // Khai báo một thành phần TextField 
	   private Button btnCount;   // Khai báo một thành phần Button 
	   private int count = 0;     // Giá trị của Counter 
	 
	   // Constructor để thiết lập các thành phần GUI và xử lý sự kiện 
	   public AWTCounter () {
	      setLayout(new FlowLayout());
	        
	 
	      lblCount = new Label("Counter");  // Xây dựng thành phần Label 
	      add(lblCount);                    
	 
	      tfCount = new TextField("0", 10); 
	      tfCount.setEditable(false);       
	      add(tfCount);                     
	 
	      btnCount = new Button("Count");   
	      add(btnCount);                    //
	 
	      btnCount.addActionListener(this);
	         
	 
	      setTitle("AWT Counter"); 
	      setSize(250, 100);        
	 
	      // For inspecting the Container/Components objects
	      // System.out.println(this);
	      // System.out.println(lblCount);
	      // System.out.println(tfCount);
	      // System.out.println(btnCount);
	 
	      setVisible(true);        
	 
	      // System.out.println(this);
	      // System.out.println(lblCount);
	      // System.out.println(tfCount);
	      // System.out.println(btnCount);
	   }
	 
	 
	   public static void main(String[] args) {
	     
	      AWTCounter app = new AWTCounter();
	         
	   }
	 
	   
	   public void actionPerformed(ActionEvent evt) {
	      ++count; 
	      tfCount.setText(count + ""); 
	   }
	}
