package edu.hit1160300211.experiment4;
import java.util.*;
import java.io.*; 
public class swingBMI {
	public static class Student{
		private String id;
		private String name;
		private float height;
		private float weight;
		private float bmi;
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
			this.bmi = bmi;
		}
		public void inputStudent() {
			// TODO Auto-generated method stub
			
		}
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
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Student[] num = new Student[100];
		Student students = new Student();
		int n=0;
		System.out.println("如果要随机生成学生信息，请输入学生数：");
		int m = in.nextInt();
		Student[] gennum = new Student[m+1];
		for(int k=0;k<m;k++)
		{
			students = genStudent();
			gennum[k]=students;
			System.out.println("学号："+gennum[k].id+", 姓名:"+gennum[k].name+", 身高:"+gennum[k].height+"米, 体重:"+gennum[k].weight+"公斤， BMI:"+gennum[k].bmi+"。");
		}
		System.out.println("输入学生信息吗?是--1,不是--2。");
		int a=in.nextInt();
		while(a==1)
		{
			num[n] = inputStudent();
			boolean x =isExists(num[n].id,num,gennum,n,m);
			if(x==false)
			{
				a=in.nextInt();
				n++;
			}
			else
			{
				System.out.println("该学生已经在名单中。");
			}
			System.out.println("输入学生信息吗?是--1,不是--2。");
			a=in.nextInt();
		}
		System.out.println("学生总人数为："+(n+m)+"人。");
		System.out.println("请输入需要判断的学生学号：");
		int b=in.nextInt();
		Integer bb = new Integer(b);
		boolean r = isExists(bb.toString(),num,gennum,n,m);
		if(r==true)
		{
			System.out.println("该学生已在名单中。");
		}
		else
		{
			System.out.println("该学生不在名单中。");
		}
		String arrid[]=new String[m+n];
		String arrname[]=new String[m+n];
		float arrweight[]=new float[m+n];
		float arrheight[]=new float[m+n];
		float arrbmi[]=new float[m+n];
		for(int k2=0;k2<n;k2++) {
			arrid[k2]=num[k2].id;
		}
		for(int k3=0;k3<m;k3++) {
		    arrid[n+k3]=gennum[k3].id;	
		}
		for(int k4=0;k4<n;k4++) {
			arrname[k4]=num[k4].name;
		}
		for(int k5=0;k5<m;k5++) {
		    arrname[n+k5]=gennum[k5].name;	
		}
		for(int k6=0;k6<n;k6++) {
			arrweight[k6]=num[k6].weight;
		}
		for(int k7=0;k7<m;k7++) {
		    arrweight[n+k7]=gennum[k7].weight;	
		}
		for(int k8=0;k8<n;k8++) {
			arrheight[k8]=num[k8].height;
		}
		for(int k9=0;k9<m;k9++) {
		    arrheight[n+k9]=gennum[k9].height;	
		}
		for(int k=0;k<n;k++) {
			arrbmi[k]=num[k].bmi;
		}
		for(int k1=0;k1<m;k1++) {
		    arrbmi[n+k1]=gennum[k1].bmi;	
		}
		int Index[]=new int[m+n];
		System.out.println("这些学生的BMI指数的平均数为"+bmiAverage(arrbmi,m+n));
		System.out.println("这些学生的BMI指数的中值为"+bmiMiddle(arrbmi,Index,m+n));
		System.out.println("这些学生的BMI指数的众数为"+bmiMode(arrbmi,m+n));
		System.out.println("这些学生的BMI指数的方差为"+bmiD(arrbmi,m+n,bmiAverage(arrbmi,m+n)));
	    System.out.println("请选择排序方式");
		System.out.println("按学号排序--1");
		System.out.println("按姓名排序--2");
		System.out.println("按身高排序--3");
		System.out.println("按体重排序--4");
		System.out.println("按BMI指数排序--5");
		int a1 = in.nextInt();
		if(a1==1)
			Sortbyid(n+m,Index,arrid);
		else if(a1==2)
			Sortbyname(n+m,Index,arrname);
		else if(a1==3)
			Sortbyweight(n+m,Index,arrweight);
		else if(a1==4)
			Sortbyheight(n+m,Index,arrheight);
		else if(a1==5)
			Sortbybim(n+m,Index,arrbmi);
		else
			System.out.println("输入不正确。");
		print(n+m,Index,arrid,arrname,arrweight,arrheight,arrbmi);
		File file =new File("BMI.txt");
		try{
			FileWriter out = new FileWriter(file);
		for(int i1=0;i1<n;i1++){ 
			out.write(num[i1].id+"\t"+num[i1].name+"\t"+num[i1].weight+"\t"+num[i1].height+"\t"+num[i1].bmi);
			out.write("\r\n");  
		    }  
		for(int j1=0;j1<m;j1++){ 
			out.write(gennum[j1].id+"\t"+gennum[j1].name+"\t"+gennum[j1].weight+"\t"+gennum[j1].height+"\t"+gennum[j1].bmi);  
			out.write("\r\n");  
		    } 
			  out.close();  
			  }catch(Exception e) {
				  e.printStackTrace();
			  }
		System.out.println("该数据已存入名为BMI.txt的文件里。");
		System.out.println("是否要从名为BMI.txt的文件里导入数据？是--1，否--2");
		int x1=in.nextInt();
		String[] read = new String[100]; 
		int i=0;
		if(x1==1) {
			try {
				FileReader fr = new FileReader(file);
			    BufferedReader bufr = new BufferedReader(fr);
			    String s=null;
			    while((s=bufr.readLine())!=null) {
			    	read[i]=s;
			    	i++;
			    	System.out.println(s);
			    }
			    bufr.close();
		        fr.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		String[] readid = new String[100];
		for(int ix=0;ix<i;ix++) {
			readid[ix]=read[ix].substring(0,2);
		}
		int[] readidint = new int[100];
		for(int ix=0;ix<i;i++) {
			readidint[ix]=Integer.parseInt(readid[ix]);
		}
		int idfind=findStudent(num,gennum,readidint,n,m,i);
		if(idfind==-1) {
			System.out.println("该学生不在名单内。");
		}
		else if(idfind<n) {
			System.out.print(num[idfind].id);
			System.out.print("\t");
			System.out.print(num[idfind].name);
			System.out.print("\t");
			System.out.print(num[idfind].weight);
			System.out.print("\t");
			System.out.print(num[idfind].height);
			System.out.print("\t");
			System.out.print(num[idfind].bmi);
			System.out.println(" ");
		}
		else if(idfind>=n&&idfind<m+n) {
			idfind=idfind-n;
			System.out.print(gennum[idfind].id);
			System.out.print("\t");
			System.out.print(gennum[idfind].name);
			System.out.print("\t");
			System.out.print(gennum[idfind].weight);
			System.out.print("\t");
			System.out.print(gennum[idfind].height);
			System.out.print("\t");
			System.out.print(gennum[idfind].bmi);
			System.out.println(" ");
		}
		else {
			idfind=idfind-n-m;
			System.out.println(read[idfind]);
		}
		System.out.println("有要删除的学生吗？是--1；否--2.");
		int input = in.nextInt();
		if(input==1) {
			deleteStudent(num,gennum,readid,readidint,n,m,i);
		}
		printstudent(num,gennum,readid,n,m,i);
		System.out.println("有要更改的学生吗？是--1；否--2.");
		int input3 = in.nextInt();
		if(input3==1) {
			modifyStudent(num,gennum,readid,readidint,n,m,i);
		}
		printstudent(num,gennum,readid,n,m,i);
		System.out.println("有要增加的学生吗？是--1；否--2.");
		Student addstudent = new Student();
		int input2 = in.nextInt();
		if(input2==1) {
			addstudent=inputStudent();
		}
		printstudent(num,gennum,readid,n,m,i);
		System.out.println(""+addstudent.id+" "+addstudent.name+" "+addstudent.weight+" "+addstudent.height+" "+addstudent.bmi);
		try{
			FileWriter out = new FileWriter(file);
		for(int i1=0;i1<n;i1++){ 
			out.write(num[i1].id+"\t"+num[i1].name+"\t"+num[i1].weight+"\t"+num[i1].height+"\t"+num[i1].bmi);
			out.write("\r\n");  
		    }  
		for(int j1=0;j1<m;j1++){ 
			out.write(gennum[j1].id+"\t"+gennum[j1].name+"\t"+gennum[j1].weight+"\t"+gennum[j1].height+"\t"+gennum[j1].bmi);  
			out.write("\r\n");  
		    } 
		out.write(addstudent.id+"\t"+addstudent.name+"\t"+addstudent.weight+"\t"+addstudent.height+"\t"+addstudent.bmi);  
		out.write("\r\n");  
			  out.close();  
			  }catch(Exception e) {
				  e.printStackTrace();
			  }
		System.out.println("该数据已重新存入名为BMI.txt的文件里。");
	}
}