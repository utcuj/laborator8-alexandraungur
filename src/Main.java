
public class Main {

	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub
		
		Masina m=new Masina("Volkswagen", "black");
		Student s= new Student("Ungur","Alexandra",m);
		
		
		Student s_clone = (Student)s.clone();
		System.out.println(s_clone.toString());    //clona
		s_clone.getMasinaa().setCuloare("white");  
		System.out.println(s_clone.toString());	  //clona dupa schimbarea culorii masinii
		System.out.println(s.toString());        //student original - culoarea schimbata la shallow clone
												//                  - culoare neschimbata la deep clone
		
	}

}
