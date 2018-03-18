package edu.hit1160300211.experiment4;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import edu.hit1160300211.experiment4.swingBMI.Student;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Scanner;
public class OOBMI extends JFrame {
	public static class Student{
		public String id;
		public String name;
		public float height;
		public float weight;
		public float bmi;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public float getHeight() {
			return height;
		}
		public void setHeight(float height) {
			this.height = height;
		}
		public float getWeight() {
			return weight;
		}
		public void setWeight(float weight) {
			this.weight = weight;
		}
		public float getBmi() {
			return bmi;
		}
		public void setBmi(float bmi) {
			this.bmi= bmi;
		}
		public void inputStudent() {
			// TODO Auto-generated method stub
			
		}
		/*public Student(String id,String name,float weight,float height,float bmi) {
			this.id = id;
			this.name=name;
			this.weight=weight;
			this.height=height;
			this.bmi=bmi;
		}*/
	}
	public static Student inputStudent() {
		System.out.println("请输入学生学号，姓名，身高，体重:");
		Scanner in =new Scanner(System.in);
		String id2 = in.nextLine();
		String name2 = in.nextLine();
		float height2 = in.nextFloat();
		float weight2 = in.nextFloat();
		float bmi2=weight2/(height2*height2);
		Student student = new Student();
		student.setId(id2);
		student.setName(name2);
		student.setHeight(height2);
		student.setWeight(weight2);
		student.setBmi(bmi2);
		System.out.println("学号："+id2+", 姓名:"+name2+", 身高:"+height2+"米, 体重:"+weight2+"公斤， BMI:"+bmi2+"。");
		return student;
	}
	public static Student genStudent() {
		Student student2 = new Student();
		int b=getRandomint(0,100);
		Integer bb = new Integer(b);
		student2.id=bb.toString();
		char a=getRandomchar('a','z');
		Character aa = new Character(a);
		char c=getRandomchar('a','z');
		Character cc = new Character(c);
		char d=getRandomchar('a','z');
		Character dd = new Character(d);
		student2.name=""+aa+cc+dd;
		student2.weight=(float)(getRandomint(40,100));
		student2.height=((float)getRandomint(120,200))/100;
		student2.bmi=student2.weight/(student2.height*student2.height);
		return student2;
	}
	public static char getRandomchar(char a1,char a2) {
		return (char)(a1+Math.random()*(a2-a1+1));
	}
	public static int getRandomint(int a1,int a2) {
		return (int)(a1+Math.random()*(a2-a1+1));
	}
	public static boolean isExists(String id,Student num[],Student gennum[],int n,int m) {
		int flag=1;
		int int1;
		int int2;
		int ids=Integer.parseInt(id);
		for(int i=0;i<n;i++)
		{
			int1=Integer.parseInt(num[i].id);
			if(int1==ids)
				flag=0;
		}
		for(int j=0;j<m;j++)
		{
			int2=Integer.parseInt(gennum[j].id);
			if(int2==ids)
				flag=0;
		}
		if(flag==1) {
			return false;
		}
		else
		{
			return true;
		}
	}
	public static void Sortbyid(int n,int sortedIndex[],String ids[]) {
		String ids2[]=new String[n];
		for(int i=0;i<ids.length;i++)
		{
			ids2[i]=ids[i];
		}
		Arrays.sort(ids);
		for(int j=0;j<ids.length;j++)
		{
			for(int k=0;k<ids.length;k++)
			{
				if(ids[j]==ids2[k])
				{
					sortedIndex[j]=k;
				}
			}
		}
	}
	public static void Sortbyname(int n,int sortedIndex[],String names[]) {
		String names2[]=new String[n];
		for(int i=0;i<names.length;i++)
		{
			names2[i]=names[i];
		}
		Arrays.sort(names);
		for(int j=0;j<names.length;j++)
		{
			for(int k=0;k<names.length;k++)
			{
				if(names[j]==names2[k])
				{
					sortedIndex[j]=k;
				}
			}
		}
	}
	public static void Sortbyweight(int n,int sortedIndex[],float weights[]) {
		float weights2[]=new float[n];
		for(int i=0;i<weights.length;i++)
		{
			weights2[i]=weights[i];
		}
		Arrays.sort(weights);
		for(int j=0;j<weights.length;j++)
		{
			for(int k=0;k<weights.length;k++)
			{
				if(weights[j]==weights2[k])
				{
					sortedIndex[j]=k;
				}
			}
		}
	}
	public static void Sortbyheight(int n,int sortedIndex[],float heights[]) {
		float heights2[]=new float[n];
		for(int i=0;i<heights.length;i++)
		{
			heights2[i]=heights[i];
		}
		Arrays.sort(heights);
		for(int j=0;j<heights.length;j++)
		{
			for(int k=0;k<heights.length;k++)
			{
				if(heights[j]==heights2[k])
				{
					sortedIndex[j]=k;
				}
			}
		}
	}
	public static void Sortbybim(int n,int sortedIndex[],float bims[]) {
		float bims2[]=new float[n];
		for(int i=0;i<bims.length;i++)
		{
			bims2[i]=bims[i];
		}
		Arrays.sort(bims);
		for(int j=0;j<bims.length;j++)
		{
			for(int k=0;k<bims.length;k++)
			{
				if(bims[j]==bims2[k])
				{
					sortedIndex[j]=k;
				}
			}
		}
	}
	public static float bmiAverage(float bmi[],int a) {
		float bmi1=0;
		for(int i=0;i<a;i++)
		{
			bmi1=bmi1+bmi[i];
		}
		bmi1=bmi1/a;
		return bmi1;
	}
	public static float bmiMiddle(float bmi[],int Index[],int a) {
		Sortbybim(a,Index,bmi);
		if(a/2==0) {
			return (bmi[a/2]+bmi[a/2+1])/2;
		}
		else
		{
			return bmi[(a+1)/2];
		}
	}
	public static float bmiMode(float bmi[],int a) {
		  Arrays.sort(bmi);
		  int count = 1;
		  int longest = 0;
		  float mode = 0;
		  for (int i=0;i<a-1;i++) {
		   if (bmi[i] == bmi[i + 1]) {
		    count++;
		   } 
		   else {
		    count = 1;
		    continue;
		   }
		   if (count>longest) {
		    mode=bmi[i];
		    longest=count;
		   }
		  }
		  return mode;
		 }
    public static float bmiD(float bmi[],int a,float ave) {
    	    float dd=0;
    	    for(int i=0;i<a;i++) {
    	    	    dd=dd+(bmi[i]-ave)*(bmi[i]-ave);
    	    }
    	    dd=dd/a;
    	    return dd;
    }
    public static void print(int n,int sortedIndex[],String ids[],String names[],float weights[],float heights[],float bims[]) {
		for(int i=0;i<n;i++)
		{
			System.out.print(ids[sortedIndex[i]]);
			System.out.print("\t");
			System.out.print(names[sortedIndex[i]]);
			System.out.print("\t");
			System.out.print(weights[sortedIndex[i]]);
			System.out.print("\t");
			System.out.print(heights[sortedIndex[i]]);
			System.out.print("\t");
			System.out.print(bims[sortedIndex[i]]);
			System.out.println(" ");
			
		}
	}
    public static int findStudent(Student num[],Student gennum[],int readidint[],int n,int m,int i) {
    	    System.out.println("请输入要查找的学生学号：");
    	    Scanner in = new Scanner(System.in);
    	    String id = in.nextLine();
      //	String id = textField.getText();
    	    int j=-1;
    	    for(int j1=0;j1<n;j1++) {
    	    	    if(id.equals(num[j1].id)) {
    	    	    	j=j1;
    	    	    }
    	    }
    	    for(int j2=0;j2<m;j2++) {
    	    	    if(id.equals(gennum[j2].id)) {
    	    	    j=j2+n;
    	    	    }
    	    }
    	    for(int j3=0;j3<i;j3++) {
    	    	    if(Integer.parseInt(id)==readidint[j3]) {
    	    	    	j=j3+n+m;
    	    	    }
    	    }
    	    	return j;
    }
    public static void deleteStudent(Student num[],Student gennum[],String[] readid,int readidint[],int n,int m,int i) {
    	    System.out.println("请输入要删除的学生学号：");
    	    Student empty = new Student();
    	    empty.id="";
    	    empty.name="";
    	    empty.weight=0;
    	    empty.height=0;
    	    empty.bmi=0;
    	    Scanner in = new Scanner(System.in);
    	    String id = in.nextLine();
    	    for(int j1=0;j1<n;j1++) {
    	      	if(id.equals(num[j1].id)) {
	    	    	num[j1]=empty;
	    	    }
	    }
    	    for(int j2=0;j2<m;j2++) {
    	    	    if(id.equals(gennum[j2].id)) {
	        gennum[j2]=empty;
	    	    }
	    }
    	    for(int j3=0;j3<i;j3++) {
	    	    if(Integer.parseInt(id)==readidint[j3]) {
	    	    	readid[j3]="";
	    	    }
	    }
    }
    public static void printstudent(Student num[],Student gennum[],String[] readid,int n,int m,int i) {
    	    for(int n1=0;n1<n;n1++) {
    	    	    System.out.println(""+num[n1].id+" "+num[n1].name+" "+num[n1].weight+" "+num[n1].height+" "+num[n1].bmi);
    	    }
    	    for(int m1=0;m1<m;m1++) {
    	    	    System.out.println(""+gennum[m1].id+" "+gennum[m1].name+" "+gennum[m1].weight+" "+gennum[m1].height+" "+gennum[m1].bmi);
    	    }
    	    for(int i1=0;i1<i;i1++) {
    	    	    System.out.println(readid[i1]);
    	    }
    }
    public static void modifyStudent(Student num[],Student gennum[],String[] readid,int readidint[],int n,int m,int i) {
       	Scanner in = new Scanner(System.in);
        System.out.println("请输入要更改的学生学号：");
        String id = in.nextLine();
        int j=-1;
	    for(int j1=0;j1<n;j1++) {
	    	    if(id.equals(num[j1].id)) {
	    	    	j=j1;
	    	    }
	    }
	    for(int j2=0;j2<m;j2++) {
	    	    if(id.equals(gennum[j2].id)) {
	    	    j=j2+n;
	    	    }
	    }
	    for(int j3=0;j3<i;j3++) {
	    	    if(Integer.parseInt(id)==readidint[j3]) {
	    	    	j=j3+n+m;
	    	    }
	    }
	    if(j==-1) {
			System.out.println("该学生不在名单内。");
		}
		else if(j<n) {
			System.out.println("要修改：姓名--1；身高--2；体重--3。");
			int input = in.nextInt();
			if(input==1) {
				System.out.println("要修改成为：");	
				String name0 = in.nextLine();
				num[j].name=name0;
			}
			else if(input==2) {
				System.out.println("要修改成为：");	
				float height0 = in.nextFloat();
				num[j].height=height0;
				num[j].bmi=num[j].weight/(num[j].height*num[j].height);
			}
			else if(input==3) {
				System.out.println("要修改成为：");	
				float weight0 = in.nextFloat();
				num[j].weight=weight0;
				num[j].bmi=num[j].weight/(num[j].height*num[j].height);
			}
		}
		else if(j>=n&&j<m+n) {
			j=j-n;
			System.out.println("要修改：姓名--1；身高--2；体重--3。");
			int input = in.nextInt();
			if(input==1) {
				System.out.println("要修改成为：");	
				String name0 = in.nextLine();
				gennum[j].name=name0;
			}
			else if(input==2) {
				System.out.println("要修改成为：");	
				float height0 = in.nextFloat();
				gennum[j].height=height0;
				gennum[j].bmi=gennum[j].weight/(gennum[j].height*gennum[j].height);
			}
			else if(input==3) {
				System.out.println("要修改成为：");	
				float weight0 = in.nextFloat();
				gennum[j].weight=weight0;
				gennum[j].bmi=gennum[j].weight/(gennum[j].height*gennum[j].height);
			}
		}
		else {
			j=j-n-m;
			System.out.println("请输入更改后的这一行数据：");
			String a = new String();
			a=in.nextLine();
			readid[j]=a;
		}
    }
    

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_7;
	private JTextField textField_8;
	protected Student[] gennum=new Student[100];
	Student stu = new Student();
    //protected Student[] gennum = new Student[10];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Student[] gennum = new Student[10];
		for(int k=0;k<10;k++)
		{
			gennum[k] = genStudent();
		}
		/*int[] stu = new int[100];
		for(int k1=0;k1<10;k1++) {
			int[k1]=gennum[k1];
			stu.id = gennum[k1].id;
			stu.name=gennum[k1].name;
			stu.weight=gennum[k1].weight;
			stu.height=gennum[k1].height;
			stu.bmi=gennum[k1].bmi;
			//Students.add(stu);
		}*/
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OOBMI frame = new OOBMI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		//this.students=new ArrayList<student>();
	}

	/**
	 * Create the frame.
	 */
	
	/*class Frameinputok extends JFrame{
		public void Createframeinputok() {
			JFrame jf = new JFrame();
			Container container = jf.getContentPane();
			container.setBackground(Color.WHITE);
			jf.setVisible(true);
			jf.setSize(400, 300);
			jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			
			JPanel panel_6 = new JPanel();
			panel_6.setBounds(0, 0, 444, 141);
			container.add(panel_6);
			
			JLabel label_3 = new JLabel("输入成功！");
			panel_6.add(label_3);
			
		}
	}*/
	
	class Frameinput extends JFrame{
		public void Createframeinput(Student input[]) {
			JFrame jf = new JFrame();
			int k=0;
			Container container = jf.getContentPane();
			container.setBackground(Color.WHITE);
			jf.setVisible(true);
			jf.setSize(400, 300);
			jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			
			JPanel panel_4 = new JPanel();
			panel_4.setBounds(0, 0, 444, 141);
			container.add(panel_4);
			
			JLabel label_3 = new JLabel("学号");
			panel_4.add(label_3);
			
			textField_3 = new JTextField();
			panel_4.add(textField_3);
			textField_3.setColumns(10);
			
			JLabel label_5 = new JLabel("姓名");
			panel_4.add(label_5);
			
			textField_4 = new JTextField();
			panel_4.add(textField_4);
			textField_4.setColumns(10);
			
			/*JPanel panel_5 = new JPanel();
			panel_5.setBounds(0, 500, 444, 134);
			container.add(panel_5);*/
			
			JLabel label_8 = new JLabel("身高");
			panel_4.add(label_8);
			
			textField_7 = new JTextField();
			textField_7.setText("");
			panel_4.add(textField_7);
			textField_7.setColumns(10);
			
			JLabel label_7 = new JLabel("体重");
			panel_4.add(label_7);
			
			textField_8 = new JTextField();
			panel_4.add(textField_8);
			textField_8.setColumns(10);
			
			
			JButton btnok = new JButton("ok");
			btnok.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Student students=new Student();
					String idinput=textField_3.getText();
					String nameinput=textField_4.getText();
					String weightinput1=textField_7.getText();
					String heightinput1=textField_8.getText();
					float weightinput = Float.parseFloat(weightinput1);
					float heightinput = Float.parseFloat(heightinput1);
					students.id=idinput;
					students.name=nameinput;
					students.weight=weightinput;
					students.height=heightinput;
					//new inputdialog(Frameinput.this).setVisible(true);
					//new Frameinputok().Createframeinputok();
					JFrame jf = new JFrame();
					Container container = jf.getContentPane();
					container.setBackground(Color.WHITE);
					jf.setVisible(true);
					jf.setSize(400, 300);
					jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
					
					JPanel panel_6 = new JPanel();
					panel_6.setBounds(0, 0, 444, 141);
					container.add(panel_6);
					
					JLabel label_3 = new JLabel("输入成功！");
					panel_6.add(label_3);
				}
			});
			panel_4.add(btnok);
			
			
			
		}
	}
	public OOBMI() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel_3 = new Panel();
		panel_3.setBounds(6, 51, 438, 48);
		contentPane.add(panel_3);
		
		JLabel label_4 = new JLabel("");
		panel_3.add(label_4);
		
		JButton button_2 = new JButton("信息删除");
		panel_3.add(button_2);
		
		JButton btnBmi = new JButton("BMI统计");
		panel_3.add(btnBmi);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 438, 39);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("信息输入");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//new Frameinput().Createframeinput();
			}
		});
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("信息修改");
		panel.add(btnNewButton_1);
		
		Panel panel_1 = new Panel();
		panel_1.setBounds(6, 169, 438, 39);
		contentPane.add(panel_1);
		
		JLabel label = new JLabel("学号");
		panel_1.add(label);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		String id = textField_1.getText();
		JButton button = new JButton("确认");
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame jf = new JFrame();
				Container container = jf.getContentPane();
				container.setBackground(Color.WHITE);
				jf.setVisible(true);
				jf.setSize(400, 300);
				jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				JPanel panel_11 = new JPanel();
				panel_11.setBounds(0, 0, 444, 141);
				container.add(panel_11);
				
				/*int mm=0;
				for(int m=0;m<10;m++) {
					if(id.equals(gennum[m].id)) {
						mm=1;
					}
				if(mm==0) {*/
					
					JLabel label_11 = new JLabel("该学生不存在");
					panel_11.add(label_11);
				/*}
				else
				{
					JLabel label_11 = new JLabel("该学生存在");
					panel_11.add(label_11);
				}
				}*/
			}
		});
		panel_1.add(button);
		
		
		Panel panel_2 = new Panel();
		panel_2.setBounds(6, 212, 438, 45);
		contentPane.add(panel_2);
		
		JLabel label_1 = new JLabel("姓名");
		panel_2.add(label_1);
		
		textField_2 = new JTextField();
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JButton button_1 = new JButton("确认");
		panel_2.add(button_1);
		
		JLabel label_2 = new JLabel("欢迎使用学生信息查询系统");
		label_2.setBounds(149, 125, 165, 16);
		contentPane.add(label_2);
		
		
		
		
		
	}
}
