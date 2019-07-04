public class Person{
	
	static int counter = 0;
	String firstName = "amer";
	String LastName = "alkharashgah";
	String address = "";
	String dateofBirth = "";
	String nationality = "";
	private String city = "";
	int weight = 0;
	String height = "";
	Boolean ismale = false; 
	
	public  Person(){
		
		counter=counter+1;
		
	}
   
	public Person(int c,String f,String L,String add,String d,String n,String city,int w,String h,Boolean is){
		
	counter= counter+1;
	this.firstName=f;
	this.LastName=L;
	this.address= add;
	this.dateofBirth=d;
	this.nationality=n;
	this.city= city;
	this.weight=w;
	this.height=h;
	this.ismale=is;
	
		
	}
	public void getfullname(){
		
		System.out.println(this.firstName+" "+this.LastName);
			
		}
	public void getHeightInFeet(){
		
		System.out.println(this.height);
			
		}
	public void getAge(){
		
		System.out.println("age is ");
			
		}
	public void eating(){
		
		this.weight++;
			
		}
public void getcounter(){
		
	System.out.println(counter);
			
		}

	public void getInfo(){
		
		System.out.println(this.counter);
		System.out.println(this.firstName);
		System.out.println(this.LastName);
		System.out.println(this.address);
		System.out.println(this.dateofBirth);
		System.out.println(this.nationality);
		System.out.println(this.weight);
		System.out.println(this.height);
		System.out.println(this.ismale);

		
			
		}
	

	public static void main(String[] args) {
		
			Person c = new Person(1,"qusay","zunaimat","deralla","fdf","dsffdsg","dsf",444,"ghgf",true);
			c.getcounter();
			Person d = new Person();
			d.getcounter();
			Person a[]=new Person[4];
			a[0]= new Person(1,"qusay1","zunaimat","deralla","fdf","dsffdsg","dsf",444,"ghgf",true); 
			a[1]= new Person(1,"qusay2","zunaimat","deralla","fdf","dsffdsg","dsf",444,"ghgf",true); 
			a[2]= new Person(1,"Amer","Kharashgah","deralla","fdf","dsffdsg","dsf",444,"ghgf",true); 
			a[3]= new Person(1,"Amer","KHarashgah","deralla","fdf","dsffdsg","dsf",444,"ghgf",true); 
		
	}

	
}