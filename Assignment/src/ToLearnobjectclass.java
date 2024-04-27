import java.util.Objects;

public class ToLearnobjectclass {

	
	int score;
	String batsmanname;
	String Umpirename;
	ToLearnobjectclass(int score,String batsmanname,String Umpirename)
	{
		this.score=score;
		this.batsmanname=batsmanname;
		this.Umpirename=Umpirename;
	}
	
	@Override
		public boolean equals(Object obj)
		{
			ToLearnobjectclass to=(ToLearnobjectclass)obj;
			return this.batsmanname== to.batsmanname&& this.score== to.score&&this.Umpirename== to.Umpirename;
			
		}
	public int hashCode()
	{
		return Objects.hash(score,batsmanname,Umpirename);
	}
		
		
		public static void main(String[] args) {
			ToLearnobjectclass toi=new ToLearnobjectclass(121,"Virat kohli","Nitin Menon");
			ToLearnobjectclass to1=new ToLearnobjectclass(120,"Virat kohli","Nitin Menon");
			ToLearnobjectclass to2=to1;
			System.out.println(to1.toString());
			System.out.println(toi.toString());
			System.out.println(toi.equals(to1));
			System.out.println(toi.batsmanname);
			System.out.println(to1);
			System.out.println(toi.hashCode());
			System.out.println(to1.hashCode());
			System.out.println(to2.hashCode());
			
			
		}
	}
